package ex4;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(11);
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(15);
        num.add(16);
        num.add(17);

        System.out.println(num);

       
        int indice = menorNumero(num);

        System.out.println("O menor número é: " + num.get(indice));
    }

   
    private static int menorNumero(ArrayList<Integer> lista) {
        int indiceMenor = 0;
        int menor = lista.get(0);

        for (int i = 0; i < lista.size(); i++) {
            int elemento = lista.get(i);

            if (elemento < menor) {
                menor = elemento;
                indiceMenor = i;
            }
        }

        return indiceMenor;
    }
}
