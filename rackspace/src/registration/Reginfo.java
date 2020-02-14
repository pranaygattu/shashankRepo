package registration;

import java.util.ArrayList;

import database.Regdao;
import database.Regdetails;

public class Reginfo {
public ArrayList<Regdetails> getRegdetails(){
	Regdao rr = new Regdao(); 
	ArrayList al = rr.getdetails();
	return al;
	
}
}
