import java.util.Scanner;
public class Converter {
	 
	
	public static void main(String[] args) {
		int menuSelection;
		
		
		String screenView;
		Scanner scanner = new Scanner(System.in);
		
		screenView = "Please select an option:\r\n"
				+ "1. Dog age to Human age in years\r\n"
				+ "2. Inches to Feet\r\n"
				+ "3. Quit";
		
		System.out.println(screenView);
        menuSelection = scanner.nextInt();
        
        while (menuSelection != 4) {
    	  
        if (menuSelection == 1) {
        	screenView = "Please enter your dog's age for its age relative to humans.";
        	System.out.println(screenView);
        	double dogAge = scanner.nextDouble();
        	System.out.println("Your dog relative to humans is approximately " + dogAge * 7 + " years old.");
        	
        } else
        
        if (menuSelection == 2) {
        	screenView = "Please enter the number of inches to convert.";
        	System.out.println(screenView);
        	float numInches = scanner.nextFloat();
        	System.out.println(numInches + " inches is equivalent to " + numInches / 12 + " feet.");
        	
        } else
        
        if (menuSelection == 3) {
        	screenView = "Bye! Please come back soon to see my improvements to this.";
        	System.out.println(screenView);
        	
        }
               
		}
		
		menuSelection = scanner.nextInt();
		scanner.close();
	}
	
  }
    

