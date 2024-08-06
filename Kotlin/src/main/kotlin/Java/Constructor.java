package Java;

public class Constructor {
    public static void main(String[] args) {
        Item item = new Item("연필", 1000);
        System.out.println("This name is " + item.name + ", " +
                "price is " + item.price);
    }
}
class Item{
    String name;
    int price;

    public Item(String name, int price){
        this.name=name;
        this.price=price;
    }
}