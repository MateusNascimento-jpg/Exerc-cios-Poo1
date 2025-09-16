package ex1;

import java.util.ArrayList;

class Principal {
    public static void main(String[] args) {
      
        ArrayList<String> nomes = new ArrayList<>();

      
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Markonz");
        nomes.add("Pedrin");
        nomes.add("Alberto");

        // Imprimir lista inicial
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
