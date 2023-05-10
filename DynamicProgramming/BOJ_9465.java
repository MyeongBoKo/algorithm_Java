import java.util.Scanner;

public class BOJ_9465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스 개수
        int T = sc.nextInt();

        for (int i = 0;i < T;i++){
            int n = sc.nextInt();

            // DP값, arr 값
            int[][] DP = new int[2][n+1];
            int[][] arr = new int[2][n+1];

            for (int j = 0;j<2;j++){
                for (int k = 1;k<=n;k++){
                    arr[j][k] = sc.nextInt();
                }
            }

            DP[0][1] = arr[0][1];
            DP[1][1] = arr[1][1];

            for (int l = 2;l<=n;l++){
                DP[0][l] = Math.max(DP[1][l-1], DP[1][l-2])+arr[0][l];
                DP[1][l] = Math.max(DP[0][l-1], DP[0][l-2])+arr[1][l];
            }
            System.out.println(Math.max(DP[0][n], DP[1][n]));
        }
    }
}

