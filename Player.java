import java.util.ArrayList;

public class Player {

	String name="";   //姓名
	
	private int chips;     //籌碼
	
	private int bet=0;     //玩家此局ୗ注的籌碼
	
	private ArrayList<Card> oneRoundCard;  //此牌局的卡
	
	public Player(String name, int chips) 
	{
		this.name = name ;
		this.chips = chips;
	}
	public String get_name()
	{
		return name;
	}
	public int make_bet() 
	{
		bet=1;
		return bet;
	}
	public void setOneRoundCard(ArrayList<Card> cards)
	{
		oneRoundCard=cards;
	}
	public boolean hit_me() 
	{
		boolean aa=false;
		if(getTotalValue()<=16)
		{
			aa=true;
		}
		return aa;
	}
	public int getTotalValue() 
	{	
		int Value =0; 
		int Acount =0;
		for(int i=0;i<oneRoundCard.size();i++)
		{
			if(oneRoundCard.get(i).rank==1)
				Acount += 1;
			if(oneRoundCard.get(i).rank>10)
				Value += 10;
			if(oneRoundCard.get(i).rank<=10)
				Value += oneRoundCard.get(i).rank;
		}
		for(int i = 1;i<=Acount;i++)
		{
			int tValue = Value +10;
			if(tValue < 21)
				Value = tValue;				
		}
		return Value;
	}
	public int get_current_chips() 
	{
		return chips;
	}
	public void increase_chips (int diff) 
	{
		chips+=diff;
	}
	public void say_hello()
	{
		System.out.println("Hello, I am " + name + "."); 
		System.out.println("I have " + chips + " chips.");
	}
}
