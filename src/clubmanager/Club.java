package clubmanager;

public class Club

{
	private int currentNumber=0;

	private Member members[] =new Member[50];
		public void addMember(String surname, String firstName,String secondName)
		{
		
			members[currentNumber]=new Member(currentNumber,surname,firstName,secondName);
			currentNumber++;
		
		}
		public void showMember()
		{
		
			for(int i=0;i< members.length;i++)
				if(members[i]!=null)
			{
				System.out.println(members[i].show());
			}
				else System.out.println("no member in this space");
		} 
		public void removeMember(int currentNumber)
		{
			this.currentNumber=currentNumber;
			members[currentNumber]=null;
		}
}
