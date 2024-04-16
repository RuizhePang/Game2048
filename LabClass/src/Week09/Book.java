package Week09;

public class Book {
    private int id;
    private String name;
    private BookStatus status;
    private static int count;

    public Book() {
        this(null);
    }

    public Book(String name) {
        this.name = name;
        //this.status = status;
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Book.count = count;
    }
}
