public class testhouse {

	public static void main(String[] args) {
		house[] houseArray = new house[2];
		houseArray[0] = new councilHouse("Abimura ltd.", 1055, 100000,0, "House with parlour");
		houseArray[1] = new duplexHouse("Archway House ltd.", 855, 80000,0, "House without parlour");
		
		for(int i = 0; i <= 1; i++) {
			System.out.println(houseArray[i]);
			System.out.println("");
		}
	}

}
