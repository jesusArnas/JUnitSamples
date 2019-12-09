package dependenciesSample;

public class CreateNewUserDate {

	public User Execute(String name, String email)
		throws Exception 
	{
		if (name == null)
			throw new Exception("El nombre no es válido");
		
		if (email == null)
			throw new Exception("El mail no es válido");
		
		return new User(name, email);
	}
}
