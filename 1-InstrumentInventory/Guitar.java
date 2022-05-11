class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpec spec;

	public Guitar(String serialNumber, double price, GuitarSpec spec) {

		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	// ----------------- Price -----------------
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	// ----------------- SerialNumber -----------------
	public String getSerialNumber() {
		return serialNumber;
	}

	public GuitarSpec getSpec() {
		return spec;
	}

}