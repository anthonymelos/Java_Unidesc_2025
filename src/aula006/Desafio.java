/*
Escreva um algoritmo
que:
– Leia dois números inteiros do usuário;
– Exiba um menu com as opções:
• Somar os dois números;
• Subtrair os dois números;
• Multiplicar os dois números;
– O algoritmo deve executar a opção escolhida e exibir o resultado.
 */

package aula006;

import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        float numero1 = leia.nextFloat();
        System.out.println("Digite outro numero: ");
        float numero2 = leia.nextFloat();
        int opcao;
        System.out.println("Informe uma operação: ");
        System.out.println("1- Somar");
        System.out.println("2- Multiplicar");
        System.out.println("3- Dividir");
        System.out.println("4- Subtrair");

        opcao = leia.nextInt();
        switch (opcao){
            case 1:
                float soma =  numero1 + numero2;
                System.out.println("O resultado é: " +soma);
                break;
            case 2:
                float multiplica = numero1 * numero2;
                System.out.println("O resultado é: " +multiplica);
                break;
            case 3:
                float dividir = numero1 / numero2;
                System.out.println("O resultado é: " +dividir);
                break;
            case 4:
                float subtrair = numero1 - numero2;
                System.out.println("O resultado é: " +subtrair);
                break;
            default:
                System.out.println("Operação inválida! ");
        }
    }
}
