package Interfaces;

public interface InstrumentInterface {

	// ----------------- SerialNumber -----------------
	public void setSerialNumber(String serialNumber);

	public String getSerialNumber();

	// ----------------- Builder -----------------
	public void setBuilder(String builder);

	public String getBuilder();

	// ----------------- Price -----------------
	public void setPrice(double price);

	public double getPrice();

}
