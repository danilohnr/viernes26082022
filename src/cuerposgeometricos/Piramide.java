package cuerposgeometricos;

public class Piramide {

	public static void main(String[] args) {
		// declaracion de variables
		double h, l,ap, Ap,Pbase, Abase, areaLateral, areaTotal, volumen;
		//datos de enterada
		h = 13;
		l = 5;
		
		//procesamiento de datos
		
		ap = l/2;
		Ap = Math.sqrt(h*h + ap * ap);
		Pbase = (4 * l);
		areaLateral = (Pbase * Ap)/2;
		Abase = (l*l);
		areaTotal = areaLateral + Abase;
		volumen = ((Abase*h)/3);
		
		//Datos de salida
		System.out.println("La ALTURA de la pireamide es: " + h);
		System.out.println("2.La longitud de los lados de la base es: " + l);
		System.out.println("2.El Apotema de la piramide es: " + ap);
		System.out.println("1.El Perimetro de la base de la piramide es: " + Pbase);
		System.out.println("2.El Area de la base de la piramide es: " + Abase);
		System.out.println("3.El AREA LATERAL de la piramide es: " + String.format("%.2f", areaLateral));
		System.out.println("4.El AREA TOTAL de la piramide es: " + String.format("%.2f", areaTotal));
		System.out.println("5.El Volumen de la pirtamide es: " + String.format("%.2f", volumen));
		
	
	}

}
