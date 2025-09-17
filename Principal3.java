package ex3;

import java.util.ArrayList;

public class Principal3 {

    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);

        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(3);
        num2.add(4);
        num2.add(5);
        num2.add(6);

        ArrayList<Integer> resultado = elementosExclusivos(num1, num2);

        System.out.println(resultado);
        System.out.println("A quantidade de numeros unicos é: " + resultado.size());
     }

    public static ArrayList<Integer> elementosExclusivos(ArrayList<Integer> num1, ArrayList<Integer> num2) {
        ArrayList<Integer> resultado = new ArrayList<Integer>();

        for (Integer elemento : num1) {
            if (!num2.contains(elemento)) {
                resultado.add(elemento);
            }
        }

        for (Integer elemento : num2) {
            if (!num1.contains(elemento)) {
                resultado.add(elemento);
            }
        }

        return resultado;
    }
}
