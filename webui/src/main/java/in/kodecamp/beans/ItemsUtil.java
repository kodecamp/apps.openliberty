package in.kodecamp.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.faces.model.SelectItem;

@Dependent
public class ItemsUtil implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public List<SelectItem> items() {
		final List<SelectItem> items = new ArrayList<>();
		items.add(new SelectItem("airtel", "Airtel"));
		items.add(new SelectItem("vodafone", "Vodafone"));
		items.add(new SelectItem("idea", "Idea"));
		return items;
	}
}
