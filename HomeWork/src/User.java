
public class User {
	private int id;
	private String userNumber;
	
	public User() {
	
	}
	
	public User(int id, String userNumber) {
		this();
		this.id = id;
		this.userNumber = userNumber;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
}
