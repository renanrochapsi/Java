package escopoeestuturasdecontrole.estruturascondicionais;

public class BreakContinue {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                // interrompe o loop
                break;
            System.out.print(numero + ", ");

        }
        System.out.println(" ");
        for (int numero2 = 1; numero2 <= 5; numero2++) {
            if (numero2 == 3)
                // pula o loop
                continue;
            System.out.print(numero2 + ", ");

        }


    }
}
