package pacote;


public class Whileexample {

    
    public static void main(String[] args) {
         // Declara��o das vari�veis
        int num = 7, i = 0;

        // Defini��o do la�o while
        while(i <= 10){
            // Instru��es a serem executadas
            System.out.printf("%d X %d = %d%n", num, i, num * i);

            // Vari�vel contadora
            i++;
        }
    }
    
}
