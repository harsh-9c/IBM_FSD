package employee_app;

public class Location {
	
	private String locationName;
	private String cityName;
	private int zipcode;
	
	public Location(String locationName, String cityName, int zipcode) {
		this.locationName = locationName;
		this.cityName = cityName;
		this.zipcode = zipcode;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Location [locationName=" + locationName + ", cityName=" + cityName + ", zipcode=" + zipcode + "]";
	}
	
	
	
	

}
