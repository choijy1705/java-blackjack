package blackjack.domain;

public class BettingMoney {

    private int bettingMoney;

    public BettingMoney(int bettingMoney){
        validate(bettingMoney);
        this.bettingMoney = bettingMoney;
    }

    private void validate(int bettingMoney) {
        if(bettingMoney <= 0) {
            throw new IllegalArgumentException("최소 0원보다 큰 배팅 금액을 입력해주세요. ");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BettingMoney)) return false;

        BettingMoney that = (BettingMoney) o;

        return bettingMoney == that.bettingMoney;
    }

    @Override
    public int hashCode() {
        return bettingMoney;
    }
}
