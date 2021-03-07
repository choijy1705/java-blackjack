package blackjack.domain;

public class Player extends User {

    private BettingMoney bettingMoney;

    public Player(String name) {
        super(name);
    }

    public Result getResult(int dealerScore) {
        if (this.getScore() > dealerScore) {
            return Result.WIN;
        }

        if (this.getScore() < dealerScore || this.isBust()) {
            return Result.LOSE;
        }

        return Result.DRAW;
    }

    public void bettingMoney(int bettingMoney){
        this.bettingMoney = new BettingMoney(bettingMoney);
    }
}
