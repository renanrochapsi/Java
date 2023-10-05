package ExemplosChatGPT.poo;

public class Main {
    public static void main(String[] args) {
        Carro corolla = new Carro();
        corolla.marca = "Toyota";
        corolla.modelo = "Corolla ";
        corolla.ano = 2017;
        corolla.tanque = 100;

        // Chamando o método dirigir do objeto
        corolla.dirigir();
        // Chamando o metodo abastecer, que criei
        corolla.abastecer();

        Carro civic = new Carro();
        civic.marca = "Honda";
        civic.modelo = "Civic ";
        civic.ano = 2020;
        civic.tanque = 25;

        civic.dirigir();
        civic.abastecer();
    }
}

/* SAÍDA:
Dirigindo Toyota Corolla  2017
seu Corolla  está com bastante combustível
Dirigindo Honda Civic  2020
Você deve abastecer seu Civic
*/