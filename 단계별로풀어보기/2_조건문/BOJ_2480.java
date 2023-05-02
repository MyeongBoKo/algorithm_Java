import java.util.Scanner;

public class BOJ_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // 모든 변수가 다른 경우
        if (a != b && b != c && c != a){
            int result1 = a > b ? a : b;
            int result2 = result1 > c ? result1 : c;
            System.out.println(result2*100);
        }

        // 모든 변수가 같은 경우
        else if (a == b && a ==c){
            System.out.println(10000+a*1000);
        }

        // a가 b or a가 c랑만 같은 경우
        else if (a == b || a == c){
            System.out.println(1000+a*100);
        }

        // b가 c랑 같은 경우
        else{
            System.out.println(1000+b*100);
        }
    }
}
