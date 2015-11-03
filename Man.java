package crossReferences;

public class Man {
	String name = "Vasya";

	public String getName() {
		return name;
	}

	public void receiveReport(Printer printer) {
		System.out.println(this.getName() + " receive report from "
				+ printer.getName());
	}
}
