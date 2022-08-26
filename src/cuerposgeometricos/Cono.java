package cuerposgeometricos;

public class Cono {

	public static void main(String[] args) {
	
		float r =2, h=8;
		double g, areaLateral,areaTotal,volumen;
		
		g = Math.sqrt((Math.pow(h,2)+(Math.pow(r,2))));
		areaLateral = Math.PI*r*g;
		areaTotal = Math.PI*r*(g+r);
		volumen = (Math.PI*Math.pow(r,2)*h)/3;
		
		System.out.println("Datos:");
		System.out.println("La Altura es: " + h);
		System.out.println("El radio es: " + r);
		System.out.println("********************");
		System.out.println("El area lateral es: "+(String.format("%.2f",areaLateral)));
		System.out.println("El area Total es: "+(String.format("%.2f",areaTotal)));
		System.out.println("El Volumen es: "+(String.format("%.2f",volumen)));
	}

}
