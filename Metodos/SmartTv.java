package Metodos;
public class SmartTv {
    boolean ligada = false;
    int canal = 12;
    int volume = 30;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal ++;
    }

    public void diminuirCanal(){
        canal --;
    }

    public void aumentarVolume(){
        volume ++;

        System.out.println("Auemtando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume --;

        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

}