package libreria;

public class Libro {
    private static double porcIVA = 10.0;
    private String autor;
    private String titulo;
    private double precioBase;
    public Libro(String a, String t, double p){
        if(a==" "){
            throw new IllegalArgumentException("El campo autor no puede estar vacio.");
        }
        else if (t==" ") {
            throw new IllegalArgumentException("El campo titulo no puede estar vacio.");
        }
        else if (p<0) {
            throw new IllegalArgumentException("El precio base no puede ser negativo.");
        }else {
            this.autor = a;
            this.titulo = t;
            this.precioBase = p;
        }
    }
    public String getAutor(){
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    protected double getBaseImponible(){
        double baseImponible = precioBase;
        return baseImponible;
    }

    public double getPrecioFinal(){
        return getBaseImponible()+getBaseImponible()*porcIVA/100;
    }

    @Override
    public String toString() {
        return "("+getAutor()+"; "+getTitulo()+"; "+getPrecioBase()+"; "+porcIVA+"%; "+getPrecioFinal()+")";
    }

    public static double getIVA(){
        return Libro.porcIVA;
    }
    public static void setIVA(double updatedIVA){
        Libro.porcIVA = updatedIVA;
    }

}
