package Features_Logicos;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Buscador_Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Type in your date of birth (format: dd/MM/aaaa)");

        LocalDate dataCliente = LocalDate.parse(leitor.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDate dataSistema = LocalDate.parse(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Você tem: " + Period.between(dataSistema, dataCliente).normalized());

    }
}
