package cards;

import java.util.ArrayList;

public abstract class AbstractCard{

    private TraitColor traitColor;
    private TraitType traitType;
    private ArrayList<ActionType> actions;
    private int faceValue;
    private final boolean dominant;
    private final String name;
    private int quantity;


    public AbstractCard(TraitType traitType, TraitColor traitColor, int faceValue, boolean dominant, String name, int quantity,ArrayList<ActionType> actions){
        this.traitColor = traitColor;
        this.traitType = traitType;
        this.faceValue = faceValue;
        this.dominant = dominant;
        this.name = name;
        this.quantity = quantity;
    }

    public TraitColor getColor() {
        return null;
    }
    public TraitType getType() {
        return null;
    }
    public int getFaceValue() {
        return 0;
    }
    public boolean isDominant() {
        return false;
    }
    public TraitColor getTraitColor() {
        return traitColor;
    }
    public TraitType getTraitType() {
        return traitType;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Trait{" +
                " Name=" + name +
                ", traitColor=" + traitColor +
                ", traitType=" + traitType +
                ", faceValue=" + faceValue +
                ", dominant=" + dominant +
                '}';
    }

    public ArrayList<ActionType> getActions() {
        return actions;
    }
}

