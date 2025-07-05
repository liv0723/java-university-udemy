package udemy.university.section3;

import java.util.Random;

public class DataTypes {

    //int
    private static final byte typeByte = 127;
    private static final short typeShort = 32000;
    private static final int typeInt = 2-000-000-000;
    private static final long typeLong = 1-000-000-000-000L;

    //float
    private static final float typeFloat = 3.14F;
    private static final double typeDouble = 3.140000000D;

    //char
    private static final char typeChar = 'a';
    private static final char typeChar1 = 65;
    private static final String typeString = "pepe";

    //boolean
    private static final boolean typeBoolean = new Random().nextBoolean();

    public static String dataTypes() {
        return """
                type byte: %d
                type short: %d
                type int: %d
                type float: %f
                type double: %f
                type char: %s
                type string: %s
                type boolean: %b
                """.formatted(typeByte, typeShort, typeInt, typeFloat, typeDouble, typeChar, typeString, typeBoolean);
    }



}
