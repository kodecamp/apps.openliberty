package in.kodecamp.beans;

public class UnitTest {
	private String question;
	private String answer;
	
	public UnitTest(final String question, final String answer) {
		this.question = question;
		this.answer = answer;
	}
	
	public UnitTest(final String question) {
		this(question,"");
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "UnitTest [question=" + question + ", answer=" + answer + "]";
	}
	
	
	
	
	
	
}
