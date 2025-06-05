package Lamda;


interface TaxCalculator{
    double Calculator (double amount);
}
public class TaxStrategy {
    public static void main(String[] args) {

        TaxCalculator indiaTax = amount -> amount * 0.18;
        TaxCalculator usTax = amount ->  amount * 0.10;

        System.out.println("india Tax : "+ indiaTax.Calculator(10000));
        System.out.println("Us tax :"+ usTax.Calculator(10000));
    }
}
