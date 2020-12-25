package in.kodecamp.beans;

public class ContactDetails {
	private String number;
	private String serviceProvider;
	
	public ContactDetails(final String number, final String serviceProvider) {
		this.number = number;
		this.serviceProvider = serviceProvider;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	
	
}
