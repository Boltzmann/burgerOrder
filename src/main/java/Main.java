public class Main {

    public static void main(String[] args) {
        OrderSystem orderOne = new OrderSystem();
        Menue noOne = new Menue("Hamburger", 5.99);
        orderOne.addMenue(1, noOne);
        System.out.println(orderOne.showMenues());

        orderOne.placeOrder();
    }
}
