package math.pow;


public class MathPow {

    
    public static void main(String[] args) {
        for (int d = 10, s = 1; d >= 1 && s <= 10; d--, s++) {
            System.out.printf("%d \t %d \t %.0f\n", d, s, Math.pow(s, d));
    }
    
}
}