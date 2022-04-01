import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderSystem {

    public Map<Integer, Menue> food = new HashMap<>();

    public boolean addMenue(int key, Menue menue) {
        return food.put(key, menue) == null;
    }

    public Menue getOrderById(int key) {
        System.out.println("Folgendes Menue wurde ausgewählt: " + food.get(key));
        return food.get(key);
    }

    public void placeOrder() {
        //showMenues();
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
        getOrderById(key);
    }

    public String showMenues() {
        String menueList = "";
        for(int key : food.keySet()) {
            menueList += "Key: " + key + " " + food.get(key);
        }
        return menueList;
    }


}
