import Enums.Builder;
import Enums.Type;
import Enums.Wood;

public abstract class InstrumentSpec {

	private Builder builder;
	private String model;
	private Type type;
	private Wood topWood, backWood;

	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public boolean matches(InstrumentSpec otherSpec) {

		if (getBuilder() != otherSpec.getBuilder()) {
			return false;
		}

		String model = this.getModel().toLowerCase();
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.getModel().toLowerCase()))) {
			return false;
		}

		if (getType() != otherSpec.getType()) {
			return false;
		}

		if (getBackWood() != otherSpec.getBackWood()) {
			return false;
		}

		if (getTopWood() != otherSpec.getTopWood()) {
			return false;
		}

		return true;
	}

}
