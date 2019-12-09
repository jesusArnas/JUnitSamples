package dependenciesSample;

import dependenciesWS.SendWelcomeEmailWebService;

public class CreateNewUserWS {

	public boolean Execute(String name, String email)
		throws Exception 
	{
		if (name == null)
			throw new Exception("El nombre no es válido");
		
		if (email == null)
			throw new Exception("El mail no es válido");
		
		SendWelcomeEmailWebService ws = new SendWelcomeEmailWebService();
		ws.send();
		
		return true;
	}
}
