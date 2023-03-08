package cards;

public abstract class AbstractCard implements Card {

    private TraitColor traitColor;
    private final TraitType traitType;
    private int faceValue;
    private final boolean dominant;
    private final String name;
    private int quantity;

    public AbstractCard(TraitType traitType, TraitColor traitColor, int faceValue, boolean dominant, String name, int quantity){
        this.traitColor = traitColor;
        this.traitType = traitType;
        this.faceValue = faceValue;
        this.dominant = dominant;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public TraitColor getColor() {
        return null;
    }

    @Override
    public TraitType getType() {
        return null;
    }

    @Override
    public int getFaceValue() {
        return 0;
    }

    @Override
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

}

