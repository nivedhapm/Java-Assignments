import java.util.Scanner;

public class PrintCharacter{
    public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter an alphaphet to print its later subsequents: ");
       char alphabet = scanner.next().charAt(0);

       if (!(alphabet>='A' && alphabet<='Z' ) && !(alphabet>='a' && alphabet<='z')){
        System.out.println("The entered character is not an alphabet.");
            
       }else{
        for (char c = alphabet; (c>='a' && c<='z' || c>='A' && c<='Z') ; c++){
	        System.out.print(c);
    }
       }
    scanner.close();   
}
}