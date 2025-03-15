public class TiposVariaveis {
    
    public static void main (String [] args) throws Exception {
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

    // Variáveis X Constantes
        int numero = 5;

        numero = 10;

        System.out.println(numero);
    
        
        final double VALOR_PI = 3.14;

        System.out.println(VALOR_PI);
    
    // Variáveis do tipo String
        String meuNome = "Juliana";

        System.out.println(meuNome);
    }

}
