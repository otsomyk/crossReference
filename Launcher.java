package crossReferences;

public class Launcher {

	public static void main(String[] args) {
		Man man = new Man();
		Computer computer = new Computer();
		Printer printer = new Printer();
		
		man.receiveReport(printer);
		printer.printReport(computer);
		computer.workOnComputer(man);

	}

}
