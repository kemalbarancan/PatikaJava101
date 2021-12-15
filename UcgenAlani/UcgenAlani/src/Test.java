import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        double a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.println("1.Kenarı Giriniz: ");
        a = input.nextDouble();

        System.out.println("2.Kenarı Giriniz: ");
        b = input.nextDouble();

        System.out.println("3.Kenarı Giriniz: ");
        c = input.nextDouble();

        double u = (a+b+c) / 2;

        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: " +alan);



    }
}
