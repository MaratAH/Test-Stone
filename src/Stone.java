public class Stone {
    public int weight;
    public String color;

    public Stone(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public void printWeight() {
        System.out.println("Вес камня = " + weight);
        System.out.println("Цвет камня: " + color);
    }
    public static void main(String[] args) {
        Stone stone = new Stone(34, "red");
        stone.printWeight();

    }
}
