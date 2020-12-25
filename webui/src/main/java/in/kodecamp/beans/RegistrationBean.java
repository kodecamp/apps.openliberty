package in.kodecamp.beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class RegistrationBean implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  private String name;
  private String address;
  private String contact;

  public RegistrationBean() {
    System.out.println("Constructor: RegistrationBeanUpdated");
    this.name = "Default Name";
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

  public String getContact() {
    return contact;
  }

  public void setContact(String contacts) {
    this.contact = contacts;
  }

  public String goToPage2() {
    return "page2";
  }

  public String goToPage3() {
    return "page3";
  }

  public String goToPage1() {
    return "page1";
  }

  public String navigate(final String to) {
    return to;
  }

  public String register() {
    System.out.println("Name    : " + this.name);
    System.out.println("Address : " + this.address);
    System.out.println("Contact : " + this.contact);
    return "page1";
  }

}
