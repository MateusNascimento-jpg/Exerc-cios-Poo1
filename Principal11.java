package ex11;
import java.util.ArrayList;

public class Principal11 {
    public static void main(String[] args) {

        // Criar lista de nomes
        ArrayList<String> nomes = new ArrayList<>();

      
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Markonz");
        nomes.add("Pedrin");
        nomes.add("Alberto");

     
        System.out.println("Lista inicial: " + nomes + "\n");

        System.out.println("O tamanho da lista é: " + nomes.size() + " elementos!\n");

      
        if (nomes.contains("Maria")) {
            System.out.println("A lista contém Maria!\n");
        } else {
            System.out.println("Maria não está na lista :(\n");
        }

       
        nomes.remove(0);
        System.out.println("Lista após remoção do primeiro elemento: " + nomes);
    }
}
