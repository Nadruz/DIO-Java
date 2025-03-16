public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 6;

        if (nota >= 7) // Condição simples
        System.out.println("Parabéns, você foi aprovado!");

        else if (nota >= 5 && nota < 7) // Condição encadeada
        System.out.println("Recuperação");

        else // Condição composta
        System.out.println("Reprovado");
    }
}

