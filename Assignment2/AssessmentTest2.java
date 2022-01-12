package assesment2;

public class AssessmentTest2 {

	public static void main(String[] args) {
		Janitor j = new Janitor();
		System.out.println("Janitor Base Hours "+j.getHours());
		System.out.println("Janitor Base Vaccation "+j.getVacationDays());

		System.out.println("Janitor Base Salary "+j.getSalary());

		j.clean();

		

	}

}
