package Service;
import DAO.LoginDao;
public class LoginService {

	public boolean isValidUser(String username, String password) {
		LoginDao id = new LoginDao();
		boolean flag =  id.isValidUser(username,password);
		
		return flag;
	}

	

}
