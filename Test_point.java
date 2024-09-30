package tp1.java;

public class Test_point {

	public static void main(String[] args) {
		Point p1;
		p1 = new Point (3, 5);
		Point p2 = new Point ("a");
		Point p3 = new Point ("b", 3,5);
		System.out.println("\n ---------------------------\n");
		System.out.println("les points créés sont :");
		p1.affiche ();
		p2.affiche ();
		p3.affiche ();
		System.out.println("\n ---------------------------\n");
		System.out.println("\n ---------------------------\n");
		System.out.println("translation des point ");
		p1.TranslHoriz (4);
		p2.TranslVert (3);
		p3.Translation (5,2);
		p1.affiche ();
		p2.affiche ();
		p3.affiche ();
		System.out.println("\n ---------------------------\n");
		System.out.println("modification des attributs des points") ;
		p1.setNom("SRI21");
		p2.setAbscisse(25);
		p3.setOrdonnée(50);
		p1.affiche ();
		p2.affiche ();
		p3.affiche ();
		System.out.println("\n ---------------------------\n");
		System.out.println("utilisation des méthodes get");
		String x=p1.getNom();
		int y=p1.getAbscisse();
		int z=p1.getOrdonnées();
		System.out.println(" le nom du point p1 est : " + x);
		System.out.println(" son abscisse est : " + y);
		System.out.println(" son ordonnée est : " + z);

	}

}
