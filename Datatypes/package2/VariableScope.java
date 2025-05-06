package package2;

public class VariableScope {

	public static void main(String[] args) {
		int outerVariable = 10;
        
        System.out.println("Before if block: outerVariable = " + outerVariable);
        // System.out.println("Before if block: innerVariable = " + innerVariable); 
        // COMPILER ERROR: innerVariable cannot be resolved to a variable
        
        if (true) {
            int innerVariable = 20;
            
            // Both variables are accessible inside the if block
            System.out.println("Inside if block: outerVariable = " + outerVariable);
            System.out.println("Inside if block: innerVariable = " + innerVariable);
        }
        
        System.out.println("After if block: outerVariable = " + outerVariable);
        // System.out.println("After if block: innerVariable = " + innerVariable);
        // COMPILER ERROR: innerVariable cannot be resolved to a variable

	}

}
