package exercise1;

public abstract class Employee {
	private final  String name;
	private int heures = 0;
	private int ventes = 0;

	protected Employee(String name){

		this.name = name;

	}

	public abstract int computeSalary();

	public void sell() { ventes++;}

	public void workOneHour() { heures++;}

	public String getName() {
		return name;
	}
}
