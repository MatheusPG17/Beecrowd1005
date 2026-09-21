
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double notaA, notaB, MEDIA;
        
        notaA = leia.nextDouble();
        notaB = leia.nextDouble();
        
        MEDIA = ((notaA * 3.5) + (notaB * 7.5)) / 11;
        
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}
