package ex26;

public class PaymentCalculator {

    public double calculateMonthsUntilPaidOff(double i, double b, double p){
        double n, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i);
        n = (Math.log(p) - Math.log(p - (i / 1200.0 * b))) / Math.log((i / 1200.0) + 1.0);

        //apr / bal / monthly payment
        System.out.format("It will take you %.0f Months to pay off this card.", n);
        return n;
    }



}
