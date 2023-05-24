package array;

import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String strNum = sc.next();

        char[] arr = strNum.toCharArray();
        int sum = 0;

        for (int i = 0;i < arr.length;i++){
            sum += arr[i] - 48;
        }
        System.out.print(sum);
    }
}
