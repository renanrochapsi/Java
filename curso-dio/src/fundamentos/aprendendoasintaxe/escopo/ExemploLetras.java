package fundamentos.aprendendoasintaxe.escopo;

//Uma variavel declarada dentro de um bloco se limita a esse bloco

public class ExemploLetras {

    String letraA = "a";
    String letraB = "b";

    public static void main(String[] args) {
        // System.out.print(letraA); => OCORRERA UM ERRO,
        // DEVIDO A VARIAVEL LETRA TER SIDO DECLARADA FORA DO ESCOPO DO MÉTODO

        // CRIANDO O OBJETO LETRAS
        ExemploLetras letras = new ExemploLetras();

        System.out.println(letras.letraA);
        System.out.println(letras.letraB);

    }
}