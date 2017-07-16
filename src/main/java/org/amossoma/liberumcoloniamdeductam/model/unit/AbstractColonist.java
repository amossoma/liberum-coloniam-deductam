package org.amossoma.liberumcoloniamdeductam.model.unit;

public class AbstractColonist implements Unit {

    private final ColonistSpecialisation specialisation;

    public AbstractColonist(ColonistSpecialisation specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public UnitType getType() {
        return UnitType.COLONIST;
    }

}
