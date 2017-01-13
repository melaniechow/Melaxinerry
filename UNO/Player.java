import java.util.*;
public class Player{
    protected String name;
    protected int score;
    //protected int pin; //4-digit
    protected ArrayList <Card> currentCards;
    
    public Player(String name){
	this.name = name;
	score = 0;
	//pin = 0000;
	currentCards = new ArrayList<Card>();
    }//end constructor
    
    public void playCard(int index, ArrayList<Card> playedArea) {
	playedArea.add(currentCards.remove(index)); 
    }
    //takes card from end of the array 
    public void draw(Deck deck) {
	currentCards.add(deck.get(deck.size() - 1));
	deck.remove(deck.size() - 1);
    }

    public int setScore(int score) {
	int oldScore = this.score;
	this.score = score;
	return oldScore;
    }
    
    void sortCards(int whichSort) {
    }

    void sortCardsColor() {
    }

    void sortCardsNum() {
    }

    void sortCardsWild() {
    }
    
    public void callUNO(){
    }
    
}//end class
