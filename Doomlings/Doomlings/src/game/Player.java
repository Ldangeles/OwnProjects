package game;

import cards.AbstractCard;
import cards.EffectlessTraitCard;
import cards.TraitType;
import hands.Hand;

public class Player {
    private String username;
    private Hand hand;
    private Hand traitPile;
    private int genePool;
    private int turnNumber;

    public Player(int turnNumber, String username) {
        this.username = username;
        this.hand = new Hand();
        this.traitPile = new Hand();
        this.genePool=5;
        this.turnNumber = turnNumber;
    }

    public void playTrait(AbstractCard trait){ //Elaborate HERE

        if (trait.getTraitType() == TraitType.EFFECTLESS){
            hand.giveTrait(trait,traitPile);
        }

        if(trait.getTraitType() == TraitType.ACTION){
            trait.getActions();
        }
    }

    public void giveTrait(AbstractCard trait, Player toWhom){
        hand.giveTrait(trait,toWhom.hand);
    }

    public Hand getHand(){
        return hand;
    }
    public String getUsername() {
        return username;
    }
    public Hand getTraitPile() {
        return traitPile;
    }
    public int getGenePool() {
        return genePool;
    }
    public int getTurnNumber() {
        return turnNumber;
    }
}
