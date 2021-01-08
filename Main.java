import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input:");
        String result = Number.getResult(in.next());
        if (result != null) {
            System.out.println("Output:\n" + result);
        }

    }
}
