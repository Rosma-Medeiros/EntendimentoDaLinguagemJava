package Calculadora;

import java.util.Scanner;

public class Porcentagem_Gorjeta {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in); /** salvando o scanner com o nome leitor */
        System.out.println("Olá! Bem Vindo ao Calculador de Serviço 8000!");
        System.out.println("Eu sou uma aplicação que calcula a taxa de serviço de uma conta, poderia começar me dizendo qual o valor da conta?");
        System.out.println("Obs: Por favor preencha o valor da conta com o separador em vírgula (,) e não em ponto (.)");
        System.out.println("Exemplos: 150,00 CORRETO ✔️/// 150.00 ERRADO ✕ ");

        Double valorConta = leitor.nextDouble();

        System.out.println("Certo, poderia me falar qual a porcentagem do serviço a ser calculada?");
        System.out.println("Nota: Conforme a lei nº 13.419/2017, a taxa de serviço é facultativa e não tem limite mínimo ou máximo.");
        Double taxaServico = leitor.nextDouble();


        if (taxaServico > 0) {

            System.out.println("O valor da sua conta é R$" + valorConta);
            System.out.println("O valor da sua taxa de serviço é R$: " + valorConta * (taxaServico / 100));
            System.out.println("O valor final é: R$" + valorConta * ((taxaServico / 100) + 1));


        }

        else {
            System.out.println("Desculpe, não há nada que eu possa calcular aqui.");

        }
    }
}
