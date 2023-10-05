package ExemplosChatGPT.POO;

class Carro {

    //Atributos:
    String marca;
    String modelo;

    int ano;

    int tanque;

    //Método dirigir
    void dirigir() {
        System.out.println("Dirigindo " + marca + " " + modelo + " " + ano);
    }

    void abastecer() {
        if (tanque <= 50){
            System.out.println("Você deve abastecer seu " + modelo);
        } else {
            System.out.println("seu " + modelo + " " + "está com bastante combustível");
        }
    }

}


