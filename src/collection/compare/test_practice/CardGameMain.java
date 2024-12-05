package collection.compare.test_practice;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }
        player1.result();
        player2.result();
        Player winner = getWinner(player1,player2);
        if(winner==null){
            System.out.println("무승부 입니다.");
        }
        else{
            System.out.println("["+winner.getName()+"]의 승리!");
        }

    }

    private static Player getWinner(Player player1,Player player2) {
        if(player1.getSum()>player2.getSum()){
            return player1;
        }
        else if(player1.getSum()==player2.getSum()){
            return null;
        }
        else {
            return player2;
        }
    }
}
