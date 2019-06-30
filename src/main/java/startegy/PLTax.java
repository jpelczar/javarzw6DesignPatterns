package startegy;

public class PLTax implements TaxStrategy{

    @Override
    public Float calculate(Float income) {
        if (income < 84000) {
            return income * 0.18f;
        } else {
            float tax32 = (income - 84000) * 0.32f;
            return tax32 + (84000f * 0.18f);
        }
    }
}
