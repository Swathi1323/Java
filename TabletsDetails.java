public class TabletsDetails
{
	static Tablets[] tabletDetails=new Tablets[8];
	public static void main(String[] args)
	{
	Tablets tab=new Tablets("apple",12.9f,3000,128);
	Tablets tab1=new Tablets("Samsung",14.6f,5000,256);
	Tablets tab2=new Tablets("Microsoft",13f,11200,512);
	Tablets tab3=new Tablets("Lenovo",11.2f,8600,128);
	Tablets tab4=new Tablets("Amazon",10.1f,10050,256);
	Tablets tab5=new Tablets("Xiaomi",11f,8600,128);
	Tablets tab6=new Tablets("Asus",9.7f,5900,512);
	Tablets tab7=new Tablets("Acer",9.4f,4000,128);
	saveData(tab);
	saveData(tab1);
	saveData(tab2);
	saveData(tab3);
	saveData(tab4);
	saveData(tab5);
	saveData(tab6);
	saveData(tab7);
	for(int i=0;i<tabletDetails.length;i++)
	{
		if(tabletDetails[i]!=null)
		{
			tabletDetails[i].displayDetails();
		}
	}
	}

	public static boolean saveData(Tablets tab)
	{
	for(int i=0;i<tabletDetails.length;i++)
	{
	if(tabletDetails[i]==null)
	{
	tabletDetails[i]=tab;
	return true;
	}

}
return false;
}
}
