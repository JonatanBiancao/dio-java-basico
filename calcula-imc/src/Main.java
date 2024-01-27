import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String nome;
        double peso;
        double altura;
        double imc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        System.out.println("Informe sua altura: ");
        altura = scanner.nextDouble();
        System.out.println("Informe seu peso: ");
        peso = scanner.nextDouble();
        scanner.nextLine();

        imc = calcularImc(altura, peso);

        System.out.println("Olá " + nome + ", seu IMC é de: " + imc);
        
        if (imc < 18.5){
            System.out.println("Baixo Peso");
        }else if(imc < 24.9){
            System.out.println("Peso Adequado");
        }else if(imc < 29.9){
            System.out.println("Sobre Peso");
        }else if(imc < 34.9){
            System.out.println("Obesidade grau 1");
        }else if(imc < 39.9){
            System.out.println("Obesidade grau 2");
        }else{
            System.out.println("Obesidade grau 3");
        }

    }

    public static double calcularImc(double altura, double peso){
        return peso/(altura*altura);
    } 
}
