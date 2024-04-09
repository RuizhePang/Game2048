package Week07;

public class Person {
    private int i;
    private int j;
    private int index;
    Direction[] directions = new Direction[8];

    public Person() {
        directions[0] = new Direction(new int[]{0, 1});
        directions[1] = new Direction(new int[]{-1, 1});
        directions[2] = new Direction(new int[]{-1, 0});
        directions[3] = new Direction(new int[]{-1, -1});
        directions[4] = new Direction(new int[]{0, -1});
        directions[5] = new Direction(new int[]{1, -1});
        directions[6] = new Direction(new int[]{1, 0});
        directions[7] = new Direction(new int[]{1, 1});
    }

    public Person(int i, int j, int index) {
        this.i = i;
        this.j = j;
        this.index = index;
        directions[0] = new Direction(new int[]{0, 1});
        directions[1] = new Direction(new int[]{-1, 1});
        directions[2] = new Direction(new int[]{-1, 0});
        directions[3] = new Direction(new int[]{-1, -1});
        directions[4] = new Direction(new int[]{0, -1});
        directions[5] = new Direction(new int[]{1, -1});
        directions[6] = new Direction(new int[]{1, 0});
        directions[7] = new Direction(new int[]{1, 1});
    }

    public void walk(int step) {
        this.i = this.i + step * directions[this.index].getIChange();
        this.j = this.j + step * directions[this.index].getJChange();
    }

    public void changeDirection() {
        this.index++;
        if (this.index == 8) {
            this.index = 0;
        }
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}

class Direction {
    private int iChange;
    private int jChange;

    public Direction(int[] move) {
        this.iChange = move[0];
        this.jChange = move[1];
    }

    public int getIChange() {
        return this.iChange;
    }

    public int getJChange() {
        return this.jChange;
    }
}

