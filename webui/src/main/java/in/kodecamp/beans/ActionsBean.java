package in.kodecamp.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ActionsBean {
  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String action1() {
    final String msg = "Hello " + this.value;
    return "actionresult?faces-redirect=true&amp;msg=" + msg;
  }

  public String action2() {
    final String msg = "Hello " + this.value;

    return "actionresult?faces-redirect=true&amp;msg=" + msg;
  }
}
