public class RewardValue {
    public double cashValue;
    public double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public double cashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    public double milesToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
