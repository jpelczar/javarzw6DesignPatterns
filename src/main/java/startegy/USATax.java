package startegy;

public class USATax implements TaxStrategy {
    @Override
    public Float calculate(Float income) {
        return income * 0.2f;
    }
}
