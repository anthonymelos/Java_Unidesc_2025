/*
Uma equação do segundo
grau tem a forma ax2+bx+c=0. a, b e c são
chamados de coeficientes.
• Escreva um algoritmo
que:
– Leia os três coeficientes
(valores inteiros);
– Calcule o valor do
discriminante delta:
DELTA = b2-4ac

– Calcule e imprima as raízes
da equação;
 */
package aula006;

import java.util.Scanner;


public class ex4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("=== CALCULADORA DE FUNÇÃO DO SEGUNDO GRAU ===");
        System.out.println("Informe o valor do coeficiente A");
        int a = leia.nextInt();
        System.out.println("Informe o valor do coeficiente B");
        int b = leia.nextInt();
        System.out.println("Informe o valor do coeficiente C");
        int c = leia.nextInt();

        int delta = (b*b) - 4 * a * c;
        System.out.println("O valor de delta é: " + delta);


        if (delta > 0){
            float x1 = (float) ((-b + Math.sqrt(delta))/2 * a);
            float x2 = (float) ((-b - Math.sqrt(delta))/2 * a);
            System.out.println("O valor de x1: " + x1);
            System.out.println("O valor de x2: " + x2);

        }
        else if (delta < 0) {
            System.out.println("Não existem raízes reais ");
        }
        else {
            float x1 = (-b / 2 * a);
            float x2 = (-b / 2 * a);
            System.out.println("O valor de x1 e x2 são iguais, sendo: " + x1);
        }
    }
}
