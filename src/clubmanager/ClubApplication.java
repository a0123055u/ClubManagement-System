package clubmanager;

public class ClubApplication {


public static void main(String args[])
	{

	Club z=  new Club();
	//z.getNumber(j);
	z.addMember("Murugesan","Thiru","valluvan");
	z.addMember("Renganathan", "Gowtham", "Karthick");
	z.addMember("R","shiva","Niranjan");
	
	//z.showMember();
	//z.removeMember(1);
	//z.showMember();
	//z.removeMember(2);
//	z.showMember();
z.addFacility("Cricket"," 5 kit are available");
z.addFacility("Badmitton", "10 bat are available");
z.addFacility("Volley ball", "10 balls are available");
//z.showfacilities();
//	z.getFacility("Cricket");
	z.show();
	}
}
