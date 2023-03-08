import hands.Hand;

public class player {

    private int nickname;
    private Hand hand;
    private Hand traitPile;
    private int genePool;
    private int turnNumber;

    public player(int nickname, int turnNumber) {
        this.nickname = nickname;
        this.hand = new Hand();
        this.traitPile = new Hand();
        this.genePool=5;
        this.turnNumber = turnNumber;
    }
}
