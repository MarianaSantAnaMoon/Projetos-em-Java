package pacote;


public class Whileexample {

    
    public static void main(String[] args) {
         // Declaração das variáveis
        int num = 7, i = 0;

        // Definição do laço while
        while(i <= 10){
            // Instruções a serem executadas
            System.out.printf("%d X %d = %d%n", num, i, num * i);

            // Variável contadora
            i++;
        }
    }
    
}
