package cards;

import java.util.ArrayList;

public enum ActionTraitList {
    BAD(TraitColor.RED,1,"BAD",ActionType.DISCARD,1),
    HOT_TEMPER(TraitColor.RED,2,"HOT TEMPER",ActionType.DISCARD,1),
    TERRITORIAL(TraitColor.RED,1,"TERRITORIAL",ActionType.DISCARD,1),
    RECKLESS(TraitColor.RED,3,"RECKLESS",ActionType.DISCARD,1),
    VORACIOUS(TraitColor.RED,2,"VORACIOUS",ActionType.ADD,ActionType.PLAY,ActionType.DISCARD,1),
    PHOTOSYNTHESIS(TraitColor.GREEN,1,"PHOTOSYNTHESIS",ActionType.DRAW,ActionType.ADD,ActionType.PLAY,1),
    PROPAGATION(TraitColor.GREEN,1,"PROPAGATION",ActionType.ADD,ActionType.PLAY,1),
    SELF_REPLICATING(TraitColor.GREEN,0,"SELF-REPLICATION",ActionType.ADD,ActionType.IGNORE,1),
    TINY_LITTLE_MELONS(TraitColor.GREEN,1,"TINY LITTLE MELONS",ActionType.STEAL,ActionType.IGNORE,1),
    TRUNK(TraitColor.GREEN,1,"TRUNK",ActionType.ADD,ActionType.IGNORE,1),
    COLD_BLOOD(TraitColor.BLUE,1,"COLD BLOOD",ActionType.DRAW,ActionType.ADD,ActionType.PLAY,1),
    COSTLY_SIGNALING(TraitColor.BLUE,-2,"COSTLY SIGNALING",ActionType.GIVE,ActionType.ADD,ActionType.PLAY,1),
    FLIGHT(TraitColor.BLUE,2,"FLIGHT",ActionType.SWAP,1),
    IRIDESCENT_SCALES(TraitColor.BLUE,1,"IRIDESCENT SCALES",ActionType.DRAW,1),
    PAINTED_SHELL(TraitColor.BLUE,1,"PAINTED SHELL",ActionType.PLAY,1),
    SCUTES(TraitColor.BLUE,3,"SCUTES",ActionType.GIVE,1),
    SELECTIVE_MEMORY(TraitColor.BLUE,0,"SELECTIVE MEMORY",ActionType.ADD,ActionType.PLAY,1),
    SWEAT(TraitColor.BLUE,2,"SWEAT",ActionType.DISCARD,1),
    TENTACLES(TraitColor.BLUE,1,"TENTACLES",ActionType.SWAP,1),
    CLEVER(TraitColor.PURPLE,1,"CLEVER",ActionType.STEAL,ActionType.ADD,ActionType.PLAY,1),
    DIRECTLY_REGISTER(TraitColor.PURPLE,1,"DIRECTLY REGISTER",ActionType.STEAL,1),
    IMPATIENCE(TraitColor.PURPLE,1,"IMPATIENCE",ActionType.STEAL,1),
    INVENTIVE(TraitColor.PURPLE,1,"INVENTIVE",ActionType.PLAY,1),
    MEMORY(TraitColor.PURPLE,2,"MEMORY",ActionType.DISCARD,1),
    NOSY(TraitColor.PURPLE,1,"NOSY",ActionType.STEAL,ActionType.ADD,ActionType.PLAY,1),
    PERSUASIVE(TraitColor.PURPLE,1,"PERSUASIVE",ActionType.DISCARD,1),
    POISONOUS(TraitColor.PURPLE,2,"POISONOUS",ActionType.SWAP,1),
    SELFISH(TraitColor.PURPLE,1,"SELFISH",ActionType.STEAL,1),
    TELEKINETIC(TraitColor.PURPLE,1,"TELEKINETIC",ActionType.SWAP,1),
    VENOMOUS(TraitColor.PURPLE,-2,"VENOMOUS",ActionType.ADD,ActionType.PLAY,ActionType.GIVE,1);

    private TraitColor color;
    private int faceValue;
    private String name;
    private int quantity;
    private ArrayList<ActionType> actions;

    ActionTraitList(TraitColor color, int faceValue, String name, ActionType action, int quantity) {
        this.color = color;
        this.faceValue = faceValue;
        this.name = name;
        this.quantity = quantity;

        actions = new ArrayList<ActionType>();
        this.actions.add(action);
    }
    ActionTraitList(TraitColor color, int faceValue, String name, ActionType action, ActionType action2, int quantity) {
        this.color = color;
        this.faceValue = faceValue;
        this.name = name;
        this.quantity = quantity;

        actions = new ArrayList<ActionType>();
        this.actions.add(action);
        this.actions.add(action2);
    }
    ActionTraitList(TraitColor color, int faceValue, String name, ActionType action, ActionType action2, ActionType action3, int quantity) {
        this.color = color;
        this.faceValue = faceValue;
        this.name = name;
        this.quantity = quantity;

        actions = new ArrayList<ActionType>();
        this.actions.add(action);
        this.actions.add(action2);
        this.actions.add(action3);
    }

    public TraitColor getColor() {
        return color;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public ArrayList<ActionType> getActions() {
        return actions;
    }
}
