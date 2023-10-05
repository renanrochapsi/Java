package ScannerAsFuck;

public class Main {
    public static void main(String[] args) {

        System.out.print("Sua nota da A1 é: ");
        GeneralScanner a1 = new GeneralScanner();

        System.out.print("Sua nota da A2 é: ");
        GeneralScanner a2 = new GeneralScanner();

        System.out.println("Suas notas são: " + " " + a1.getNumber + " " + a2.getNumber);
    }
}