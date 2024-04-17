package Week08;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CourseManager {
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private boolean ifOpen;


    public CourseManager() {
        courses = new ArrayList<>();
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setIfOpen(boolean ifOpen) {
        this.ifOpen = ifOpen;
    }

    public boolean getIfOpen() {
        return this.ifOpen;
    }

    public void addStudent(Student student) {
        this.students.add(student);
        student.setCourseManager(this);
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.setCourseManager(this);
    }

    public boolean enrollStudentInCourse(Student student, String courseId, int credits) {
        boolean ifValid = false;


        boolean ifTheCourseExist = false;
        int whichCourse = 0;
        for (int i = 0; i < this.courses.size(); i++) {
            if (courseId.equals(this.courses.get(i).getCourseID())) {
                whichCourse = i;
                ifTheCourseExist = true;
                break;
            }
        }
        Course theCourse = this.courses.get(whichCourse);


        boolean ifEnrolled = false;
        for (int i = 0; i < theCourse.getEnrollStudent().size() && !ifEnrolled; i++) {
            if (student == theCourse.getEnrollStudent().get(i)) {
                ifEnrolled = true;
            }
        }

        boolean ifCreditsValid = credits > 0 && credits <= student.getCredits();


        ifValid = ifOpen && ifTheCourseExist && !ifEnrolled && ifCreditsValid;
        if (!ifValid) {
            return false;
        }


        student.getEnrollCourses().add(theCourse);
        student.setCredits(student.getCredits() - credits);
        theCourse.getEnrollStudent().add(student);
        theCourse.getCredits().add(credits);


        return true;
    }

    public boolean modifyStudentEnrollmentCredits(Student student, String courseId, int credits) {
        boolean ifValid = false;


        boolean ifTheCourseExist = false;
        int whichCourse = 0;
        for (int i = 0; i < this.courses.size(); i++) {
            if (courseId.equals(this.courses.get(i).getCourseID())) {
                whichCourse = i;
                ifTheCourseExist = true;
                break;
            }
        }
        Course theCourse = this.courses.get(whichCourse);


        boolean ifEnrolled = false;
        for (int i = 0; i < theCourse.getEnrollStudent().size() && !ifEnrolled; i++) {
            if (student == theCourse.getEnrollStudent().get(i)) {
                ifEnrolled = true;
            }
        }


        int lastCredits = 0;
        int index = 0;
        for (int i = 0; i < theCourse.getCredits().size(); i++) {
            if (student == theCourse.getEnrollStudent().get(i)) {
                lastCredits = theCourse.getCredits().get(i);
                index = i;
            }
        }


        boolean ifCreditsValid = credits > 0 && credits <= student.getCredits() + lastCredits;


        ifValid = ifOpen && ifTheCourseExist && ifEnrolled && ifCreditsValid;
        if (!ifValid) {
            return false;
        }


        student.setCredits(student.getCredits() + lastCredits - credits);
        theCourse.getCredits().set(index, credits);


        return true;
    }

    public boolean dropStudentEnrollmentCourse(Student student, String courseId) {
        boolean ifValid = false;


        boolean ifTheCourseExist = false;
        int whichCourse = 0;
        for (int i = 0; i < this.courses.size(); i++) {
            if (courseId.equals(this.courses.get(i).getCourseID())) {
                whichCourse = i;
                ifTheCourseExist = true;
                break;
            }
        }
        Course theCourse = this.courses.get(whichCourse);


        boolean ifEnrolled = false;
        for (int i = 0; i < theCourse.getEnrollStudent().size() && !ifEnrolled; i++) {
            if (student == theCourse.getEnrollStudent().get(i)) {
                ifEnrolled = true;
            }
        }

        ifValid = ifOpen && ifTheCourseExist && ifEnrolled;
        if (!ifValid) {
            return false;
        }


        int lastCredits = 0;
        int index = 0;
        for (int i = 0; i < theCourse.getCredits().size(); i++) {
            if (student == theCourse.getEnrollStudent().get(i)) {
                lastCredits = theCourse.getCredits().get(i);
                index = i;
            }
        }

        student.setCredits(student.getCredits() + lastCredits);
        theCourse.getCredits().set(index, 0);
        theCourse.getEnrollStudent().set(index, null);
        student.getEnrollCourses().remove(theCourse);
        return true;
    }

    public void finalizeEnrollments() {
        this.ifOpen = false;
        for (int i = 0; i < this.courses.size(); i++) {
            Course theCourse = this.courses.get(i);
            ArrayList<Integer> credits = new ArrayList<>();
            credits.addAll(theCourse.getCredits());
            Collections.sort(credits, Collections.reverseOrder());
            if (theCourse.getCredits().size() < theCourse.getMaxCapacity()) {
                int size = theCourse.getCredits().size();
                for (int j = 0; j <= theCourse.getMaxCapacity() - size; j++) {
                    theCourse.getCredits().add(-1);
                    credits.add(-1);
                }
            }
            for (int j = 0; j < theCourse.getMaxCapacity(); j++) {
                for (int k = 0; k < theCourse.getCredits().size(); k++) {
                    if (theCourse.getCredits().get(k) == credits.get(j) && theCourse.getCredits().get(k) != 0 && theCourse.getCredits().get(k) != -1) {
                        theCourse.getSuccessStudents().add(theCourse.getEnrollStudent().get(k));
                        theCourse.getEnrollStudent().get(k).getSuccessCourses().add(theCourse);
                    }
                }
            }
            if (theCourse.getSuccessStudents().size() > theCourse.getMaxCapacity()) {
                int size = theCourse.getCredits().size();
                for (int j = 0; j < size; j++) {
                    if (theCourse.getCredits().get(j) == credits.get(theCourse.getMaxCapacity() - 1)) {
                        theCourse.getSuccessStudents().remove(theCourse.getEnrollStudent().get(j));
                    }
                }
            }
            int size = theCourse.getCredits().size();
            for (int j = 0; j < size; j++) {
                theCourse.getCredits().remove(Integer.valueOf(-1));
            }
        }
    }

    public ArrayList<String> getEnrolledCoursesWithCredits(Student student) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < student.getEnrollCourses().size(); i++) {
            String information;
            String courseId = student.getEnrollCourses().get(i).getCourseID();
            int credit = getCredit(student, courseId);
            information = courseId + ": " + credit;
            strings.add(information);
        }
        return strings;
    }

    private int getCredit(Student student, String courseId) {
        int credit = 0;
        int index = 0;
        for (int j = 0; j < courses.size(); j++) {
            if (courseId.equals(courses.get(j).getCourseID())) {
                index = j;
                break;
            }
        }
        Course theCourse = courses.get(index);
        for (int j = 0; j < theCourse.getCredits().size(); j++) {
            if (student == theCourse.getEnrollStudent().get(j)) {
                credit = theCourse.getCredits().get(j);
            }
        }
        return credit;
    }
}
