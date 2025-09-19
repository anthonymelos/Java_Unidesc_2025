//Escreva um programa que
//– Coloque dois números inteiros em duas variáveis, o primeiro para a
// variável  A, e o segundo para a variável B;
//– Imprima os valores de A e B na tela;
//– Em seguida, troque entre si os valores de A e B;
//– Reimprima na tela os valores de A e B.

package aula005;

public class Ex1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 0;

        System.out.println(a +" e "+ b);

        c = a;
        b = c;
        a = c;


    }
}
