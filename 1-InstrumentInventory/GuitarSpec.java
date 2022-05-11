import Enums.Builder;
import Enums.Type;
import Enums.Wood;

public class GuitarSpec extends InstrumentSpec {

	private int numString;

	public GuitarSpec(Builder builder, String model, Type type, int numString, Wood backWood, Wood topWood) {
		super.setBuilder(builder);
		super.setModel(model);
		super.setType(type);
		super.setTopWood(topWood);
		super.setBackWood(backWood);
		this.numString = numString;

	}

	public Builder getBuilder() {
		return super.getBuilder();
	}

	public void setBuilder(Builder builder) {
		super.setBuilder(builder);
	}

	public String getModel() {
		return super.getModel();
	}

	public void setModel(String model) {
		super.setModel(model);
		;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	public int getNumString() {
		return numString;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	public boolean matches(GuitarSpec otherSpec) {

		if (!super.matches(otherSpec)) {
			return false;
		}

		if (numString != otherSpec.getNumString()) {
			return false;
		}

		return true;
	}
}
