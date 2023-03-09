import game.Player;
import game.PlayerRules;
import hands.Deck;
import hands.DiscardPile;
import hands.Hand;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Doomlings {

    public static void main(String[] args) {

        PlayerRules playerRules = new PlayerRules();

        try{
            playerRules.createPlayers("Leo","Dan");
        } catch (Exception ex) {
            System.out.println("Username already exists");
            return;
        }

        DiscardPile discardPile;
        Deck deck;
        discardPile = new DiscardPile();
        deck = new Deck();

        deck.populate();
        deck.shuffle();

        //System.out.println(deck.showTraits()+"\n\n");

        ArrayList<Player> players = playerRules.getPlayers();

        for(Player player: players){
            deck.deal(player.getHand(),5);
        }

        for(Player player: players) {
            System.out.println("Player "+player.getTurnNumber()+" hand is:" +player.getHand().showTraits());
        }

        Player player1 = players.get(0);
        Player player2 = players.get(1);
        player1.playTrait(player1.getHand().getTraits().get(0));

        discardPile.discardSingle(player1.getHand().getTraits().get(0),player1.getHand());
        player1.giveTrait(player1.getHand().getTraits().get(0),player2);

        System.out.println("Discard Pile is:" + discardPile.getTraits().toString()+"\n");

        for(Player player: players) {
            System.out.println("Player "+player.getTurnNumber()+" hand is now:" +player.getHand().showTraits());
        }

        //System.out.println("\n\n"+deck.showTraits());

    }
}