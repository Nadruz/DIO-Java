import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.00;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada; 

            System.out.println("Doce do valor de: " + valorDoce + " Adicionado ao carrinho");

            mesada = mesada - valorDoce;
        }
        
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda a mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
    
