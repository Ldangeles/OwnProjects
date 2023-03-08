import hands.Deck;
import hands.DiscardPile;
import hands.Hand;

import java.util.HashSet;
import java.util.Set;

public class Doomlings {

    public static void main(String[] args) {

        Set<String> nicknameSet = new HashSet<>();

        Hand h1, h2;
        DiscardPile discardPile;
        Deck deck;
        h1 = new Hand();
        h2 = new Hand();
        discardPile = new DiscardPile();
        deck = new Deck();

        deck.populate();
        deck.shuffle();

        System.out.println(deck.showTraits()+"\n\n");

        deck.deal(h1,h2,5);


        System.out.println("Hand 1 is:" + h1.showTraits());
        System.out.println("Hand 2 is:" + h2.showTraits());



        System.out.println("Discard Pile is now:" + discardPile.getTraits().toString());

        System.out.println("\n\n"+deck.showTraits());

    }
}