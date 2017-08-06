
public class calcule {
	public static void main(String[] args) {
		int nombre1, nombre2;
		
		nombre1 = 3;
		System.out.println(nombre1);
		
		nombre2 = 2;
		System.out.println(nombre2);
		
		int resultat;
		resultat = nombre1 + nombre2;
		System.out.println(nombre1 + " + " + nombre2 + " = " + resultat);
		
		resultat = nombre1 - nombre2;
		System.out.println(nombre1 + " - " + nombre2 + " = " + resultat);
		
		resultat = nombre1 * nombre2;
		System.out.println(nombre1 + " X " + nombre2 + " = " + resultat);
		
		double resultatDiv = (double) nombre1 / (double) nombre2;
		System.out.println(nombre1 + " / " + nombre2 + " = " + resultatDiv);
	}
}
