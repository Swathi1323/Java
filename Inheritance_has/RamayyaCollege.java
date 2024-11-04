public class RamayyaCollege extends CollegeDetails{
	
	int numberOfEvents;
	

	public RamayyaCollege(HeadOfDepartment[] hod, Principal principal, Students[] student, Professors[] professors, int numberOfFestivals){
		super(hod, principal, student, professors);
		this.numberOfEvents = numberOfEvents;
	}

	public void printDetails(){

		System.out.println("\nRamayya College Details\n______________________");

		System.out.println("\nPrincipal Information\n_________________________");
		principal.printDetails();

		for(int i = 0; i<hod.length; i++){
			System.out.println("\nHOD Information\n_________________________");
			hod[i].printDetails();
		}
		

		for(int i = 0; i<professors.length; i++){
			System.out.println("\nProfessor Information\n________________________");
			professors[i].printDetails();
		}

		for(int i = 0; i<student.length; i++){
			System.out.println("\nStudent Information\n__________________________");
			student[i].printDetails();
		}

		System.out.println("\nNumber of Events are:"+numberOfEvents);
		
	}
}
