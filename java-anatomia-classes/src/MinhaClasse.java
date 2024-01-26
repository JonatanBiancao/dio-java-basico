import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro nome: ");
        String entrada = scanner.nextLine();
        System.out.println("Digite o sobrenome: ");
        String entrada2 = scanner.nextLine();
        String nomeCompleto = nomeCompleto(entrada, entrada2);
        System.out.println("Seu nome completo é " + nomeCompleto);

        scanner.close();
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
