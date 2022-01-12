package assesment2;

public class Janitor extends Employee{
	
	
	Janitor(){
		super.setBaseSalary(getSalary()-10000);
		super.setBaseVacationDays(getVacationDays()/2);
		super.setBaseHours(getHours()*2);
	}
	
	public void clean() {
		System.out.println("Workin' for the man.");
	}
}
