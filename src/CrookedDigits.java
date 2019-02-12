import java.util.Scanner;

public class CrookedDigits {


    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String input = scann.nextLine();
        int sum = 0;
        do {
            sum = 0;
            char[] charNumber = input.toCharArray();
            for (int i = 0; i < charNumber.length; i++) {
                if (charNumber[i] == 45) continue;
                if (charNumber[i] == 46) continue;
                sum +=charNumber[i] - '0';
            }
            if (sum < 10) {
                System.out.println(sum);
            }
            input = Integer.toString(sum);
        } while (sum > 9);
    }
}

