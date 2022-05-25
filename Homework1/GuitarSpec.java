import Enums.Builder;
import Enums.Type;
import Enums.Wood;

public class GuitarSpec extends InstrumentSpec {

	private int numString;

	public GuitarSpec(Builder builder, String model, Type type, int numString, Wood backWood, Wood topWood) {

		super(builder, model, type, backWood, topWood);
		this.numString = numString;
	}

	public int getNumString() {
		return numString;
	}

	@Override
	public boolean matches(InstrumentSpec otherSpec) {
		
		if (!super.matches(otherSpec))
			return false;

		if (!(otherSpec instanceof GuitarSpec))
			return false;

		if (numString != ((GuitarSpec) otherSpec).getNumString())
			return false;

		return true;

	}

}
