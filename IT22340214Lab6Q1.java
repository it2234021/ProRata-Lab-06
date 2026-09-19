import java.util.Scanner;

public class IT22340214Lab6Q1 {
    public static void main(String[] args) {
         
		double number,square,square_Root;
		
		
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        number=input.nextDouble();
		
		
	    if (number <= 0){
			System.out.println("Error: The number must be greater than zero");
		}
		else{
	    
	
	    square=number*number;
	    square_Root=Math.sqrt(number);
		
		System.out.println("The square of "+number+" is "+square);
	    System.out.println("The square root of "+number+" is "+square_Root);
		}
	}
	
	
	
}