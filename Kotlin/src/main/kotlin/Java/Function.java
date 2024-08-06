package Java;

public class Function {
    public static void main(String[] args) {
        int price1 = 100;
        int price2 = 200;
        int price3 = sumPirce(price1, price2);

        System.out.println(price3);
    }

    public static int sumPirce(int price1, int price2){
        int price = price1 + price2;
        return price;
    }
}
