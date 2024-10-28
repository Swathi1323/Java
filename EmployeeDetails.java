public class EmployeeDetails
{
    int employeeId;
	String employeeName;
	String employeePlace;
	String phoneNo;
	int employeeAge;

	public EmployeeDetails()
	{
	System.out.println("this is a no parameter constructor");
	}
	public EmployeeDetails(int employeeId)
	{
	this.employeeId=employeeId;
	}
	public EmployeeDetails(int employeeId,String employeeName)
	{
	this(employeeId);
	this.employeeName=employeeName;
	}
	public EmployeeDetails(int employeeId,String employeeName,String employeePlace)
	{
	this(employeeId,employeeName);
	this.employeePlace=employeePlace;
	}
	public EmployeeDetails(int employeeId,String employeeName,String employeePlace,String phoneNo)
	{
	this(employeeId,employeeName,employeePlace);
	this.phoneNo=phoneNo;
	}
	public EmployeeDetails(int employeeId,String employeeName,String employeePlace,String phoneNo,int employeeAge)
	{
	this(employeeId,employeeName,employeePlace,phoneNo);
	this.employeeAge=employeeAge;
	}

	public void printDetails()
	{
		System.out.println("employeeId:"+employeeId+"\nemployeename:"+employeeName+"\nplace:"+employeePlace+"\nphone number:"+phoneNo+"\nage:"+employeeAge);
	}

}