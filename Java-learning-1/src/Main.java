public class Main
{
    public static void main(String[] args)
    {
        // list of different type of variables and primitative data types
        String message = "First line from app";
        System.out.println(message);
        byte varByte = 127;
        System.out.println(varByte);
        short varShort = 32767;
        System.out.println(varShort);
        int varInt = 2147483647;
        System.out.println(varInt);
        long varLong = 9223372036854775807L;
        System.out.println(varLong);
        float varFloat = 3.4028235E38f;
        System.out.println(varFloat);
        double varDouble = 1.7976931348623157E308;
        System.out.println(varDouble);
        char varChar = 'A';
        System.out.println(varChar);
        boolean varBoolean = true;
        System.out.println(varBoolean);
        message = "Last line from app";
        System.out.println(message);

        int someValue = 5;
        System.out.println(++someValue); //6
        System.out.println(someValue); //6
        System.out.println(someValue++); //6
        System.out.println(someValue); //7

        int myValue = 50
    }
}