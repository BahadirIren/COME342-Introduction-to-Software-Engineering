import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Instrument> inventory = new LinkedList<Instrument>();

	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {

		if (spec instanceof GuitarSpec) {
			inventory.add(new Guitar(serialNumber, price, (GuitarSpec) spec));

		} else if (spec instanceof MandolinSpec) {
			inventory.add(new Mandolin(serialNumber, price, (MandolinSpec) spec));
		}
	}

	public Instrument get(String serialNumber) {
		for (Instrument instrument : inventory) {
			if (instrument.getSerialNumber().equals(serialNumber))
				return instrument;
		}
		return null;
	}

	// search for Guitars
	public List<Instrument> search(GuitarSpec searchSpec) {
		List<Instrument> matchingGuitars = new LinkedList<Instrument>();

		for (Instrument instrument : inventory) {

			if (instrument instanceof Guitar) {
				Guitar guitar = (Guitar) instrument;

				if (guitar.getSpec().matches(searchSpec))
					matchingGuitars.add(guitar);
			}

		}
		return matchingGuitars;
	}

	// search for Mandolins
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

}
