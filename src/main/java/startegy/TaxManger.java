package startegy;

public class TaxManger {

    public static TaxStrategy get(CountryCode countryCode) {
        switch (countryCode) {
            case PL:
                return new PLTax();
            case USA:
                return new USATax();
        }

        return null;
    }
}
