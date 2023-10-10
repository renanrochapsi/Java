package escopoeestuturasdecontrole.estruturascondicionais;

public class BreakContinueFrutas {

    public static void main(String[] args) {

        String[] frutas = {"banana", "maçã", "laranja", "limão", "abacaxi"};

        // Loop para imprimir todas as frutas
        for (int i = 0; i < frutas.length; i++) {
            System.out.print(frutas[i] + " ");
        }

        System.out.println();

        // Loop para imprimir as frutas - maçã
        for (String fruta : frutas){
            if (fruta.equals("maçã")){
                continue;
            }

            // vai exibir banana laranja limao abacaxi
            System.out.print(fruta + " ");
        }

        System.out.println();

        // Loop para imprimir as frutas até maçã
        for (String fruta : frutas){
            if (fruta.equals("maçã")){
                break;
            }

            // vai exibir banana laranja limao abacaxi
            System.out.print(fruta + " ");
        }

    }
}
