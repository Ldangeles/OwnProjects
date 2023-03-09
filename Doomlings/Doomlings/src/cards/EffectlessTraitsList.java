package cards;

public enum EffectlessTraitsList {

    FANGS(TraitColor.RED,1,"FANGS",1),
    STONE_SKIN(TraitColor.RED,2,"STONE SKIN", 1),
    QUICK(TraitColor.RED,2,"QUICK", 1),
    ANTLERS(TraitColor.RED,3,"ANTLERS", 1),
    FIRE_SKIN(TraitColor.RED,3,"FIRE SKIN",1),
    FINE_MOTOR_SKILLS(TraitColor.PURPLE,2,"FINE MOTOR SKILLS", 1),
    NOCTURNAL(TraitColor.PURPLE,3,"NOCTURNAL", 1),
    BIG_EARS(TraitColor.PURPLE,1,"BIG EARS", 1),
    ADORABLE(TraitColor.PURPLE,4,"ADORABLE", 1),
    SPINY(TraitColor.BLUE,1,"SPINY", 1),
    MIGRATORY(TraitColor.BLUE,2,"MIGRATORY", 1),
    BLUBBER(TraitColor.BLUE,4,"BLUBBER", 1),
    GILLS(TraitColor.BLUE,1,"GILLS", 1),
    WOODY_STEMS(TraitColor.GREEN,1,"WOODY_STEMS", 1),
    BARK(TraitColor.GREEN,2,"BARK", 1),
    LEAVES(TraitColor.GREEN,1,"LEAVES", 1),
    DEEP_ROOTS(TraitColor.GREEN,2,"DEEP ROOTS", 1),
    APPEALING(TraitColor.GREEN,3,"APPEALING", 1);

    private final TraitColor color;
    private final int faceValue;
    private final String name;
    private final int quantity;

    EffectlessTraitsList(TraitColor color, int faceValue, String name, int quantity) {
        this.color = color;
        this.faceValue = faceValue;
        this.name = name;
        this.quantity = quantity;
    }

    public TraitColor getColor (){
        return color;
    }
    public String getName (){
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getFaceValue() {
        return faceValue;
    }
}
