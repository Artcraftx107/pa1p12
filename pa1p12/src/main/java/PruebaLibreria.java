import libreria.*;

public class PruebaLibreria {
    public static void main(String[] args) {
        Libreria libs1 = new Libreria();
        libs1.addLibro("george orwell", "1984", 8.20);
        libs1.addLibro("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?", 3.50);
        libs1.addLibro("Isaac Asimov", "Fundación e Imperio", 9.40);
        libs1.addLibro("Ray Bradbury", "Fahrenheit 451", 7.40);
        libs1.addLibro("Aldous Huxley", "Un Mundo Feliz", 6.50);
        libs1.addLibro("Isaac Asimov", "La Fundación", 7.30);
        libs1.addLibro("William Gibson", "Neuromante", 8.30);
        libs1.addLibro("Isaac Asimov", "Segunda Fundación", 8.10);
        libs1.addLibro("Isaac Newton", "arithmetica universalis", 7.50);
        libs1.addLibro("George Orwell", "1984", 6.20);
        libs1.addLibro("Isaac Newton", "Arithmetica Universalis", 10.50);
        System.out.println(libs1);
        libs1.remLibro("George Orwell", "1984");
        libs1.remLibro("Aldous Huxley", "Un Mundo Feliz");
        libs1.remLibro("Isaac Newton", "Arithmetica Universalis");
        System.out.println(libs1);
        System.out.println("PrecioFinal(Philip K. Dick, ¿Sueñan los androides con ovejas eléctricas?): "+libs1.getPrecioFinal("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?"));
        System.out.println("PrecioFinal(isaac asimov, fundación e imperio): "+libs1.getPrecioFinal("isaac asimov", "fundación e imperio"));
        System.out.println("PrecioFinal(Ray Bradbury, Fahrenheit 451): "+libs1.getPrecioFinal("Ray Bradbury", "Fahrenheit 451"));
        System.out.println("PrecioFinal(Isaac Asimov, La Fundación): "+libs1.getPrecioFinal("Isaac Asimov", "La Fundación"));
        System.out.println("PrecioFinal(william gibson, neuromante): "+libs1.getPrecioFinal("william gibson", "neuromante"));
        System.out.println("PrecioFinal(Isaac Asimov, Segunda Fundación): "+libs1.getPrecioFinal("Isaac Asimov", "Segunda Fundación"));
        System.out.println("PrecioFinal(Isaac Newton, Arithmetica Universalis): "+libs1.getPrecioFinal("Isaac Newton", "Arithmetica Universalis"));
    }
}
