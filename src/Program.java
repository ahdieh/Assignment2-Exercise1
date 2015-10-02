
public class Program {

	public static void main(String[] args) {

		Test test = new Test();
		test.simulateQuestion();
		test.inputAnswer();
		test.checkAnswer(Integer.parseInt(test.GetAnswrere()));
		test.simulateMessage();
		test.Result();
	}

}
