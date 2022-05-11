import Enums.Builder;
import Enums.Type;
import Enums.Wood;

public abstract class InstrumentSpec {

	private Builder builder;
	private String model;
	private Type type;
	private Wood topWood, backWood;

	public InstrumentSpec(Builder builder, String model, Type type, Wood topWood, Wood backWood) {
		this.setBuilder(builder);
		this.setModel(model);
		this.setType(type);
		this.setTopWood(topWood);
		this.setBackWood(backWood);
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

	public Wood getBackWood() {
		return backWood;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
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
