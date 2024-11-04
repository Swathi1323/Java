public class AloysiusCollege extends CollegeDetails{
	
	int numberOfDepartments;
	int numberOfClassRooms;

	public AloysiusCollege(HeadOfDepartment[] hod, Principal principal, Students[] student, Professors[] professors, int numberOfDepartments, int numberOfClassRooms){
		super(hod, principal, student, professors);
		this.numberOfDepartments = numberOfDepartments;
		this.numberOfClassRooms = numberOfClassRooms;
	}

	public void printDetails(){

		System.out.println("Alosius College\n_____________________");

		for(int i = 0; i<hod.length; i++){
			System.out.println("\nHOD Information\n___________________");
			hod[i].printDetails();
		}

		
			System.out.println("\nPrincipal Information\n______________________");
			principal.printDetails();
		

		for(int i = 0; i<professors.length; i++){
			System.out.println("\nProfessor Information\n____________________");
			professors[i].printDetails();
		}

		for(int i = 0; i<student.length; i++){
			System.out.println("\nStudent Information\n_______________________");
			student[i].printDetails();
		}

		System.out.println("\nNumber of Department is:"+numberOfDepartments);
		System.out.println("Noumber of Classes is:"+numberOfClassRooms);
	}
}