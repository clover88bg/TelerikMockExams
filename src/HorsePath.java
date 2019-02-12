import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HorsePath {


    private static boolean possibleMoves(int row, int col, int[][] matrix) {
        return (0 <= row && row < matrix.length && 0 <= col && col < matrix[row].length && matrix[row][col] == 0);
    }

    private static int move(int row, int col, int count, int[][] matrix) {
        int[] rows1 = {-2, -2, -1, -1, +1, +1, +2, +2};
        int[] cols1 = {-1, +1, -2, +2, -2, +2, -1, +1};

        while (possibleMoves(row, col, matrix)) {
            matrix[row][col] = count;
            count += 1;

            for (int k = 0; k < rows1.length; k++) {
                int nextRow = row + rows1[k];
                int nextCol = col + cols1[k];

                if (possibleMoves(nextRow, nextCol, matrix)) {
                    row = nextRow;
                    col = nextCol;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] matrix = new int[n][n];

        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count = move(i, j, count, matrix);
            }
        }

        for (int[] row : matrix) {
            System.out.println(
                    Arrays.stream(row).mapToObj(x -> x + "").collect(Collectors.joining(" "))
            );
        }
    }
}
