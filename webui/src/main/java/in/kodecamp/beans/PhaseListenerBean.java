package in.kodecamp.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PhaseListenerBean {
	private String name;

	public PhaseListenerBean() {
		System.out.println("### Bean : constructor");
	}

	@PostConstruct
	public void init() {
		System.out.println("### Bean : postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("### Bean : preDestroy");
	}

	public String getName() {
		System.out.println("### Bean : getName ");
		return name;
	}

	public void setName(String name) {
		System.out.println("### Bean : setName ");
		this.name = name;
	}

	public void doSomething() {
		System.out.println("### Bean : Action : (doSomething) ");

	}

}
