package cards;

public class EffectlessTraitCard extends AbstractCard {

    private TraitColor traitColor;
    private TraitType traitType;
    private int faceValue;
    private boolean dominant;
    private String name;
    public EffectlessTraitCard(EffectlessTraitsList trait){
        super(TraitType.EFFECTLESS, trait.getColor(), trait.getFaceValue(), false, trait.getName(), trait.getQuantity());
    }

    public TraitColor getTraitColor() {
        return traitColor;
    }

    public TraitType getTraitType() {
        return traitType;
    }

    @Override
    public int getFaceValue() {
        return faceValue;
    }

    @Override
    public boolean isDominant() {
        return dominant;
    }

    public String getName() {
        return name;
    }
}
