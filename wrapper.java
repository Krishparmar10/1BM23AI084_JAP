public class wrapper {
    public static void main(String[] args) {

        int intValue = 5;
        float floatValue = 9.76f;
        byte byteValue = 10;
        char charValue = 'A';

        Integer intObj = intValue;
        Float floatObj = floatValue;
        Byte byteObj = byteValue;
        Character charObj = charValue;


        int intUnboxed = intObj;
        float floatUnboxed = floatObj;
        byte byteUnboxed = byteObj;
        char charUnboxed = charObj;


        System.out.println("The value of intValue is " + intValue);
        System.out.println("The value of intObj (after autoboxing) is " + intObj);
        System.out.println("The value of intUnboxed (after unboxing) is " + intUnboxed);

        System.out.println("The value of floatValue is " + floatValue);
        System.out.println("The value of floatObj (after autoboxing) is " + floatObj);
        System.out.println("The value of floatUnboxed (after unboxing) is " + floatUnboxed);

        System.out.println("The value of byteValue (byte) is " + byteValue);
        System.out.println("The value of byteObj (after autoboxing) is " + byteObj);
        System.out.println("The value of byteUnboxed (after unboxing) is " + byteUnboxed);

        System.out.println("The value of charValue (char) is " + charValue);
        System.out.println("The value of charObj (after autoboxing) is " + charObj);
        System.out.println("The value of charUnboxed (after unboxing) is " + charUnboxed);
    }
}


