public class SeriesSum {
    public static void main(String[] args) {
        double sum = 0.0;
        double fact = 1.0;
        for (int i = 1; i <= 20; i++) {
            fact *= i;
            sum += 1.0 / fact;
        }
        System.out.println("for: " + sum);
        sum = 0.0;
        fact = 1.0;
        int i = 1;
        while (i <= 20) {
            fact *= i;
            sum += 1.0 / fact;
            i++;
        }
        System.out.println("while: " + sum);
    }
}