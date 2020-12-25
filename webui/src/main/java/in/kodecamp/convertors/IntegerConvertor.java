package in.kodecamp.convertors;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("integerConvertor")
public class IntegerConvertor implements Converter<Integer> {

	@Override
	public Integer getAsObject(FacesContext context, UIComponent component, String value) {
		System.out.println("String value : " + value);
		Integer objIntValue = null;
		
		try {
			
			objIntValue = Integer.parseInt(value);
		}catch(NumberFormatException nfEx) {}
		return objIntValue;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Integer value) {
		return value.toString();
	}

}
