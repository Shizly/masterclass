package mastermind;
import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		Scanner scgok = new Scanner(System.in); //waarom (System.in)?
		String een = "groen"; 
		String twee = "blauw";
		String drie = "geel";
		String vier = "zwart";
		
		System.out.println("Welkom bij Mastermind! Raad de 4 kleuren op de juiste plek.\nKies uit blauw, bruin, geel, groen, rood of zwart.");
		boolean doorspelen = true;
// <while (doorspelen) {> hier zorgt ervoor dat i wel optelt, maar stopt het programma niet bij goed antwoord
			for(int i = 0; i < 5; i++) {
	//			while (doorspelen) {	//hier zorgt ervoor dat het programma stopt bij een goed antwoord, maar i wordt gereset naar 0
			System.out.println("Je hebt in totaal 5 pogingen. Je hebt er nu " + i + " gehad."); // 5 - i werkt niet?
			
			System.out.println("Welke kleur moet er op de 1e plek?");
			String antwoord1 = scgok.nextLine();
			System.out.println("Welke kleur moet er op de 2e plek?");
			String antwoord2 = scgok.nextLine();
			System.out.println("Welke kleur moet er op de 3e plek?");
			String antwoord3 = scgok.nextLine();
			System.out.println("Welke kleur moet er op de 4e plek?");
			String antwoord4 = scgok.nextLine();
			
				if (antwoord1.equals(een)){
					System.out.println("Je hebt de eerste kleur goed!");
				}
				if (antwoord2.equals(twee)){;
					System.out.println("Je hebt de tweede kleur goed!");
				}
				if (antwoord3.equals(drie)){ 
					System.out.println("Je hebt de derde kleur goed!");
				}
				if (antwoord4.equals(vier)){
					System.out.println("Je hebt de vierde kleur goed!");
				}
				if (antwoord1.equals(een) && antwoord2.equals(twee) && antwoord3.equals(drie) && antwoord4.equals(vier)){
					doorspelen = false;
					System.out.println("Gefeliciteerd! Je hebt in " + (i + 1) + " poging(en) de code gekraakt");
					i = 5;   // omweg door i = 5 te doen en loop te beëindigen
				}
				if (i == 4) {
					doorspelen = false;
					System.out.println("Helaas! Je hebt de code niet in 5 pogingen gekraakt.");
				}
					
				
// <--- weghalen als while toegevoegd		}
			}
			
	}
/*	In method:
 	static void ant1() {
		if (antwoord1.equals(een)){
			System.out.println("Je hebt de eerste kleur goed!"); 
	Als method <ant1>  gemaakt, kan niet oproepen in de main		
			*/
}
