public class ComparacaoAvancada {

    //Valor e referência
        String nome1 = "JAVA";
        String nome2 = "JAVA";
            
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
            
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
            
        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??

    //== versus equals
        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2); //true
        
        Integer numero11 = 130;
        Integer numero22 = 130;
        System.out.println(numero11 == numero22); //false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals        
        System.out.println(numero11.equals(numero22)); 
    
    //Expressões lógicas avançadas
        int numero111 = 1;
        int numero222 = 1;

        if(numero111== 2 & numero222 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero111);
        System.out.println("O numero 2 agora é " + numero222);

        // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )
}
