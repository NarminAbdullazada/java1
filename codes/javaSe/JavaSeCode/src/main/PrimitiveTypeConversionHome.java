package main;

public class PrimitiveTypeConversionHome {
	 public static void main(String[] args) {
	        int intVariable = 55;
	        byte byteVariable = (byte) intVariable;
	        System.out.println("Int dəyəri: " + intVariable);
	        System.out.println("Byte dəyəri: " + byteVariable);

	        short shortVariable = 636;
	        byteVariable = (byte) shortVariable;
	        System.out.println("Short dəyəri: " + shortVariable);
	        System.out.println("Byte dəyəri: " + byteVariable);

	        long longVariable = 458;
	        shortVariable = (short) longVariable;
	        System.out.println("Long dəyəri: " + longVariable);
	        System.out.println("Short dəyəri: " + shortVariable);

	        longVariable = 92523635483L;
	        intVariable = (int) longVariable;
	        System.out.println("Long dəyəri: " + longVariable);
	        System.out.println("Int dəyəri: " + intVariable);

	        double doubleVariable = 65787.3;
	        intVariable = (int) doubleVariable;
	        System.out.println("Double dəyəri: " + doubleVariable);
	        System.out.println("Int dəyəri: " + intVariable);

	        char charVariable = 'q';
	        intVariable = charVariable;
	        System.out.println("Char dəyəri: " + charVariable);
	        System.out.println("Int dəyəri: " + intVariable);

	        intVariable = 266;
	        charVariable = (char) intVariable;
	        System.out.println("Int dəyəri: " + intVariable);
	        System.out.println("Char dəyəri: " + charVariable);
	    }
}
