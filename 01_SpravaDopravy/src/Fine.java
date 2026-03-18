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
        return "Fine{cars license plate= " + licensePlate + reason='" + reason + "', amount=" + amount + "}";
    }
}
