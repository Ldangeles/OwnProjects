package hands;

import cards.AbstractCard;

import java.util.ArrayList;

public class Hand {
    private ArrayList<AbstractCard> traits;

    public Hand(){
        traits = new ArrayList<AbstractCard>();
    }

    public void addTrait(AbstractCard trait){ //Adds a single trait to the hand
        traits.add(trait);
    }

    public void giveTrait(AbstractCard trait, Hand toWhom){ //Gives a single trait to an opponent's hand
        if(!traits.contains(trait)){
            return;
        }

        traits.remove(trait);
        toWhom.traits.add(trait);
    }

    public boolean discard(AbstractCard abstractTrait, Hand discardPile){ //Discard a single trait to the Discard Pile
        if(!traits.contains(abstractTrait)){
            return false;
        }
        else{
            traits.remove(abstractTrait);
            discardPile.addTrait(abstractTrait);
            return true;
        }
    }

    public void clear(){ //Clear all traits from a Hand
        traits.clear();
    }

    /*public boolean steal (hands.Hand otherHand, card.Trait trait){
        ArrayList otherHandTraits = otherHand.getTraits();
        if(!otherHandTraits.isEmpty()){
            return false;
        }
        else{
            otherHandTraits.remove(trait);
            traits.add(trait);
            return true;
        }
    }*/

    public String showTraits(){ // Returns a string of all the traits in Hand
        String str = "";
        for(AbstractCard trait: getTraits()){
            str+=trait.toString()+"\n";
        }
        return str;
    }

    public ArrayList<AbstractCard> getTraits() { //Return a list with all the trait in Hand
        return traits;
    }

    public ArrayList<AbstractCard> getTraits(int numberOfTraits) { //Return a list of an especific number of traits in Hand
        ArrayList <AbstractCard> inArray = getTraits();
        ArrayList<AbstractCard> outArray = new ArrayList<AbstractCard>(numberOfTraits);

        for (int i = 0; i < numberOfTraits; i++) {
            outArray.add(inArray.get(i));
        }
        return outArray;
    }

    public void setTraits(ArrayList<AbstractCard> abstractTraits) {
        this.traits = abstractTraits;
    }
}
