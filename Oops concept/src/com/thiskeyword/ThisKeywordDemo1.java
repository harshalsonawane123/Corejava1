package com.thiskeyword;
class Account
{
	public String accType;
	public long accno;
	
	public void setdata(String accType ,long accno)
	{
		this.accType=accType;
		this.accno=accno;
	}
	public void display()
	{
		System.out.println(accType+" "+accno);
	}
}

public class ThisKeywordDemo1 {

	public static void main(String[] args) {
		Account obj=new Account();
		obj.setdata("Saving",34515754);
		obj.display();

	}

}
