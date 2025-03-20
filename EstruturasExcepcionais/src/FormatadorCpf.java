package EstruturasExcepcionais.src;

public class FormatadorCpf {
    public static void main(String[] args) {  
        try {
            String cpfFormatado = formatarCpf ("23189001411");

            System.out.println(cpfFormatado);
        }catch (CpfInvalidoException e) {
            System.out.println("O cpf não corresponde com as regras de negócio");
        }
    }

    static String formatarCpf(String cpf) throws CpfInvalidoException{
        if(cpf.length() != 8)
        throw new CpfInvalidoException();
        
        return "231.890.014-11";
    }
}
