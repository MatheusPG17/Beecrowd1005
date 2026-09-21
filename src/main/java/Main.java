
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        //Variaveis
        double notaA, notaB, MEDIA;
        
        //entrada de dados
        notaA = leia.nextDouble();
        notaB = leia.nextDouble();
        
        //processamento
        MEDIA = ((notaA * 3.5) + (notaB * 7.5)) / 11;
        
        //saida de dados
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}
