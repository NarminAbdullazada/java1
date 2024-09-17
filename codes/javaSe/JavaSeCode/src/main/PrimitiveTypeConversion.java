package main;

public class PrimitiveTypeConversion {
	public static void main(String[] args) {
        short shortVariable = 69;
        byte byteVariable = (byte) shortVariable;
        System.out.println("Short dəyəri: " + shortVariable);
        System.out.println("Byte dəyəri: " + byteVariable);

        shortVariable = 589;
        byteVariable = (byte) shortVariable;
        System.out.println("Short dəyəri: " + shortVariable);
        System.out.println("Byte dəyəri: " + byteVariable);

        long longVariable = 458;
        int intVariable = (int) longVariable;
        System.out.println("Long dəyəri: " + longVariable);
        System.out.println("Int dəyəri: " + intVariable);

        longVariable = 52523635483L;
        intVariable = (int) longVariable;
        System.out.println("Long dəyəri: " + longVariable);
        System.out.println("Int dəyəri: " + intVariable);

        double doubleVariable = 5632.6;
        float floatVariable = (float) doubleVariable;
        System.out.println("Double dəyəri: " + doubleVariable);
        System.out.println("Float dəyəri: " + floatVariable);
        
        char charVariable = 'D';
        intVariable = charVariable;
        System.out.println("Char dəyəri: " + charVariable);
        System.out.println("Int dəyəri: " + intVariable);

        intVariable = 123;
        charVariable = (char) intVariable;
        System.out.println("Int dəyəri: " + intVariable);
        System.out.println("Char dəyəri: " + charVariable);
    }
}
