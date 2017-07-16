package org.amossoma.liberumcoloniamdeductam.model.unit;

public enum UnitType {
    ARTILLERY(true, false, false, true, false, false, false, false),
    COLONIST(false, false, false, true, false, true, false, false),
    PIONEER(false, true, false, true, false, true, false, false),
    SCOUT(false, false, false, true, false, true, true, false),
    SHIP(true, false, true, false, true, false, false, false),
    TREASURE(false, false, false, true, false, false, false, true),
    WAGON(false, false, true, true, false, false, false, false);

    private boolean canAttack;
    private boolean canBuildImprovements;
    private boolean canCarry;
    private boolean canMove;
    private boolean canSail;
    private boolean isColonist;
    private boolean isDiplomat;
    private boolean isTreasure;

    UnitType(boolean canAttack, boolean canBuildImprovements, boolean canCarry, boolean canMove, boolean canSail, boolean isColonist, boolean isDiplomat, boolean isTreasure) {
        this.canAttack = canAttack;
        this.canBuildImprovements = canBuildImprovements;
        this.canCarry = canCarry;
        this.canMove = canMove;
        this.canSail = canSail;
        this.isColonist = isColonist;
        this.isDiplomat = isDiplomat;
        this.isTreasure = isTreasure;
    }

    public boolean isCanAttack() {
        return canAttack;
    }

    public boolean isCanBuildImprovements() {
        return canBuildImprovements;
    }

    public boolean isCanCarry() {
        return canCarry;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public boolean isCanSail() {
        return canSail;
    }

    public boolean isColonist() {
        return isColonist;
    }

    public boolean isDiplomat() {
        return isDiplomat;
    }

    public boolean isTreasure() {
        return isTreasure;
    }
}
