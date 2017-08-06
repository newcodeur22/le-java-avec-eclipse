
public class tuto1 {
	public static void main(String[] args) {
		System.out.print("Salut !");
		System.out.println(" Comment t' appele tu ?");
		System.out.println("Moi s' est newcodeur22.");
		System.out.println("Veut tu t' entrainer au maths ?");
		System.out.println("Ok s' est partis.");
		
		int nombre1, nombre2;
		
		nombre1 = 3;
		nombre2 = 2;
		
		int resultat;
		
		// addition
		resultat = nombre1 + nombre2;
		System.out.println(nombre1 + " + " + nombre2 + " = " + resultat);
		
		// soustraction
		resultat = nombre1 - nombre2;
		System.out.println(nombre1 + " - " + nombre2 + " = " + resultat);
		
		// multiplication
		resultat = nombre1 * nombre2;
		System.out.println(nombre1 + " X " + nombre2 + " = " + resultat);
		
		// division
		double resultatDiv;
		resultatDiv = (double) nombre1 / (double) nombre2;
		System.out.println(nombre1 + " / " + nombre2 + " = " + resultatDiv);
	}
}
