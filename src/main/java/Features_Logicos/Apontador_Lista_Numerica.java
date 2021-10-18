package Features_Logicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Apontador_Lista_Numerica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Retorno o maior e melhor número dentro de uma lista que terá o tamanho que você quiser! \nBasta digitar quantos elementos ela terá");
        int quantidadeNumeros = leitor.nextInt();

        System.out.println("Ótimo! então sua lista terá, " + quantidadeNumeros + " elementos, Agora, poderia me falar quais são estes números? Um por vez, não vale trapacear!");

        List<Double> numeriko = new ArrayList<>();
        for (int i = 0; i < quantidadeNumeros; i++){
            numeriko.add(leitor.nextDouble());
        }

        System.out.println( "Achei o número que você queria! É o número " + Collections.max(numeriko) + ".");
        System.out.println( "Em contrapartida, também achei o número mais tímido... É o número " + Collections.min(numeriko) + ".");


    }
}
