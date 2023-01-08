import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int numbers = scanner.nextInt();
        for (int i = 2; i < numbers; i++) {
            boolean check = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}
