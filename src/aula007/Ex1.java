
//Escreva um algoritmo que receba um número inteiro maior que zero. Calcule o fatorial desse número

package aula007;


import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o número a ser fatorado: ");
        int fatorial = input.nextInt();
        int i = 1;
        int resultado = 1;

        while (i <= fatorial){
            resultado = resultado * i;
            i++;
        }
        System.out.println("O Fatorial de " + fatorial + "é " + resultado);


    }
}
