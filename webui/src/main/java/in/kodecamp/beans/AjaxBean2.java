package in.kodecamp.beans;

import java.io.Serializable;


import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class AjaxBean2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String email1;
	private String email2;
	private String email3;
	
	private boolean visible;


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getEmail3() {
		return email3;
	}

	public void setEmail3(String email3) {
		this.email3 = email3;
	}
	
	

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	@PostConstruct
	public void init() {
		System.out.println("AjaxBean : init");
		this.visible = false;
	}
	
	public void fetchDetails() {
		this.email1 = this.username+"@gmail.com";
		this.email2 = this.username+"420@gmail.com";
		this.email3 = this.username+"1000@gmail.com";
		this.visible = true;
	}
}
