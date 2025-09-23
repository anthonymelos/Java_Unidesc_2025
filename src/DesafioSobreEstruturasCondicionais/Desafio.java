/*
Desafio para Casa

Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério,
baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5%
Após o aumento ser realizado, Inflação do período: 3,8%
informe na tela:
o salário antes do reajuste;
O percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento;
o valor do aumento real, descontado a inflação.
 */

package DesafioSobreEstruturasCondicionais;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe seu salario: ");
        float salario = leia.nextFloat();

        if(salario <= 280){
            float aumento = salario * 0.2f;
            float salarioNovo = salario + aumento;
            float salarioReal = salarioNovo - (salarioNovo * 0.038f);
            System.out.println("Seu salário antes do reajuste era de R$" + salario);
            System.out.println("Percentual de aumento aplicado: 20%");
            System.out.println("O valor do aumento foi de R$" + aumento);
            System.out.println("Seu salario reajustado agora é R$" +salarioNovo);
            System.out.println("O valor do aumento real (subtraindo a inflação) foi de R$" + salarioReal);
        }
        else if(salario > 280 && salario <= 700){
            float aumento = salario * 0.15f;
            float salarioNovo = salario + aumento;
            float salarioReal = salarioNovo - (salarioNovo * 0.038f);
            System.out.println("Seu salário antes do reajuste era de R$" + salario);
            System.out.println("Percentual de aumento aplicado: 15%");
            System.out.println("O valor do aumento foi de R$" + aumento);
            System.out.println("Seu salario reajustado agora é R$" +salarioNovo);
            System.out.println("O valor do aumento real (subtraindo a inflação) foi de R$" + salarioReal);
        }
        else if(salario > 700 && salario <= 1500){
            float aumento = salario * 0.1f;
            float salarioNovo = salario + aumento;
            float salarioReal = salarioNovo - (salarioNovo * 0.038f);
            System.out.println("Seu salário antes do reajuste era de R$" + salario);
            System.out.println("Percentual de aumento aplicado: 10%");
            System.out.println("O valor do aumento foi de R$" + aumento);
            System.out.println("Seu salario reajustado agora é R$" +salarioNovo);
            System.out.println("O valor do aumento real (subtraindo a inflação) foi de R$" + salarioReal);
        }
        else{
            float aumento = salario * 0.05f;
            float salarioNovo = salario + aumento;
            float salarioReal = salarioNovo - (salarioNovo * 0.038f);
            System.out.println("Seu salário antes do reajuste era de R$" + salario);
            System.out.println("Percentual de aumento aplicado: 5%");
            System.out.println("O valor do aumento foi de R$" + aumento);
            System.out.println("Seu salario reajustado agora é R$" +salarioNovo);
            System.out.println("O valor do aumento real (subtraindo a inflação) foi de R$" + salarioReal);
        }
    }
}
