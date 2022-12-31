import Interfaces.GuitarInterface;

public class Guitar extends Instrument implements GuitarInterface {

	private String model, type, topWood, backWood;

	public Guitar() {
	}

	public Guitar(String serialNumber, double price, String builder, String model, String type, String topWood,
			String backWood) {

		setSerialNumber(serialNumber);
		setPrice(price);
		setBuilder(builder);
		setModel(model);
		setType(type);
		setTopWood(topWood);
		setBackWood(backWood);
	}

	// ----------------- Price -----------------
	public void setPrice(double price) {
		super.setPrice(price);
	}

	public double getPrice() {
		return super.getPrice();
	}

	// ----------------- Builder -----------------
	public void setBuilder(String builder) {
		super.setBuilder(builder);
	}

	public String getBuilder() {
		return super.getBuilder();
	}

	// ----------------- Model -----------------
	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	// ----------------- Type -----------------
	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	// ----------------- TopWood -----------------
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}

	public String getTopWood() {
		return topWood;
	}

	// ----------------- BackWood -----------------
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public String getBackWood() {
		return backWood;
	}

	// ----------------- SerialNumber -----------------
	public void setSerialNumber(String serialNumber) {
		super.setSerialNumber(serialNumber);
	}

	public String getSerialNumber() {
		return super.getSerialNumber();
	}

}