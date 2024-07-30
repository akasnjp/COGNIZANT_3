public class FutureValueCalculator {
    public static double calculateFutureValue(double principal, double rate, int years) {
     
        if (years == 0) {
            return principal;
        }

        return calculateFutureValue(principal * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double principal = 1000.0; 
        double rate = 0.05;        
        int years = 10;            

        double futureValue = calculateFutureValue(principal, rate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, futureValue);
    }
}
