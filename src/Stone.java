public class Stone {
    int weight;
    String color;
    int facetsOfStone;

    public Stone(int weight, String color, int facetsOfStone) {
        this.weight = weight;
        this.color = color;
        this.facetsOfStone= facetsOfStone;
    }

    public void printWeight() {
        System.out.println("Вес камня = " + weight);
        System.out.println("Цвет камня: " + color);
        System.out.println("Количество граней камня = " + facetsOfStone);
    }
    public static void main(String[] args) {
        Stone stone = new Stone(34, "red", 42);
        stone.printWeight();

    }
}
