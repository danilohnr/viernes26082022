package cuerposgeometricos;

public class Cilindro {

	public static void main(String[] args) {
		double Arealateral, Areatotal, Volumen, r, h, PerimetroB;
		
		r=5;
		h=8;
		PerimetroB= 2*Math.PI*r;
		Arealateral= PerimetroB*h;
		
		Areatotal= PerimetroB*(h+r);
		
		Volumen= Math.PI*Math.pow(r,2)*h;
		
		System.out.println("Datos del Cilindro: ");
		System.out.println("Radio: "+r);
		System.out.println("Altura: "+h);
		System.out.println("Perimetro de la Base: "+(String.format("%.2f",PerimetroB)));
		System.out.println("Area Lateral: "+(String.format("%.2f",Arealateral)));
		System.out.println("Area Total: "+(String.format("%.2f",Areatotal)));
		System.out.println("Volumen: "+(String.format("%.2f",Volumen)));
		}

}
