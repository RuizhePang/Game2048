package Week09;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("JAVA");
        books[1] = new Book("C++");
        books[2] = new Book("Python");
        books[3] = new Book("JAVAScript");
        books[4] = new Book("C#");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please select operation: " +
                            "1. Borrow. 2. Return. 3. Overdue. 0. To Stop the process");
            int op = sc.nextInt();
            if (op == 0)
                break;
            switch (op) {
                case 1:
                    borrowBook(sc, books);
                    break;
                case 2:
                    returnBook(sc, books);
                    break;
                case 3:
                    overdueAll(books);
                    break;
            }
        }
    }
    public static void borrowBook(Scanner sc,Book[] books){

    }
    public static void returnBook(Scanner sc,Book[] books){

    }
    public static void overdueAll(Book[] books){

    }
}
