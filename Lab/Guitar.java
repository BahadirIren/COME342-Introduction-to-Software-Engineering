
public class Guitar {

	private String serialNumber, builder, model, type, topWood, backWood;
	private double price;

	public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {

		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.topWood = topWood;
		this.backWood = backWood;
	}

	// ----------------- Price -----------------
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	// ----------------- Builder -----------------
	public String getBuilder() {
		return builder;
	}

	// ----------------- Model -----------------
	public String getModel() {
		return model;
	}

	// ----------------- Type -----------------
	public String getType() {
		return type;
	}

	// ----------------- TopWood -----------------
	public String getTopWood() {
		return topWood;
	}

	// ----------------- BackWood -----------------
	public String getBackWood() {
		return backWood;
	}

	// ----------------- SerialNumber -----------------
	public String getSerialNumber() {
		return serialNumber;
	}

}