package in.kodecamp.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

@Named
@RequestScoped
public class ActionsBean2 {
	
	private String name;
	private String address;
	private boolean rendered = false;
	
	private String value;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
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
	
	

	public boolean isRendered() {
		return rendered;
	}

	public void setRendered(boolean rendered) {
		this.rendered = rendered;
	}

	public String action1() {
		System.out.println("ActionsBean 2 : CommandButton: Action");
		final String msg = "Hello "+this.value;
		return "actionresult2?faces-redirect=true&amp;msg="+msg;
	}
	
	// Navigation rules does not work
	public String action2(final ActionEvent event) {
		System.out.println("CommandButton : Default ActionListener");
		System.out.println("Event Source : " + event.getSource());
		final String msg = "Hello "+this.value;
		return "actionresult2?faces-redirect=true&amp;msg="+msg;
	}
	
	public String action2(final String param1, final String param2) {
		System.out.println("CommandButton : actionListener with params");
		final String msg = "Hello "+this.value;
		return "actionresult2?faces-redirect=true&amp;msg="+msg;
	}
	
	// should be void
	public void secondaryAction2(final String param1, final String param2) {
		System.out.println("Secondary Action 2 : param1 : " + param1 + ", param 2 : " + param2);
//		final String msg = "Hello "+this.value;
//		return "actionresult2?faces-redirect=true&amp;msg="+msg;
	}
	
	// should be void
	public void secondaryAction1(final String param1) {
		System.out.println("Secondary Action 1 : " + param1);
//		final String msg = "Hello "+this.value;
//		return "actionresult2?faces-redirect=true&amp;msg="+msg;
	}
	
	public void ajaxMethod(final AjaxBehaviorEvent event) {
		System.out.println("ActionBean2 : Ajax Method Called");
		
	}
	
	
}
