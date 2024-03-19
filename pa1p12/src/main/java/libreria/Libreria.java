package libreria;

import java.util.ArrayList;
public class Libreria {
    private ArrayList<Libro> libs;
    public Libreria(){
        this.libs = new ArrayList<>();
    }
    public void addLibro(String a, String t, double p){
        Libro newLib = new Libro(a, t, p);
        anyadirLibro(newLib);
    }
    public void remLibro(String a, String t){
        int found = buscarLibro(a, t);
        if(found != -1){
            libs.remove(found);
        }else {
            throw new RuntimeException("Libro no encontrado ("+a+", "+t+")");
        }
    }
    public double getPrecioFinal(String a, String t) {
        int indice = buscarLibro(a, t);
        double pFinal;
        if(indice==-1){
            throw new RuntimeException("Libro no encontrado ("+a+", "+t+")");
        }else{
            Libro lib = this.libs.get(indice);
            pFinal = lib.getPrecioFinal();
        }
        return pFinal;
    }

    @Override
    public String toString() {
        String resultado = "[";
        for (int i = 0; i<libs.size(); i++){
            resultado+=libs.get(i).toString();
            if(i<libs.size()-1){
                resultado+=", ";
            }
        }
        return resultado+"]";
    }

    protected void anyadirLibro(Libro lib){
        int index = buscarLibro(lib.getAutor(), lib.getTitulo());
       if (index != -1){
           this.libs.set(index, lib);
       }else{
           this.libs.add(lib);
       }
    }
    private int buscarLibro(String a, String t){
        int found = 0;
        boolean encontrado = false;
        while(found<libs.size() && !encontrado){
            Libro aux = this.libs.get(found);
            if(aux.getAutor().equalsIgnoreCase(a) && aux.getTitulo().equalsIgnoreCase(t)){
                encontrado = true;
            }else{
                found++;
            }
        }
        if(!encontrado){
            found = -1;
        }
        return found;
    }
}
