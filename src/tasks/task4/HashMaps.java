package tasks.task4;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        ArrayList<String> friendsList = new ArrayList<String>();
        friendsList.add("Vidik");
        friendsList.add("Bakalov");
        friendsList.add("Leonov");
        friendsList.add("Ivashura");
        friendsList.add("Sasha");

        HashMap<Integer, String> friendsMap = new HashMap<Integer, String>();

        for (int i = 0; i <= friendsList.size(); i++) {
            String name = friendsList.get(i);
            int index = friendsList.indexOf(name);
            friendsMap.put(index, name);
        }

        for (int i = 0; i <= friendsMap.size(); i++) {
            System.out.println(friendsMap.get(i));
        }
    }
}
