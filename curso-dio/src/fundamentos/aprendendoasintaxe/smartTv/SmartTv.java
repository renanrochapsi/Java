package fundamentos.aprendendoasintaxe.smartTv;

public class SmartTv {

    boolean ligada=false;
    int canal=1;
    int volume = 25;


    public void ligar(){
        ligada=true;
        if (ligada == true ){
            System.out.println("A tv está ligada");
        }
    }
    public void desligar(){
        ligada=false;
        if (ligada == false ){
            System.out.println("A tv está desligada");
        }
    }
}
