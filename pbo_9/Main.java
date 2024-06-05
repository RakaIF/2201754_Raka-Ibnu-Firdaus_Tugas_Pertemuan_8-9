package pbo_9;

public class Main {
    public static void main(String[] args) {

		Person person = new Person("Rayi", "Cimahi", 
			"08655669831", "rayi01@gmail.com");

		Student student = new Student("Dzikri", "Garut", "089561234122", 
			"nomine@gmail.com", Student.TAHUN_AKHIR);

		Employee employee = new Employee("Raka", "Cirebon", "086189311322",
			"raka@gmail.com", 333, 6000000);

		Faculty faculty = new Faculty("Mufid", "Sukabumi", "084133448899",
			"Mufidirsan@gmail.com", 444, 10000000, "07.00 - 16.00", "Doktor");

		Staff staff = new Staff("Risna", "Subang", "082211221112",
			"Fianzi@Gmail.com", 888, 6500000, "Assistant Doktor");

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}