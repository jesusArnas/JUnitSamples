package dependenciesSample;

public class CreateNewUserDate {

	public User Execute(String name, String email)
		throws Exception 
	{
		if (name == null)
			throw new Exception("El nombre no es v�lido");
		
		if (email == null)
			throw new Exception("El mail no es v�lido");
		
		return new User(name, email);
	}
}
