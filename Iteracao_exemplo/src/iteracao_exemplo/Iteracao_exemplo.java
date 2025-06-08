
package iteracao_exemplo;
import java.util.Scanner;
        
public class Iteracao_exemplo {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        int x = 1;
        x--;
        x *= 15 % 2;
        x *= 5;
        
        System.out.println("Valor de x é:" + x);
    }
    
}
