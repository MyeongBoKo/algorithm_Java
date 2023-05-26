package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sNum = Integer.parseInt(st.nextToken());
        int qNum = Integer.parseInt(st.nextToken());
        long[] s = new long[sNum + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= sNum; i++){
            s[i] = s[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < qNum; i++){
            st = new StringTokenizer(br.readLine());
            int start =  Integer.parseInt(st.nextToken());
            int end =  Integer.parseInt(st.nextToken());
            System.out.println(s[end] - s[start-1]);
        }

    }
}
