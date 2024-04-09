package Week06;

public class Food {
    private int id;
    private String name;
    private String type;
    private int size;
    private double price;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void getMenu() {
        System.out.printf("%s %s: (%d Inches) %.2f $\n", this.type, this.name, this.size, this.price * 10);
    }
}
