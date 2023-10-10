package escopoeestuturasdecontrole.estruturascondicionais;

public class ForEmArrays {

    public static void main(String[] args) {
        String alunos [] = {"Felipe", "João", "Carlos", "Paulo", "Maria", "José", "Leopoldina", "Francisca"};

        for (int i = 0; i< alunos.length; i++){
            System.out.println("o aluno(a) no índice " + i + " é " + alunos[i] + ".");
        }

        for (String aluno : alunos){
            System.out.println("O nome do aluno " + aluno.length() + " é " + aluno);
        }
    }

}
