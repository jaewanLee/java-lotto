package step2.dto;

public class MoneyDTO {
    private final int amount;

    public MoneyDTO(int amount) {
        this.amount = amount;
    }

    public final int getAmount() {
        return amount;
    }
}
