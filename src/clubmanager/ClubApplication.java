package clubmanager;

public class ClubApplication {


public static void main(String args[])
	{

	Club z=  new Club();
	//z.getNumber(j);
	z.addMember("ghghh","chvsdh","jbjhfj");
	z.addMember("ttfh", "dlfj", "kfhgf");
	z.addMember("gfhj","ddgg","sfg");
	
	z.showMember();
	z.removeMember(1);
	z.showMember();
	z.removeMember(2);
	z.showMember();

	
	}
}
