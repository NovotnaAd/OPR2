public class Fine {
    private String reason;
    private int amount;

    public Fine(String reason, int amount) {
        this.reason = reason;
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Fine! Reason for fine is: '" + reason + "and the amount of money you have to pay is: '" + amount;
    }
}
