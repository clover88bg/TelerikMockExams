import java.util.Scanner;

public class Speeds {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int numberOfCars = scann.nextInt();
        int[] sequenceOfSpeeds = new int[numberOfCars];
        for (int i = 0; i < numberOfCars; i++) {
            sequenceOfSpeeds[i] = scann.nextInt();
        }
        int tempSum = 0;
        int sum = 0;
        int countCars = 0;
        int tempCountcars = 0;
        for (int j = 0; j < numberOfCars -1; j++) {
            if (sequenceOfSpeeds[j] < sequenceOfSpeeds[j + 1]) {
                tempCountcars++;
                if (tempCountcars == 1) {
                    tempSum = sequenceOfSpeeds[j] + sequenceOfSpeeds[j + 1];
                    tempCountcars++;
                } else {
                    tempSum += sequenceOfSpeeds[j + 1];
                }
                sequenceOfSpeeds[j+1] = sequenceOfSpeeds[j];
            } else {
                if (countCars < tempCountcars) {
                    countCars = tempCountcars;
                    sum = tempSum;
                } else if (countCars == tempCountcars) {
                    if (sum < tempSum) {
                        sum = tempSum;
                    }
                }
                tempCountcars = 0;
                tempSum = 0;
            }
        }
        if (numberOfCars == 1 || (tempSum == 0 && sum == 0)) {
            sum = sequenceOfSpeeds[0];
        }
        else {
            if (countCars < tempCountcars) {
                sum = tempSum;
            } else if (countCars == tempCountcars) {
                if (sum < tempSum) {
                    sum = tempSum;
                }
            }
        }
        System.out.println(sum);
    }
}