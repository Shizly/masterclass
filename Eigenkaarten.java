package kaarten;

public class Eigenkaarten {

	public static void main(String[] args) {

		int [] volgorde = {7,4,2,4,6,8,4};
		int memory;
		
		for (int i = 0; i < volgorde.length -1; i++) {
			for (int j = 0; j < volgorde.length -1; j++) {
				if (volgorde[j]>volgorde [j+1]) {
	
					memory = volgorde[j];
					volgorde [j] = volgorde [j+1];
					volgorde[j+1] = memory;					
				}
			}
		}
			System.out.println("De volgorde van klein naar groot is " +volgorde[0]+ "," +volgorde[1]+ "," +volgorde[2]+ 
					"," +volgorde[3]+ "," + volgorde[4]+ "," +volgorde[5]+ "," +volgorde[6]);
	}
		
}
