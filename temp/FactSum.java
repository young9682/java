public class FactSum {
    public static void main(String[] args) {
        long sum = 0;
        long fact = 1;
        for (int i = 1; i <= 20; i++) {
            fact *= i;
            sum += fact;
        }
        System.out.println(sum);
    }
}