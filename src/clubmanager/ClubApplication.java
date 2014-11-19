package clubmanager;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClubApplication {


public static void main(String args[])
	{

	//Club z=  new Club();
	//z.getNumber(j);
//	z.addMember("Murugesan","Thiru","valluvan");
//	z.addMember("Renganathan", "Gowtham", "Karthick");
//	z.addMember("R","shiva","Niranjan");
//	
//	//z.showMember();
//	//z.removeMember(1);
//	//z.showMember();
//	//z.removeMember(2);
//	//	z.showMember();
//	z.addFacility("Cricket"," 5 kit are available");
//	z.addFacility("Badmitton", "10 bat are available");
//	z.addFacility("Volley ball", "10 balls are available");
//	//z.showfacilities();
//	//	z.getFacility("Cricket");
//	z.show();
	
	//DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
	Date start= Calendar.getInstance().getTime();
	Date end = Calendar.getInstance().getTime();
	//String startdate= df.format(start);
	
//	Calendar c = Calendar.getInstance();
//	c.setTime(new Date());
//	c.add(Calendar.DATE, 1);
	Member m1= new Member(3,"Murugan","Raga", "Vendren");
	Facility f1 = new Facility("Basketball","Two basketball court are available");
	Member m2 = new Member(4,"karthick","Sunder","Shiva");
	
	Booking bk = new Booking(start,start,m1,f1);
	System.out.println(bk.toString());
	BookingRegister br = new BookingRegister();
	br.addBooking(m2, f1, start, end);
	}
}
