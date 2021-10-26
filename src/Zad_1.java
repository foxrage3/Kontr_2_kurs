import java.util.Scanner;

public class Zad_1 {
    private static boolean between10and20(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(between10and20(a, b));
    }
}
