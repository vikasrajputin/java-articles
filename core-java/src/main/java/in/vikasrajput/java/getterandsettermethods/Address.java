package in.vikasrajput.java.getterandsettermethods;

public class Address {

	private String city;
	private String pin;

	public Address(String city2, String pin2) {
		this.city = city2;
		this.pin = pin2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
}
