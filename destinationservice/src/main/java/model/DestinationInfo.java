package model;

public class DestinationInfo {
	
	private String name;
	private int postalCode;
	private String description;
	
	public DestinationInfo(){
		
	}
	
	public DestinationInfo(String name, int postalCode, String description){
		this.name = name;
		this.postalCode = postalCode;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
