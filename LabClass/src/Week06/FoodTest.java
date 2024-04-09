package Week06;

public class FoodTest {
    public static void main(String[] args) {
        Food[] foods = new Food[4];
        foods[0] = new Food();
        foods[0].setName("pizza");
        foods[0].setType("Seafood");
        foods[0].setSize(11);
        foods[0].setPrice(12);
        foods[1] = new Food();
        foods[1].setName("pizza");
        foods[1].setType("Beef");
        foods[1].setSize(9);
        foods[1].setPrice(10);
        foods[2] = new Food();
        foods[2].setName("fried rice");
        foods[2].setType("Seafood");
        foods[2].setSize(5);
        foods[2].setPrice(12);
        foods[3] = new Food();
        foods[3].setName("noodles");
        foods[3].setType("Beef");
        foods[3].setSize(6);
        foods[3].setPrice(14);
        for (int i = 0; i < 4; i++) {
            foods[i].getMenu();
        }
    }
}
