package dependenciesSample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class User {

	private String name;
	private String email;
	private Date creationDate;
	
	public User(String name, String email)
	{
		this.name = name;
		this.email = email;
		this.creationDate = Calendar.getInstance().getTime();
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		User other = (User) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");

		return "User [name=" + name + ", email=" + email + ", creationDate=" + formatter.format(creationDate) + "]";
	}	
}
