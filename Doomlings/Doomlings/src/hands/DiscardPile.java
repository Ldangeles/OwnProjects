package hands;

import cards.AbstractCard;

import java.util.ArrayList;

public class DiscardPile extends Hand{

    private ArrayList<AbstractCard> traits;

    public DiscardPile(){
        traits = new ArrayList<AbstractCard>();
    }
    public boolean discardSingle(AbstractCard abstractTrait, Hand fromWho){ //Discard a single trait to the Discard Pile
        if(!fromWho.getTraits().contains(abstractTrait)){
            return false;
        }
        else{
            fromWho.giveTrait(abstractTrait,this);
            return true;
        }
    }
}
