class Card{
 public enum Suit {Club, Diamond, Heart, Spade}
 private Suit suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
  int rank; //1~13
 public Card(Suit s,int r){
  suit=s;
  rank=r;
 } 
 //TODO: 1. Please implement the printCard method
 public void printCard(){
  //Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace
  System.out.print("("+getSuit()+","+getRank()+")");
 }
 public  Card.Suit getSuit(){
  return suit;
 }
 public int getRank(){
  return rank;
 }
}