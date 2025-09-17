package ex2;
import java.util.ArrayList; 

class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10); 
        numeros.add(20);
        numeros.add(20); 
        numeros.add(10); 
        numeros.add(30); 
        
        System.out.println("Lista original: " + numeros + "\n");
        
        // Chama a função para obter os elementos únicos
        ArrayList<Integer> unicos = elementosUnicos(numeros);
        
        System.out.println("Lista de elementos únicos: " + unicos + "\n");
        System.out.println("Número de elementos únicos: " + unicos.size() + "\n");
    }
    
    public static ArrayList<Integer> elementosUnicos(ArrayList<Integer> lista) {
        ArrayList<Integer> unicos = new ArrayList<>(); 
        
        for (Integer num : lista) {
            if (!unicos.contains(num)) {
                unicos.add(num); 
            }
        }
        
        return unicos; 
    }
}

