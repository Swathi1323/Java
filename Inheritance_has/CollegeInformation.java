public class CollegeInformation{

	public static void main(String[] args) {

		HeadOfDepartment hod1 = new HeadOfDepartment("Swathi", 50, 100000.00f, "MCA");
		HeadOfDepartment hod2 = new HeadOfDepartment("Prajina", 52, 100000.00f, "MBA");

		HeadOfDepartment[] hod = {hod1, hod2};

		Principal principal1 = new Principal("Rajesh", 88, 1000000.00f, 4);

		Professors professor1 = new Professors("Shivanand", 30, 40000.00f, "JAVA");
		Professors professor2 = new Professors("Rijesh", 30, 45000.00f, "C++");
		Professors professor3 = new Professors("Manish", 35, 42000.00f, "Python");
		Professors professor4 = new Professors("Athul", 40, 35000.00f, "JavaScript");

		Professors[] professor = {professor1, professor2, professor3, professor4};


		Students student1 = new Students("Soumya", 20, "MCA");
		Students student2 = new Students("Soundarya", 21, "MBA");
		Students student3 = new Students("Sumith", 23, "MCA");
		Students student4 = new Students("Sumanth", 24, "MBA");
		Students student5 = new Students("Arjun", 23, "MCA");
		Students[] student = {student1,student2, student3, student4, student5};



		AloysiusCollege aloy = new AloysiusCollege(hod, principal1, student, professor,4,12);
		aloy.printDetails();




		HeadOfDepartment hod3 = new HeadOfDepartment("Prajina", 55, 65000.00f, "MCA");
		HeadOfDepartment hod4 = new HeadOfDepartment("Swathi", 45, 65000.00f, "MBA");

		HeadOfDepartment[] ram_hod = {hod3, hod4};

		Principal principal2 = new Principal("Murali", 60, 1000000.00f, 2);

		Professors professor5 = new Professors("Rekha", 28, 40000.00f, "JAVA");
		Professors professor6 = new Professors("Prakiriti", 30, 45000.00f, "Python");
		Professors professor7 = new Professors("Saraswathi", 35, 42000.00f, "C++");
		Professors professor8 = new Professors("Sudheesh", 40, 35000.00f, "JavaScript");

		Professors[] ram_professor = {professor5, professor6, professor7, professor8};


		Students student0 = new Students("Sathvik", 24, "MCA");
		Students student6 = new Students("Sanjay", 25, "MBA");
		Students student7 = new Students("Pankaj", 23, "MCA");
		Students student8 = new Students("Harish", 24, "MBA");
		Students student9 = new Students("Anoop", 23, "MCA");
		Students[] ram_student = {student0,student6, student7, student8, student9};



		RamayyaCollege ram = new RamayyaCollege(ram_hod, principal2, ram_student, ram_professor,15);
		ram.printDetails();

	}
}
