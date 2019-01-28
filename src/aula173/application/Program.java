package aula173.application;

import aula173.entities.ComboDevice;
import aula173.entities.ConcretPrinter;
import aula173.entities.ConcretScanner;

public class Program {

	public static void main(String[] args) {

		ConcretPrinter p = new ConcretPrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		ConcretScanner s = new ConcretScanner("2003");
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());

		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());

	}
}
