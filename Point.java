package tp1.java;

public class Point {
	private String nom;
	private int abscisse;
	private int ordonnée;
	
	public Point (String n , int abs , int ord) {
		nom =n;
		abscisse=abs;
		ordonnée=ord;
	}
	
	public Point (int abs , int ord) {
		abscisse=abs;
		ordonnée=ord;
	}
	
	public Point (String n) {
		nom = n;
	}
	
	void affiche() {
		System.out.println(nom+"("+abscisse+","+ordonnée+")");
	}
	
	void TranslHoriz (int a) {
		abscisse += a;
	}
	
	void TranslVert (int a) {
		ordonnée += a;
	}
	
	void Translation (int a, int b) {
		TranslHoriz(a);
		TranslVert(b);
	}
	
	String getNom() {
		return nom;
	}
	
	int getAbscisse() {
		return abscisse;
	}
	
	int getOrdonnées() {
		return ordonnée;
	}
	
	void setNom(String ch) {
		nom =ch;
	}
	
	void setAbscisse(int a) {
		abscisse =a;
	}
	
	void setOrdonnée(int a) {
		ordonnée =a;
	}
	
	
	
	
	
	
	
	
	
}
