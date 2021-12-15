import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        // Create variables
        int mat, physics, chemistry, turkish, history, music;

        // Define scanner class
        Scanner inp = new Scanner(System.in);

        // Get lesson's notes
        System.out.println("Your mat note: ");
        mat = inp.nextInt();

        System.out.println("Your physics note: ");
        physics = inp.nextInt();

        System.out.println("Your chemistry note: ");
        chemistry = inp.nextInt();

        System.out.println("Your turkish note: ");
        turkish = inp.nextInt();

        System.out.println("Your history note: ");
        history = inp.nextInt();

        System.out.println("Your music note: ");
        music = inp.nextInt();

        // Get total average
        double avg = (mat + physics + chemistry + turkish + history + music) / 6d;

        // Check average is greather than 60 or not
        boolean result = avg > 60;

        String str = result ? "You pass." : "You left.";
        System.out.println(str);

    }
}
