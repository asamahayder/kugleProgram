import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius;
        Scanner scan =new Scanner(System.in);
        System.out.println("indtast en radius:");
        radius=scan.nextDouble();

        Kugle kugle =new Kugle(radius);

        System.out.println("volumen er: " +kugle.beregnVolumen() );

    }
}
