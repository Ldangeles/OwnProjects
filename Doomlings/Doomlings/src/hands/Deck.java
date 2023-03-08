package hands;

import cards.AbstractCard;
import cards.EffectlessTraitCard;
import cards.EffectlessTraitsList;

import java.util.*;

public class Deck extends Hand {
    Random rand = new Random();

    private Stack<AbstractCard> stackDeck;
    public void populate(){
        for(EffectlessTraitsList effectlessTrait : EffectlessTraitsList.values()){
            for(int i=1;i<=effectlessTrait.getQuantity();i++){
                AbstractCard trait = new EffectlessTraitCard(effectlessTrait);
                addTrait(trait);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(getTraits());
    }

    public void deal(Hand h1,Hand h2,int numberOfTraits){

        for (AbstractCard trait : getTraits(numberOfTraits)){
            giveTrait(trait,h1);
        }

        for (AbstractCard trait : getTraits(numberOfTraits)){
            giveTrait(trait,h2);
        }

    }
}
