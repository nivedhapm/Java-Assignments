package package1;

public class TypeConversion {

	public static void main(String[] args) {
		float floatNum1 = 11.11f;
		int intNum1 = (int)floatNum1;
		System.out.println("Float value = "+ floatNum1);
		System.out.println("Converted to Int = "+ intNum1);
		
		double doubleNum1 = 22.08;
		float floatNum2 = (float)doubleNum1;
		System.out.println("\nDouble value = "+ doubleNum1);
		System.out.println("Converted to float = "+ floatNum2);
		
		int intNum2 = 30;
		short shortNum1 = (short)intNum2;
		System.out.println("\nInt value = "+ intNum2);
		System.out.println("Converted to short = "+ shortNum1);
		
		double doubleNum2 = 85.04;
		long longNum = (long)doubleNum2;
		System.out.println("\nDouble value = "+doubleNum2);
		System.out.println("Converted to long = "+ longNum);
		
		short shortNum2 = 7;
		byte byteNum = (byte)shortNum2;
		System.out.println("\nShort value = "+ shortNum2);
		System.out.println("Converted to byte = "+ byteNum);
	}

}
