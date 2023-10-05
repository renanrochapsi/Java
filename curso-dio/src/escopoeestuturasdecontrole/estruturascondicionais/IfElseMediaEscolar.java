package escopoeestuturasdecontrole.estruturascondicionais;

import java.util.Scanner;

public class IfElseMediaEscolar {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite sua nota da A1: ");
        double notaA1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("digite sua nota da A2: ");
        double notaA2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("digite sua nota da A3: ");
        double notaA3 = scanner.nextInt();
        scanner.nextLine();

        double media = (notaA1 + notaA2 + notaA3) / 3;
        double mediaArredondada = Math.round(media * 10.0) / 10.0;
        if (media >= 7) {
            System.out.print("Você passou, sua média é " + mediaArredondada + ".");
        } else if (mediaArredondada < 7 && mediaArredondada > 5.1) {
            System.out.print("Sua média é " + mediaArredondada + ", você está de recuperação.");
        } else System.out.print("Sua média é " + mediaArredondada + ", você rodou.");


    }
}