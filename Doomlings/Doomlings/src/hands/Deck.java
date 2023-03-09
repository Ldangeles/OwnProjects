package hands;

import cards.*;

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

        for(ActionTraitList actionTrait : ActionTraitList.values()){
            for(int i=1; i<=actionTrait.getQuantity(); i++){
                AbstractCard trait = new ActionTraitCard(actionTrait);
                addTrait(trait);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(getTraits());
    }

    public void deal(Hand h1,int numberOfTraits){

        for (AbstractCard trait : getTraits(numberOfTraits)){
            giveTrait(trait,h1);
        }
    }
}
