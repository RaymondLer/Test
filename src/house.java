public class house {
	protected String builder;
	protected int area;
	protected double price;

	public house(String builder, int area, double price) {
		this.builder = builder;
		this.area = area;
		this.price = price;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getBuilder() {
		return builder;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getArea() {
		return area;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "House Builder : " + builder
				+"\nArea      : " + area + " sq ft"
				+"\nPrice     : RM " +price; 
	}
}
