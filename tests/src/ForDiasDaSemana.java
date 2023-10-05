package tests;

public class ForDiasDaSemana {

    public static void main(String[] args) {

        String[] diasDaSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

        for (int i = 0; i < diasDaSemana.length; i++) {
            System.out.println("Dia " + (i + 1) + ": " + diasDaSemana[i]);
        }
    }

}
