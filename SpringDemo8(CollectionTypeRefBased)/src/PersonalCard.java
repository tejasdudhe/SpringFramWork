public class PersonalCard 
{
  int cardid;
  String cardname;
  public PersonalCard() 
  {
	super();
  }
  public PersonalCard(int cardid, String cardname) 
  {
	super();
	this.cardid = cardid;
	this.cardname = cardname;
  }
  public int getCardid() 
  {
	return cardid;
  }
  public void setCardid(int cardid) 
  {
	this.cardid = cardid;
  }
  public String getCardname() 
  {
	return cardname;
  }
  public void setCardname(String cardname) 
  {
	this.cardname = cardname;
  }
  public void DisplayId()
  {
	 System.out.println("Card Id:"+cardid);
	 System.out.println("Card Name:"+cardname);
  }
  @Override
  public String toString() 
  {
	return "\nPersonalCard \n cardid=" + cardid + ", cardname=" + cardname;
  }
}
