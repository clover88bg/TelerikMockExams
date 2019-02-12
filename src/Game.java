import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String input = scann.nextLine();
        int[] number = new int[3];
        int temp = 1;
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            number[i] = input.charAt(i) - '0';
        }
        for (int j = 0; j < 3; j++) {

            if (number[j] == 1 && (j !=1 || number[0] == 1 || number[2] == 1)&& number[0] != 0 && number[2] != 0) {
                counter += 1;
            } else if (number[j] == 0 && j != 1) {
                counter += number[j];
            }else if (number[j] == 0){
                temp = number[0] + number[2];
                break;
            }
            else {
                temp *= number[j];
            }
        }
        if (temp == 1) {
            System.out.println(counter);
        } else
            System.out.println(temp + counter);
    }
}
