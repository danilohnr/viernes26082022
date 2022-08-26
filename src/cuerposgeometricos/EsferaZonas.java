package cuerposgeometricos;

public class EsferaZonas {
 public static void main (String[] args) {
	 
	 float h,r,R;
	 double AreaZonaEsferica,AreaCasqueteEsferico,VolumenZonaEsferica,VolumenCasqueteEsferico;
	 
	 
	 r=2;
	 h=6;
	 R=8;
	 
	 
	 AreaZonaEsferica=2*Math.PI*R*h;
	 VolumenZonaEsferica=(Math.PI *h)*(Math.pow(h,2)+(3*Math.pow(R,2)+(3*Math.pow(r, 2))));
	 AreaCasqueteEsferico=2*Math.PI*R*h;
	 VolumenCasqueteEsferico=(Math.PI *Math.pow(h,2)*(3*R-h))/3;
	 
	 System.out.println("Radio menor: "+r);
	 System.out.println("Radio mayor: "+R);
	 System.out.println("Altura: "+h);
	 System.out.println("Datos de las zonas esfericas");
	 System.out.println("Zona esferica");
	 System.out.println("1.Area de la zona esferica: "+ String.format("%.2f",AreaZonaEsferica));
	 System.out.println("2.Volumen de la zona esferica: "+ String.format("%.2f",VolumenZonaEsferica));
	 System.out.println("Casquete esferico");
	 System.out.println("1.Area de los casquetes esfericos: "+ String.format("%.2f",AreaZonaEsferica));
	 System.out.println("2.Volumen de los casquetes esfericos: "+ String.format("%.2f",VolumenCasqueteEsferico));
	 
	 
 }
}
