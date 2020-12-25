package in.kodecamp.beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ActionResultBean {

  private String result;

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
    this.onLoad();
  }

  @PostConstruct
  public void init() {
    System.out.println("ActionResultBean : " + this.result);

  }

  public String onLoad() {
    System.out.println("ActionResultBean : OnLoad : Value : " + this.result);
    return "";
  }

}
