public class councilHouse extends house {
	private double futureV;
	private String design;

	public councilHouse(String builder, int area, double price, double futureV, String design) {
		super(builder, area, price);
		this.futureV = calfutureV();
		this.design = design;
	}
	
	public void setDesign(String design) {
		this.design = design;
	}
	
	public String getDesign() {
		return design;
	}
	
	public double calfutureV() {
		return super.getPrice() * 1.5;		
	}

	public String toString() {
		return "Council House"
			+"\n=====================\n"
			+ super.toString()
			+"\nFuture Value : RM" + futureV
			+"\nInterior Design : " + design;
	}	
}
