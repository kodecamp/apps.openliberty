package in.kodecamp.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class AjaxBean1 implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String value;
  private String value1;
  private String value2;
  private String value3;

  private boolean rendered;

  private String result;

  private List<SelectItem> states = new ArrayList<>();
  private Map<String, List<SelectItem>> citiesMap = new HashMap<>();
  private List<SelectItem> cities = new ArrayList<>();

  private String selectedState;
  private String selectedCity;

  @PostConstruct
  public void init() {
    System.out.println("Post Construct...");
    this.rendered = false;
    this.states.add(new SelectItem("up", "Uttar Pradesh"));
    this.states.add(new SelectItem("mp", "Madhya Pradesh"));
    // this.states.add(new SelectItem("mh", "Maharastra"));

    List<SelectItem> upCitites = new ArrayList<>();

    upCitites.add(new SelectItem("lucknow", "Lucknow"));
    upCitites.add(new SelectItem("kanpur", "Kanpur"));
    upCitites.add(new SelectItem("allahabd", "Allahabad"));

    this.citiesMap.put("up", upCitites);

    List<SelectItem> mpCities = new ArrayList<>();

    mpCities.add(new SelectItem("indore", "Indore"));
    mpCities.add(new SelectItem("bhopal", "Bhopal"));
    mpCities.add(new SelectItem("Chambal", "Chambal"));
    this.citiesMap.put("mp", mpCities);

    this.selectedState = "mp";
    this.cities.clear();
    this.cities.addAll(this.citiesMap.get("mp"));

  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getValue1() {
    return value1;
  }

  public void setValue1(String value1) {
    this.value1 = value1;
  }

  public String getValue2() {
    return value2;
  }

  public void setValue2(String value2) {
    this.value2 = value2;
  }

  public String getValue3() {
    return value3;
  }

  public void setValue3(String value3) {
    this.value3 = value3;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public boolean isRendered() {
    return rendered;
  }

  public void setRendered(boolean visible) {
    this.rendered = visible;
  }

  public List<SelectItem> getStates() {
    return states;
  }

  public void setStates(List<SelectItem> states) {
    this.states = states;
  }

  public List<SelectItem> getCities() {
    return cities;
  }

  public void setCities(List<SelectItem> cities) {
    this.cities = cities;
  }

  public String getSelectedState() {
    return selectedState;
  }

  public void setSelectedState(String selectedState) {
    this.selectedState = selectedState;
  }

  public String getSelectedCity() {
    return selectedCity;
  }

  public void setSelectedCity(String selectedCity) {
    this.selectedCity = selectedCity;
  }

  public void action() {
    System.out.println("ActionBean1 : action");
    System.out.println("value 1 : " + this.value1);
    System.out.println("value 2 : " + this.value2);
    System.out.println("value 3 : " + this.value3);

    this.result = this.value1 + "_" + this.value2 + "_" + this.value;
    this.rendered = false;
  }

  public void preAction(final ActionEvent event) {
    System.out.println("AjaxBean1 : preAction ");
  }

  public void fetchCities() {
    System.out.println("fetch cities called...");
    System.out.println(this.selectedState);
    List<SelectItem> currentCities = this.citiesMap.get(this.selectedState);
    System.out.println("current citites : " + currentCities);
    this.cities.clear();
    this.cities.addAll(currentCities);
  }

  public void doSomething() {
    System.out.println("do something");
  }
}
