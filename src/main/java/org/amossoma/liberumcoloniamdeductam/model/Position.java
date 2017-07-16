package org.amossoma.liberumcoloniamdeductam.model;

public class Position {

    private final long x;

    private final long y;


    public Position(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

}
