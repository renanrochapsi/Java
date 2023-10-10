package escopoeestuturasdecontrole.estruturascondicionais;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TernarioBalada {

    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Quantos anos você tem? ");
        int idade = scanner.nextInt();

        String entrada = idade >= 18 ? "Entrada permitida" : "Entrada negada";
        System.out.println(entrada);
    }



}
