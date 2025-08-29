/**
 * Escreva um algoritmo
 * que calcule e imprima
 * na tela a área de um
 * triângulo, onde:
 */

package aula002;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a altura do triangulo: ");
        float altura = leia.nextInt();
        System.out.println("Digite a base do triangulo: ");
        float base = leia.nextInt();

        float area = (base * altura)/2;
        System.out.println("A area desse triângulo é %.2f" + area);
    }
}
