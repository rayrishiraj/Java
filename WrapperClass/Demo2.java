package WrapperClass;

import java.lang.*;

public class Demo2 {

    public static void main(String[] args) {

        boolean primitiveBoolean = true;
        byte primitiveByte = 10;
        char primitiveChar = 'A';
        short primitiveShort = 100;
        int primitiveInt = 200;
        long primitiveLong = 1000L;
        float primitiveFloat = 3.14f;
        double primitiveDouble = 12.34;

        Boolean wrapperBoolean = Boolean.valueOf(primitiveBoolean);  
        Byte wrapperByte = Byte.valueOf(primitiveByte);              
        Character wrapperChar = Character.valueOf(primitiveChar);    
        Short wrapperShort = Short.valueOf(primitiveShort);          
        Integer wrapperInt = Integer.valueOf(primitiveInt);          
        Long wrapperLong = Long.valueOf(primitiveLong);              
        Float wrapperFloat = Float.valueOf(primitiveFloat);          
        Double wrapperDouble = Double.valueOf(primitiveDouble);      

        Boolean autoBoxedBoolean = primitiveBoolean;
        Byte autoBoxedByte = primitiveByte;
        Character autoBoxedChar = primitiveChar;
        Short autoBoxedShort = primitiveShort;
        Integer autoBoxedInt = primitiveInt;
        Long autoBoxedLong = primitiveLong;
        Float autoBoxedFloat = primitiveFloat;
        Double autoBoxedDouble = primitiveDouble;

        System.out.println("Autoboxed values:");
        System.out.println("Boolean: " + autoBoxedBoolean);
        System.out.println("Byte: " + autoBoxedByte);
        System.out.println("Character: " + autoBoxedChar);
        System.out.println("Short: " + autoBoxedShort);
        System.out.println("Integer: " + autoBoxedInt);
        System.out.println("Long: " + autoBoxedLong);
        System.out.println("Float: " + autoBoxedFloat);
        System.out.println("Double: " + autoBoxedDouble);


        boolean unboxedBoolean = wrapperBoolean.booleanValue();
        byte unboxedByte = wrapperByte.byteValue();
        char unboxedChar = wrapperChar.charValue();
        short unboxedShort = wrapperShort.shortValue();
        int unboxedInt = wrapperInt.intValue();
        long unboxedLong = wrapperLong.longValue();
        float unboxedFloat = wrapperFloat.floatValue();
        double unboxedDouble = wrapperDouble.doubleValue();
        
        System.out.println("\nUnboxed values:");
        System.out.println("Boolean: " + unboxedBoolean);
        System.out.println("Byte: " + unboxedByte);
        System.out.println("Character: " + unboxedChar);
        System.out.println("Short: " + unboxedShort);
        System.out.println("Integer: " + unboxedInt);
        System.out.println("Long: " + unboxedLong);
        System.out.println("Float: " + unboxedFloat);
        System.out.println("Double: " + unboxedDouble);
        
        boolean autoUnboxedBoolean = autoBoxedBoolean;
        byte autoUnboxedByte = autoBoxedByte;
        char autoUnboxedChar = autoBoxedChar;
        short autoUnboxedShort = autoBoxedShort;
        int autoUnboxedInt = autoBoxedInt;
        long autoUnboxedLong = autoBoxedLong;
        float autoUnboxedFloat = autoBoxedFloat;
        double autoUnboxedDouble = autoBoxedDouble;

        System.out.println("\nAuto-unboxed values:");
        System.out.println("Boolean: " + autoUnboxedBoolean);
        System.out.println("Byte: " + autoUnboxedByte);
        System.out.println("Character: " + autoUnboxedChar);
        System.out.println("Short: " + autoUnboxedShort);
        System.out.println("Integer: " + autoUnboxedInt);
        System.out.println("Long: " + autoUnboxedLong);
        System.out.println("Float: " + autoUnboxedFloat);
        System.out.println("Double: " + autoUnboxedDouble);
    }
}
