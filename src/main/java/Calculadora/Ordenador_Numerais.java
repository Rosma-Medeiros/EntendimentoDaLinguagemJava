package Calculadora;

import java.util.Scanner;

public class Ordenador_Numerais {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, sou uma aplicação que ordena números dentre um trio, poderia me falar o primeiro número?");
        double numbeone = leitor.nextDouble();

        System.out.println("Certo, agora poderia me falar o segundo número?");
        double numbetwo = leitor.nextDouble();

        System.out.println("Por fim, pode me falar o terceiro número?");
        double numbethree = leitor.nextDouble();

        if (numbeone > numbetwo && numbeone > numbethree) {
            System.out.println("O maior número é " + numbeone);
        }
        else if (numbetwo > numbeone && numbetwo > numbethree) {
            System.out.println("O maior número é " + numbetwo);
        }
        else {
            System.out.println("O maior número é " + numbethree);
        }


    }
}
