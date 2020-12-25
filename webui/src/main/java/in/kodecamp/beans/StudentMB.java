package in.kodecamp.beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class StudentMB implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String value1;
	
	@Inject
	private StudentBO bo;

	public StudentMB() {
		System.out.println("StudentMB : Constructor");
		this.value1 = "Some Value";
	}

	public String getValue1() {
		return value1;
	}
	
	public String doSomething(final String param) {
		System.out.println("StudentBO : " + this.bo);
		bo.messages();
		System.out.println("Param : " + param);
		return "page1";
	}
	
	public String goBack() {
		return "index";
	}
	
	
	
	
}
