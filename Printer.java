package crossReferences;

public class Printer {

	private String name = "Canon";

	public String getName() {
		return name;
	}

	public void printReport(Computer computer) {
		System.out.println(computer.getName() + " send report to "
				+ this.getName());
	}
}
