package in.kodecamp.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ConvertorExampleBean2 {
	
	private String name;
	private String address;
	private Integer age = null;
	private Double percentScore = null;
	
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
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Double getPercentScore() {
		return percentScore;
	}
	
	public void setPercentScore(Double percentScore) {
		this.percentScore = percentScore;
	}
	
	public void save() {
		System.out.println("ConvertorExampleBean : save");
	}
	
	
}
