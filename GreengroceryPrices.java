import java.util.Scanner;
public class   GreengroceryPrices {
    public static void main(String[] args) {
        double Apple = 3.67, Pear = 2.14, Tomato = 1.11, Banana = 0.95, Eggplant = 5.00;
        Scanner sc = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        double armut = sc.nextInt();

        System.out.print("Elma kaç kilo? : ");
        double elma = sc.nextInt();

        System.out.print("Domates kaç kilo? : ");
        double domates = sc.nextInt();

        System.out.print("Muz kaç kilo? : ");
        double muz = sc.nextInt();

        System.out.print("Patlıcan kaç kilo? : ");
        double patlican = sc.nextInt();

        double sum = (Apple*elma)+(Pear*armut)+(Banana*muz)+(Tomato*domates)+(Eggplant*patlican);

        System.out.printf("Toplam: %.2f", sum);


    }
}
