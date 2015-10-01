import java.util.Scanner;
import java.security.SecureRandom;


public class Test {
	
	// PRIVATE INSTANCE VARIABLES
    private int _answere;
    
	Scanner input = new Scanner(System.in);
    private static final SecureRandom randomNumbers = new SecureRandom();


        
    String[] RightAnsweres = {"Excellent!","Good!","Keep up the good work!","Nice work!","Amazing!","Good job!"};
    private int _rightAnsweres = RightAnsweres.length;
    String[] WrongAnsweres = {"No. Please try again","Wrong. Try once more","Don't give up!","No. Keep trying..."};
    private int _wrongAnsweres =WrongAnsweres.length;
    
    // PUBLIC METHODE
    
    public void simulateQuestion(){
    	System.out.println("Question 1: Which keyword in a class declaration is followed immediately by the class’s name?");
		System.out.println("1. public");
		System.out.println("2. private");
		System.out.println("3. class");
		System.out.println("4. void");

    }
    
    public String checkAnswer(){
			
    		try{
 			System.out.print("Answere: ");
			_answere = input.nextInt();
			int number;
			if (_answere<0){
    			return("You entered invalid data! Please enter a positive number");
			}
			else{
				if (_answere>4){
        			return("You entered invalid data! Please enter a correct number");
				}
				else{
			switch(_answere){
			case 3:
			    number = randomNumbers.nextInt(_rightAnsweres);
				return(RightAnsweres[number]);
			case 1:
			case 2:
			case 4:
				 number = randomNumbers.nextInt(_wrongAnsweres);
				return(WrongAnsweres[number]);
			}
			}
			}
    		} catch (Exception e) {
    			return("You entered invalid data! Please enter a number");
    		}
			return null;

    	}	
}
