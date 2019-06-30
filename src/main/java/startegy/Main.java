package startegy;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateTax(CountryCode.PL, 15f));
    }

    private static float calculateTax(CountryCode countryCode, float income) {
        return TaxManger.get(countryCode).calculate(income);
    }
}
