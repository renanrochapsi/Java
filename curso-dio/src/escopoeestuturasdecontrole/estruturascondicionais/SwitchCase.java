package escopoeestuturasdecontrole.estruturascondicionais;

import java.util.Scanner;
public class SwitchCase {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Que dia é hoje? ");
        String diaDaSemana = scanner.nextLine();

        switch (diaDaSemana){
            case "Segunda":{
                System.out.println("hoje é segunda-feira.");
                break;
            }
            case "Sábado":{
                System.out.println("hoje é sábado.");
                break;
            }
        }

    }


}
