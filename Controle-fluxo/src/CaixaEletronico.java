public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.99;
        double valorSolicitado = 21.90;

        if (valorSolicitado < saldo) { // Condicional simples
        
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo disponível no valor de: " + saldo);
            
        }else
        System.out.println("Saldo insuficiente.");
    }
}
