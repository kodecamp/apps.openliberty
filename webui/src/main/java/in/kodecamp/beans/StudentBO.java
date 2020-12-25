package in.kodecamp.beans;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


@Dependent // same as in source
public class StudentBO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public StudentBO() {
		System.out.println("StudentBO : Constructor");
	}
	public String messages() {
		return "Hello From StudentBO";
	}
}
