import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入两个非零正整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a, y = b;
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        int gcd = x;
        long lcm = (long) a * b / gcd;
        System.out.println("最大公约数：" + gcd);
        System.out.println("最小公倍数：" + lcm);
    }
}