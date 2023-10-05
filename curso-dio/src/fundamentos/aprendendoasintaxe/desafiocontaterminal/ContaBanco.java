package fundamentos.aprendendoasintaxe.desafiocontaterminal;
import java.util.Scanner;
public class ContaBanco {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nº da sua sua agência: ");
        String agencia  = scanner.nextLine();

        System.out.print("Digite o nº da sua conta: ");
        int conta  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Sua agência e conta são: " + agencia + " e " + conta);


        System.out.print("Digite o nº da sua sua senha: ");
        int senha  = scanner.nextInt();
        scanner.nextLine();


        if (senha == 1547) {
            System.out.println("Parabéns, você está conectado");
        } else {
            System.out.println("Senha incorreta");
        }


        scanner.close();
    }

}

// Minha contribuição ao código irá ser colocar uma senha no sistema