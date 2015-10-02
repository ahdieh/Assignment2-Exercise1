import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.security.SecureRandom;


public class Test {
	
	// PRIVATE INSTANCE VARIABLES +++++++++++++++++++++++++++++++++++++
    private  String _answere;
    private int _random;
	private int _wrong;
	private int _right;
	private String _print;
	private int _questionNumber;
	private int _correctAns;
	Scanner input = new Scanner(System.in);
    private static final SecureRandom randomNumbers = new SecureRandom();


        
   // String[] RightAnsweres = {"Excellent!","Good!","Keep up the good work!","Nice work!","Amazing!","Good job!"};
    String[] WrongAnsweres = {"No. Please try again","Wrong. Try the next","Don't give up!","No. Keep trying..."};
    
 
    //PROPERTIES ++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    public int GetQuestionNumber(){
    	return this._questionNumber;
    }
    public void SetQuestionNumber(int questionNumber){
    	this._questionNumber = questionNumber;
    }
    
    public int GetCorrectAns(){
    	return this._correctAns;
    }
    public void SetCorrectAns(int correctAns){
    	this._correctAns = correctAns;
    }
    
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
			System.out.println("You did not enter an integer value");
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
    
    public int GetRight(){
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
    
	 
	 // Create Questions ++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void simulateQuestion(){
    	String[] Questions = new String[4];
    	Questions[0]= "***Question 1: Which keyword in a class dtion is followed immediatelyeclara by the class’s name?";
    	Questions[1]= "***Question 2: Which statement is false?";
    	Questions[2]= "***Question 3: Empty parentheses following a method name in a method declaration indicate that the method does not require any parameters to perform its task. \n  if (c => 7) \n  System.out.println(\"c is equal to or greater than 7\"); ";
    	Questions[3]= "***Question 4: The key logical units of the computer are:";
    	System.out.println(Questions[this.GetQuestionNumber()]);
    	switch(this.GetQuestionNumber()){
    	case 0:
    		System.out.println("1. public");
    		System.out.println("2. private");
    		System.out.println("3. class");
    		System.out.println("4. void");
    		this.SetCorrectAns(3);
    		break;
    	case 1:
    		System.out.println("1. Return type viod indicates that a method will not return a value. ");
    		System.out.println("2.  By convention, method names begin with an uppercase first letter, and all subsequent words in the name begin with a capital first letter. ");
    		System.out.println("3.  An import declaration is not required when one class in a package uses another in the same package. ");
    		System.out.println("4. Empty parentheses following a method name in a method declaration indicate that the method does not require any parameters to perform its task. Q2");
    		this.SetCorrectAns(2);
    		break;
    	case 2:
    		System.out.println("1. =>");
    		System.out.println("2. parentheses after if");
    		System.out.println("3. missing ; after if");
    		System.out.println("4. none of the above");
    		this.SetCorrectAns(1);
    		break;
    	case 3:
    		System.out.println("1.  input unit, output unit");
    		System.out.println("2.  central processing unit, arithmetic and logic unit");
    		System.out.println("3. memory unit, secondary storage unit");
    		System.out.println("4. All of them");
    		this.SetCorrectAns(4);
    		break;
    		
    	}
		
    }
    
    // Input answers +++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    public void inputAnswer(){
    	
    	System.out.print("Answere: ");
		this._answere = input.nextLine();
		this.SetAnswere(this._answere);
    }
    
    // Checking answers ++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    public void checkAnswer(int answere){
    	
    	if (answere == this.GetCorrectAns()){
		     int r =this.GetRight();
		     r++;
		     this.SetRight(r);
    	}
    	else{
    		this.SetRandom(randomNumbers.nextInt(this.WrongAnsweres.length));
		     String c = this.WrongAnsweres[this.GetRandom()];
		     this.SetPrint(c);
		     int w =this.GetWrong();
		     w++;
		     this.SetWrong(w);
    	}
    	
			    }
    
    // Printing related messages +++++++++++++++++++++++++++++++++++++++++++++
    
		public void simulateMessage(){
			System.out.println();
	    	if (Integer.parseInt(this.GetAnswrere()) == this.GetCorrectAns()){
	    		//this.SetRandom(randomNumbers.nextInt(this.RightAnsweres.length));
			  //   String d = this.RightAnsweres[this.GetRandom()];
			     //this.SetPrint(d);
	    		switch (randomNumbers.nextInt(4)){
	    		case 0:
	    			this.SetPrint("Excellent!");
	    		case 1:
	    			this.SetPrint("Good!");
	    		case 2:
	    			this.SetPrint("Keep up the good work!");
	    		case 3:
	    			this.SetPrint("Amazing!");


	    		}
	    	}
	    	
	    	else{
	    		this.SetRandom(randomNumbers.nextInt(this.WrongAnsweres.length));
			     String c = this.WrongAnsweres[this.GetRandom()];
			     this.SetPrint(c);
	    	}
	    	
			System.out.println(this.GetPrint());
			System.out.println();
		}
    	
		// Printing results +++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		public void Result(){
			System.out.printf("***You answered %d correct and %d wrong.\nYour correct answeres are %d percent of the total questions", this.GetRight(),this.GetWrong(), ((this.GetRight()*100)/(this.GetRight()+this.GetWrong())));
			
	
			
		}

}


