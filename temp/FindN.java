public class FindN {
    public static void main(String[] args) {
        long sum = 1;
        long fact = 1;
        int n = 1;
        while (true) {
            n++;
            fact *= n;
            if (sum + fact > 9999) {
                break;
            }
            sum += fact;
        }
        System.out.println(n - 1);
    }
}