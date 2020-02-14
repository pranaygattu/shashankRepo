package Service;

import javax.net.ssl.SSLEngineResult.Status;

import DAO.RegDao;
import DAO.RegistrationDto;


public class RegService {

	public boolean RegService(RegistrationDto rtd) {
		RegDao rd = new RegDao();
		boolean status = rd.RegisDao(rtd);
		
		
		return status;
	}

}
