package Java;

public class Interface {
    public static void main(String[] args) {
        Item1 item = new Item1("연필", 1000);
        System.out.println("This name is " + item.name + ", " +
                "price is " + item.price);

        item.buy();
        item.sell();
    }
}
class Item1 implements ItemTrade {
    String name;
    int price;

    public Item1(String name, int price){
        this.name=name;
        this.price=price;
    }

    @Override
    public void buy() {
        System.out.println("[buy] " + name);
    }

    @Override
    public void sell() {
        System.out.println("[sell] " + name);
    }
}

interface ItemTrade{
    public void buy();
    public void sell();
}
