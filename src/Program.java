import java.security.SecureRandom;
import java.util.*;


public class Program {

	public static void main(String[] args) {

		Test test = new Test();
		for(int i=0;i<4;i++){
			test.SetQuestionNumber(i);
		    test.simulateQuestion();
		    test.inputAnswer();
		    test.checkAnswer(Integer.parseInt(test.GetAnswrere()));
		    test.simulateMessage();
		   		    
		}
		 test.Result();
	}

}
