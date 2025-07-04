package udemy.university.section3;

public class Variables {
    //primitive type numeric integer
    private final byte varByte;
    private final short varShort;
    private final int varInt;
    private final long varLong;

    // primitive type numeric float
    private final float varFloat;
    private final double varDouble;

    //primitive type char
    private final char varChar;

    //primitive type Boolean
    private final boolean varBoolean;

    public Variables() {
        this.varByte = 127;
        this.varShort = 32000;
        this.varInt = 2000000;
        this.varLong = 200000000L;

        this.varFloat = 1.1F;
        this.varDouble = 1.1111111D;

        this.varChar =  'P';

        this.varBoolean = true;

    }

    public byte getVarByte() {
        return this.varByte;
    }

    public short getVarShort() {
        return this.varShort;
    }

    public int getVarInt() {
        return this.varInt;
    }

    public long getVarLong() {
        return this.varLong;
    }

    public float getVarFloat() {
        return this.varFloat;
    }

    public double getVarDouble() {
        return this.varDouble;
    }

    public char getVarChar() {
        return this.varChar;
    }

    public boolean getVarBoolean() {
        return this.varBoolean;
    }
}
