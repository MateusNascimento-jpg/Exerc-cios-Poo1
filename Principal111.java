package ex111;
import java.util.ArrayList;

public class Principal111 {

	public class ExemploArrayList {
	    public static void main(String[] args) {
	    
	        ArrayList<String> lista = new ArrayList<>();

	      
	        lista.add("Maçã");
	        lista.add("Banana");
	        lista.add("Laranja");
	        lista.add("Uva");

	     
	        System.out.println("Tamanho da lista: " + lista.size());

	     
	        String elementoProcurado = "Banana";
	        
	        if (lista.contains(elementoProcurado)) {
	            System.out.println(elementoProcurado + " está na lista!");
	        } else {
	            System.out.println(elementoProcurado + " não está na lista.");
	        }
	    }
	}


}
