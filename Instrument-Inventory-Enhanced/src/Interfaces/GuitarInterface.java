package Interfaces;

public interface GuitarInterface {

	// ----------------- Price -----------------
	public void setPrice(double price);

	public double getPrice();

	// ----------------- Builder -----------------
	public void setBuilder(String builder);

	public String getBuilder();

	// ----------------- Model -----------------
	public void setModel(String model);

	public String getModel();

	// ----------------- Type -----------------
	public void setType(String type);

	public String getType();

	// ----------------- TopWood -----------------
	public void setTopWood(String topWood);

	public String getTopWood();

	// ----------------- BackWood -----------------
	public void setBackWood(String backWood);

	public String getBackWood();

	// ----------------- SerialNumber -----------------
	public void setSerialNumber(String serialNumber);

	public String getSerialNumber();

}
