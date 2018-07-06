package kaarten;

public class Effikaarten {

	public static void main(String[] args) {

		int [] volgorde = {7,4,2,4,6,8,4};
		int memory = 0 ;

		for (int i = 0; i < volgorde.length -1; i++) {

			for (int j = 0; j < volgorde.length -1; j++) {
				if (volgorde[j]>memory) {

					memory = volgorde[j];
				
				}
			}
		}
			System.out.println("De volgorde van klein naar groot is " +volgorde[0]+ "," +volgorde[1]+ "," +volgorde[2]+ 
					"," +volgorde[3]+ "," + volgorde[4]+ "," +volgorde[5]+ "," +volgorde[6]);

	}
		
}
