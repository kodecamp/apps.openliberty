package in.kodecamp.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
public class ExerciseBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private UnitTest test1 = new UnitTest("What is your name ?");
	private UnitTest test2 = new UnitTest("Where do you live ?");
	private UnitTest test3 = new UnitTest("What is your qualification ?");

	@Inject
	private Conversation conversation;

	@PostConstruct
	public void init() {
		this.startConversation();

	}

	public String navigate(final String to) {

		return "/exercise/" + to;
	}

	private void startConversation() {
		if (this.conversation.isTransient()) {
			System.out.println();

			System.out.println("Starting Conversation...");
			this.conversation.begin();
		}

	}

	private void stopConversation() {
		if (!this.conversation.isTransient()) {
			System.out.println("Ending Conversation...");
			this.conversation.end();
		}

	}

	public UnitTest getTest1() {
		return test1;
	}

	public UnitTest getTest2() {
		return test2;
	}

	public UnitTest getTest3() {
		return test3;
	}

	public void setTest3(UnitTest test3) {
		this.test3 = test3;
	}

	public void setTest1(UnitTest test1) {
		this.test1 = test1;
	}

	public void setTest2(UnitTest test2) {
		this.test2 = test2;
	}

	public String submit() {
		System.out.println(this.test1);
		System.out.println(this.test2);
		System.out.println(this.test3);
		this.stopConversation();
		return "/index";
	}

}
