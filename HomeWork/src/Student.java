
public class Student extends User{
	private String lastName;
	private String firstName;
	private String nationalIdentity;
	
	public Student() {
	}

	public Student(String lastName, String firstName, String nationalIdentity) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.nationalIdentity = nationalIdentity;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

}
