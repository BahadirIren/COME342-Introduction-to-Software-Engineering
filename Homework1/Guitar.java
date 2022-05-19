
public class Guitar extends Instrument { // done complete extends

	public Guitar(String serialNumber, double price, InstrumentSpec spec) {

		super(serialNumber, price, spec); // done complete the constructor
	}

	@Override
	public String toString() {

		return "guitar";
	}

}
