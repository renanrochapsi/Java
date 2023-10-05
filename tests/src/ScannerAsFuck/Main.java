package ScannerAsFuck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Sua nota da A1 é: ");
        ScanEverything a1 = new ScanEverything();

        System.out.print("Sua nota da A2 é: ");
        ScanEverything a2 = new ScanEverything();


        System.out.println("Suas notas são: " + " " + a1.getNumber + " " + a2.getNumber);

    }
}
