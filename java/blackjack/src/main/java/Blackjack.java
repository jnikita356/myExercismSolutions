public class Blackjack {

    public int parseCard(String card) {
        int result;
        switch (card){
            case "ace":
                result=11;
                break;
            case "two":
                result=2;
                break;
            case "three":
                result=3;
                break;
            case "four":
                result=4;
                break;
            case "five":
                result=5;
                break;
            case "six":
                result=6;
                break;
            case "seven":
                result=7;
                break;
            case "eight":
                result=8;
                break;
            case "nine":
                result=9;
                break;
            case "ten":
                result=10;
                break;
            case "jack":
                result=10;
                break;
            case "queen":
                result=10;
                break;
            case "king":
                result=10;
                break;
            default:
                result=0;
        }
        return result;
    }

    public boolean isBlackjack(String card1, String card2) {
        int c1=this.parseCard(card1);
        int c2=this.parseCard(card2);
        if(c1+c2==21)
            return true;
        return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(!isBlackjack){
            return "P";
        }
        else{
            if(dealerScore<10){
                return "W";
            }
            return "S";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if(handScore>=17){
            return "S";
        }
        else if(handScore<=11){
            return "H";
        }
        else if(dealerScore>=7){
            return "H";
        }
        else{
            return "S";
        }
        }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
