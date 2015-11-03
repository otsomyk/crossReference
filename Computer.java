package crossReferences;

public class Computer {
	String name = "PC";

	public String getName() {
		return name;
	}

	public void workOnComputer(Man man) {
		System.out.println(man.getName() + " works on " + this.getName());
	}
}