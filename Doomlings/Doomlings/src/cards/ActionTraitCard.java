package cards;

import java.util.ArrayList;

public class ActionTraitCard extends AbstractCard {

    private TraitColor traitColor;
    private TraitType traitType;
    private int faceValue;
    private boolean dominant;
    private String name;
    private ArrayList<ActionType> actions;

    public ActionTraitCard(ActionTraitList trait){
        super(TraitType.ACTION, trait.getColor(), trait.getFaceValue(), false, trait.getName(), trait.getQuantity(),trait.getActions());
    }

    public TraitColor getTraitColor() {
        return traitColor;
    }
    public TraitType getTraitType() {
        return traitType;
    }
    public int getFaceValue() {
        return faceValue;
    }
    public boolean isDominant() {
        return dominant;
    }
    public String getName() {
        return name;
    }

    public ArrayList<ActionType> getActions() {
        return actions;
    }
}