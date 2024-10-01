public class Parameters{
	public static void main(String[] args)
	{
      email(1,"My  first mail");
      email(2,"My second mail");
      email(3,"My third mail");
      phoneCall(6282063,"Shiva",91);
      phoneCall(8113822,"Swathi",971);
      phoneCall(8971649,"Rijesh",974);
      login("swathinairudma@gmail.com","swathi1323");
      login("shiva@gmail.com","shva1323");
      login("riju2001@gmail.com","riju2001");
	}
	public static void email(int id,String subject)
	{
	System.out.println("\nemailId:"+id+"\nSubject:"+subject);
	}
	public static void phoneCall(int mobNum,String name,int countryCode)
	{
		System.out.println("\nMobile_Number:"+mobNum+"\nName:"+name+"\nCountry_Code:"+countryCode);
	}
	public static void login(String email,String password)
	{
		System.out.println("\nEmail is:"+email+"\nPassword:"+password);

	}

}