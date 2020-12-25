package in.kodecamp.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ConvertorExampleBean1 {
	
	private String name;
	private String address;
	private int age;
	private double percentScore;
	
	//convertorExampleBean
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getPercentScore() {
		return percentScore;
	}
	
	public void setPercentScore(double percentScore) {
		this.percentScore = percentScore;
	}
	
	public void save() {
		System.out.println("ConvertorExampleBean : save");
	}
	
	
}
