package Calculadora;

import java.util.Scanner;

public class Calculadora_Geral {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); /** salvando o scanner com o nome leitor */
        System.out.println("Olá! bem vindo ao aplicativo de calculadora");
        System.out.println("Poderia começar me falando seu primeiro número? pode ser inteiro ou decimal");
        System.out.println("Obs: Por favor preencha o valor do número com o separador em vírgula (,) e não em ponto (.)");
        System.out.println("Exemplos: 150,00 CORRETO ✔️/// 150.00 ERRADO ✕  ");

        double numberOne = leitor.nextDouble();

        System.out.println("Agora, precisarei do segundo número:");

        double numberTwo = leitor.nextDouble();

        System.out.println("Por fim, pode me falar a operação a ser realizada?");
        System.out.println("Obs: Utilize apenas o símbolo da operação, conforme segue:");
        System.out.println("Adição + ");
        System.out.println("Subtração - ");
        System.out.println("Divisão / ");
        System.out.println("Multiplicação * ");
        
        String operacao = leitor.next();

        if(operacao.equals("+")) {
            double calcularNumero = numberOne + numberTwo;

            System.out.println("O resultado é " + calcularNumero);

        }
        else if (operacao.equals("-")) {
                double calcularNumero = numberOne - numberTwo;

            System.out.println("O resultado é " + calcularNumero);

        }
            else if (operacao.equals("*")) {
                double calcularNumero = numberOne * numberTwo;

            System.out.println("O resultado é " + calcularNumero);

        }
            else if (operacao.equals("/")){
                double calcularNumero = numberOne - numberTwo;

            System.out.println("O resultado é " + calcularNumero);

        }

    }


    }
