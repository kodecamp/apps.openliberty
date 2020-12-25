package in.kodecamp.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class ContactsBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String contact;
	private String selectedServiceProvider;

	private List<SelectItem> serviceProviders = new ArrayList<>();
	private List<ContactDetails> contacts = new ArrayList<>();

	@Inject
	private ItemsUtil itemsUtil;

	// never use constructor
	public ContactsBean() {

		// this.serviceProviders = itemsBo.items();
	}

	@PostConstruct
	public void init() {
		this.serviceProviders.clear();
		this.serviceProviders.addAll(itemsUtil.items());
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public List<ContactDetails> getContacts() {
		return contacts;
	}

	public String getSelectedServiceProvider() {
		return selectedServiceProvider;
	}

	public void setSelectedServiceProvider(String selectedServiceProvider) {
		this.selectedServiceProvider = selectedServiceProvider;
	}

	public List<SelectItem> getServiceProviders() {
		return serviceProviders;
	}

	public void setServiceProviders(List<SelectItem> serviceProviders) {
		this.serviceProviders = serviceProviders;
	}

	public void addNew() {
		System.out.println();
		this.contacts.add(new ContactDetails(this.contact, this.selectedServiceProvider));
	}
}
