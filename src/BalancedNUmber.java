import java.util.*;

public class BalancedNUmber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        while (true) {
            String str = in.nextLine();
            input = Integer.parseInt(str);

            if (isExpressionBalanced(input)) {
                sum += input;
            } else break;
        }
        System.out.println(sum);
    }

    private static boolean isExpressionBalanced(int input) {
        int firstDigit = 0;
        int lastDigit = 0;
        if (input != 0) {
            firstDigit = input;
            lastDigit = input;
        }
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        lastDigit %= 10;
        input /= 10;
        input %= 10;

        return (input == (firstDigit + lastDigit));
    }
}