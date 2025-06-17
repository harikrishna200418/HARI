import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add("Virat");
        players.add("Kohli");
        players.add("KLRahul");
        players.add("Iyer");
        players.add("Ponting");

        for (String player : players) {
            System.out.println(player);
        }
    }
}
