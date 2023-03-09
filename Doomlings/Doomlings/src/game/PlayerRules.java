package game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PlayerRules {

    private Map<Integer, String> usernameSet = new HashMap<>();
    private ArrayList<Player> players = new ArrayList<>();

    public PlayerRules() {

    }

    public void createPlayers(String username1, String username2) throws Exception {
        int numberOfPlayers = 2;
        usernameSet.put(1,username1);

        if(!usernameSet.containsValue(username2)){
            usernameSet.put(2,username2);
        } else {
            throw new Exception("");
        }

        players.add(new Player(1,usernameSet.get(1)));
        players.add(new Player(2,usernameSet.get(2)));
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

    @Override
    public String toString() {
        return "PlayerRules{" +
                "usernameSet=" + usernameSet +
                '}';
    }
}
