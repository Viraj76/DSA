import java.util.Scanner;

public class ChampagneTower {
    public static String champagneTower(int K, int I, int J) {
        double[][] glasses = new double[I][I];

        glasses[0][0] = K;

        for (int i = 0; i < I - 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (glasses[i][j] > 1.0) {
                    double overflow = (glasses[i][j] - 1.0) / 2.0;
                    glasses[i + 1][j] += overflow;
                    glasses[i + 1][j + 1] += overflow;
                }
            }
        }

        return String.format("%.6f", glasses[I - 1][J - 1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int I = scanner.nextInt();
        int J = scanner.nextInt();

        String result = champagneTower(K, I, J);
        System.out.println(result);
    }
}
