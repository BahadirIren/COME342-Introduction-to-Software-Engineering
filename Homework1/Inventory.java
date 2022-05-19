import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Instrument> inventory = new LinkedList<Instrument>();

	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {

		if (spec instanceof GuitarSpec) // done check the spec if it is from GuitarSpec
		{
			inventory.add(new Guitar(serialNumber, price, spec)); // done complete the block

		} else if (spec instanceof MandolinSpec) // done check the speck if it is from MandolinSpec
		{
			inventory.add(new Mandolin(serialNumber, price, spec)); // done complete the block
		}
	}

	public Instrument get(String serialNumber) {
		for (Instrument instrument : inventory) // done update the for loop
		{
			if (instrument.getSerialNumber().equals(serialNumber))
				return instrument;
		}
		return null;
	}

	///// done you will write two different search functions
	///// done for guitar and mandolin

	public List<Instrument> search(MandolinSpec searchSpec) {
		List<Instrument> matchingMandolins = new LinkedList<Instrument>();

		for (Instrument instrument : inventory) {

			if (instrument instanceof Mandolin) {
				Mandolin mandolin = (Mandolin) instrument;

				if (mandolin.getSpec().matches(searchSpec))
					matchingMandolins.add(mandolin);
			}
		}

		return matchingMandolins;
	}

	public List<Instrument> search(GuitarSpec searchSpec) {
		List<Instrument> matchingGuitars = new LinkedList<Instrument>();

		for (Instrument instrument : inventory) {

			if (instrument instanceof Guitar) {
				Guitar guitar = (Guitar) instrument; /////// done use the casting at the right hand side

				if (guitar.getSpec().matches(searchSpec)) // done complete this line (its similar to last week code)
					matchingGuitars.add(guitar);
			}

		}
		return matchingGuitars;
	}

	// done right the search function for Mandolin.
	// done look at the above function for help.

}
