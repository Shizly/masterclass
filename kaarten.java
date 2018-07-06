package kaarten;

public class kaarten {
	
	public static void main(String[] args) {

		int[] volgorde = {7,4,2,4,6,8,4};
		
		for (int i = 1; i < 7; i++) {
			int a = volgorde [i];
			//	System.out.println(a);
			int vorigeIndexWaarde = (i-1);
			System.out.println(vorigeIndexWaarde);
			
		if (volgorde[i] > volgorde[vorigeIndexWaarde]) {
			System.out.println("groter dan");
		}
		else
		{
		System.out.println("kleiner dan");	
		}
	}
	
	}
}
