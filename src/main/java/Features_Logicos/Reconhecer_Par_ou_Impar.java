package Features_Logicos;

import java.util.Scanner;

public class Reconhecer_Par_ou_Impar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número, reconhecerei se ele é par ou ímpar");
        double num = leitor.nextDouble();

        if (num == 0){
            System.out.println("A ciência ainda não tem essa resposta, porque eu teria?");
        }
        else if (num % 2 ==0){
            System.out.println("O seu número " + num + " é Par.");
        }
        else {
            System.out.println("O seu número " + num + " é Ímpar.");
        }
    }
}
