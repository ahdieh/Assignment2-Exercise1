import java.util.Scanner;
import java.security.SecureRandom;


public class Test {
	
	// PRIVATE INSTANCE VARIABLES +++++++++++++++++++++++++++++++++++++
    private  String _answere;
    private int _random;
	private int _wrong;
	private int _right;
	private String _print;
	Scanner input = new Scanner(System.in);
    private static final SecureRandom randomNumbers = new SecureRandom();


        
    String[] RightAnsweres = {"Excellent!","Good!","Keep up the good work!","Nice work!","Amazing!","Good job!"};
    String[] WrongAnsweres = {"No. Please try again","Wrong. Try the next","Don't give up!","No. Keep trying..."};
    
 
    //PROPERTIES ++++++++++++++++++++++++++++++++++++++++++++++++++++
    public String GetAnswrere(){
    	return this._answere;
    }
    
    public void SetAnswere(String answere){
    	
    	try {
			int a = Integer.parseInt(answere);
			
			if(a < 1 || a> 4) {
				System.out.println("You entered an invalid number");
				this._answere = answere;
			}
			else {
				this._answere = answere;
			}
		} catch (Exception exception) {
			System.out.println("Please enter an integer value");
		}
    }
    
    public int GetRandom(){
    	return this._random;
    }
    
    public void SetRandom(int random){
    	
    	this._random = random;
    }
    
    public String GetPrint(){
    	return this._print;
    }
    
    public void SetPrint(String print){
    	
    	this._print = print;
    }
    
    public int GetRightt(){
    	return this._right;
    }
    
    public void SetRight(int right){
    	
    	this._right = right;
    }
    
    public int GetWrong(){
    	return this._wrong;
    }
    
    public void SetWrong(int wrong){
    	
    	this._wrong = wrong;
    }

 // CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++
    public Test(){
			this._initialize("0" , 0 , 0 , 0 , "");

   }
    
	// PRIVATE METHODS ++++++++++++++++++++++++++++++++++++++

	 private void _initialize(String answere, int random , int wrong, int right, String print) {
			this.SetAnswere(answere);
			this.SetRandom(random);
			this.SetWrong(wrong);
			this.SetRight(right);
			this.SetPrint(print);

	 }
    
   
    // PUBLIC METHODE ++++++++++++++++++++++++++++++++++++++++++++++++++
    
    public void simulateQuestion(){
    	System.out.println("Question 1: Which keyword in a class declaration is followed immediately by the class’s name?");
		System.out.println("1. public");
		System.out.println("2. private");
		System.out.println("3. class");
		System.out.println("4. void");

    }
    
    public void inputAnswer(){
    	
    	System.out.print("Answere: ");
		this._answere = input.nextLine();
		this.SetAnswere(this._answere);
    }
    
    
    public void checkAnswer(int answere){
    	
    	        switch(answere){
			        case 1:
		            case 2:
		            case 4:
			         this.SetRandom(randomNumbers.nextInt(this.WrongAnsweres.length));
				     String c = this.WrongAnsweres[this.GetRandom()];
				     this.SetPrint(c);
				     break;
				    
		            case 3:
					 this.SetRandom(randomNumbers.nextInt(this.RightAnsweres.length));
				     String d = this.RightAnsweres[this.GetRandom()];
				     this.SetPrint(d);
				     break;
			         }
			    }
    
		public void simulateMessage(){
			System.out.println();
			System.out.println(this.GetPrint());
		}
    		
}

