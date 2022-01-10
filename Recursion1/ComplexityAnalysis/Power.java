package Recursion1.ComplexityAnalysis;

public class Power {
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        if (x == 1) return 1;
        double answer = powerHelp(x, Math.abs(n));
        return (n < 0) ?  1/answer : answer;
    }
    
    private double powerHelp(double x, int n) {
        if (n == 0) return 1.0;
        if (n == 1) return x;
        double halfPow = powerHelp(x, (n/2));
        if (n % 2 == 0) {
            return halfPow * halfPow;
        } else {
            return x * halfPow * halfPow;
        }
        
    }

}
