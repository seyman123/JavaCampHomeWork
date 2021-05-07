
public class Instructor extends User {
	private String firstName;
	private String lastName;
	private String sallary;
	
	public Instructor() {
	}
	
	public Instructor(String firstName, String lastName, String sallary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sallary = sallary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSallary() {
		return sallary;
	}

	public void setSallary(String sallary) {
		this.sallary = sallary;
	}

	
	
	
}
