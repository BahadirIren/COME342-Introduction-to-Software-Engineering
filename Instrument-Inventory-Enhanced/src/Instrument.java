import Interfaces.InstrumentInterface;

abstract class Instrument implements InstrumentInterface {

	private String serialNumber, builder;
	private double price;

	// ----------------- SerialNumber -----------------
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	// ----------------- Builder -----------------
	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getBuilder() {
		return builder;
	}

	// ----------------- Price -----------------
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

}
