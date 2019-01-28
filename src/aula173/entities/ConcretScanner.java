package aula173.entities;

public class ConcretScanner extends Device implements Scanner {

	public ConcretScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public String scan() {

		return "Scanned content";
	}

	@Override
	public void processDoc(String doc) {

		System.out.println("Scanner processing: " + doc);

	}

}
