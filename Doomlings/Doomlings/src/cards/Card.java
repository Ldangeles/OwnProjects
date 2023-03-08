package cards;

import java.io.Serializable;

public interface Card extends Serializable {

    TraitColor getColor();
    TraitType getType();
    int getFaceValue();
    boolean isDominant();
}
