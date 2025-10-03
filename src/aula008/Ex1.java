/**
 * Escreva um algoritmo que:
 * – Leia uma tabela de 5 nomes
 * de alunos e 5 notas finais;
 * – Imprima a tabela na tela;
 * – Imprima o nome de todos
 * os alunos que obtiveram
 * nota final acima da média;
 * – Determine e imprima o
 * nome do aluno que obteve
 * a maior nota;
 * – Dado um nome de aluno,
 * imprima sua nota (o aluno
 * pode não estar na tabela). Caso não esteja o nome no array, adicione o nome e a nota.
 */

package aula008;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nomes[] = new String[6];
        double notas[] = new double[6];

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "° nome: ");
            nomes[i] = leia.nextLine();
        }

        for (int j = 1; j <= 5; j++) {
            System.out.println("Digite a " + j + "° nota: ");
            notas[j] = leia.nextDouble();
        }

        System.out.println("--- Tabela ---");
        for (int k = 1; k <= 5; k++) {
            System.out.println("Nome: " + nomes[k] + " | Nota: " + notas[k]);
        }

        System.out.println("Alunos com nota acima da média: ");
        for (int l = 1; l <= 5; l++) {
            if (notas[l] > 7) {
                System.out.println(nomes[l]);
            }
        }
        double maior = Integer.MIN_VALUE;
        int indiceMaior = -1;
        for (int m = 0; m < notas.length; m++) {
            if (notas[m] > maior) {
                maior = notas[m];
                indiceMaior = m;
            }
        }
        System.out.println("Maior: " + maior);

        System.out.println("Digite um nome a ser pesquisado: ");
        String nomePesquisado = leia.nextLine();

        for(String nome : nomes){
            if (nomePesquisado.equals(nome)) {
                System.out.println("O nome " + nome + "consta na tabela");
            } else {
            System.out.println("Este nome não está na tabela!");
        }
        }


    }
}


