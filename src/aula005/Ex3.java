/*
Escreva um algoritmo que calcule e imprima na tela a área de um trapézio, onde:
– Área = ((Base menor + Base maior) x Altura ) / 2
 */

package aula005;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a base menor: ");
        float base = leia.nextFloat();
        System.out.println("Informe a base menor: ");
        float base2 = leia.nextFloat();
        System.out.println("Informe a altura: ");
        float altura = leia.nextFloat();

        float area = ((base + base2) * altura ) / 2;
        System.out.println("A área do trapézio é: " + area);
    }
}
