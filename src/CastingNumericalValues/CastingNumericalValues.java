package CastingNumericalValues;

public class CastingNumericalValues {
    public static void print() {
        System.out.println("CastingNumericalValues");
        byte byteValue = 8; // 8 bit number (between -127 and 128)
        short shortValue = 16; // 16 bit number
        int intValue = 32; // basic number type in Java. holds 32 bit
        long longValue = 64; // 64 bit number

        double doubleValue = 1.11; // by default, decimal numbers are double. 64bit
        float floatValue = 1.11f; // need to add f to and to make it float. 32bit

        // int value = longValue; can't convert from long to int

        int value = (int) longValue; // ([NUMBER-TYPE]) converts type of the value to desired one
        int value2 = (int) floatValue;
        int value3 = shortValue; // this works because int > short in terms of bites amount

    }
}
