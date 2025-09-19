/*
Escreva um programa
que receba três valores
numéricos;
– O programa deve
determinar e imprimir o
maior dos três valores.
 */

package aula006;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        float valor1 = leia.nextFloat();
        System.out.println("Digite outro valor: ");
        float valor2 = leia.nextFloat();
        System.out.println("Digite outro valor: ");
        float valor3 = leia.nextFloat();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O valor " + valor1 + " é o maior! ");
        }
        else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O valor " + valor2 + " é o maior! ");
        } else {
            System.out.println("O valor " + valor3 + " é o maior! ");
        }
    }
}
