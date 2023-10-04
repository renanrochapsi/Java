package fundamentos.aprendendoasintaxe.desafiocontaterminal;
import java.util.Scanner;
public class ContaBanco {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nº da sua conta: ");
        int conta  = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nº da sua sua agência: ");
        String agencia  = scanner.nextLine();

        System.out.println("Sua conta e agência são: " + conta + " e " + agencia);

        String senha = scanner.nextLine();

        scanner.close();
    }

}

