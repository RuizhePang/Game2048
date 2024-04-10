package Week06;

import java.util.Scanner;

public class OJ03New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] filed = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                filed[i][j] = sc.nextInt();
            }
        }
        int start = sc.nextInt();
        int totalSteps = sc.nextInt();
        int rowOfNow = 0;
        int colOfNow = 0;
        int steps = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (filed[i][j] == start) {
                    rowOfNow = i;
                    colOfNow = j;
                    break;
                }
            }
        }
        Person p = new Person(rowOfNow, colOfNow, 0);
        for (int i = 0; i < totalSteps; ) {
            for (int j = 0; j < steps; j++) {
                p.walk();
                if(isInTheFiled(rowOfNow,colOfNow,row,col)){
                    i++;
                }
            }
            p.changeDirection();
            if(p.getIndex()==2||p.getIndex()==0){
                steps++;
            }
        }
        System.out.println(filed[p.getI()][p.getJ()]);
    }

    public static boolean isInTheFiled(int rowOfNow, int colOfNow, int row, int col) {
        return rowOfNow <= row && colOfNow <= col;
    }
}

class Person {
    private int i;
    private int j;
    private int index = 0;
    Direction[] directions = new Direction[4];

    public Person() {
    }

    public Person(int i, int j, int index) {
        this.i = i;
        this.j = j;
        this.index = index;
        directions[0] = new Direction(new int[]{1, 0});
        directions[1] = new Direction(new int[]{0, 1});
        directions[2] = new Direction(new int[]{-1, 0});
        directions[3] = new Direction(new int[]{0, -1});
    }

    public void changeDirection() {
        index++;
        if (index == 4) {
            index = 0;
        }
    }

    public void walk() {
        this.i += directions[index].getIChange();
        this.j += directions[index].getJChange();
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getIndex() {
        return index;
    }
}

class Direction {
    private int iChange;
    private int jChange;

    public Direction(int[] change) {
        this.iChange = change[0];
        this.jChange = change[1];
    }

    public int getIChange() {
        return iChange;
    }

    public int getJChange() {
        return jChange;
    }
}

