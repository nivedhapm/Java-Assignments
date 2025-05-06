public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
      //Bitwise AND
        System.out.println("a & b: " + (a & b));
        //Bitwise OR
        System.out.println("a | b: " + (a | b));
        //Bitwise XOR
        System.out.println("a ^ b: " + (a ^ b));
        //Bitwise NOT
        System.out.println("~a: " + (~a));
        //Bitwise Left shift
        System.out.println("a << 1: " + (a << 1));
        //Bitwise Right shift
        System.out.println("a >> 1: " + (a >> 1));
        //Bitwise Unsigned right shift
        System.out.println("a >>> 2: " + (a >>> 2));
    }
}
