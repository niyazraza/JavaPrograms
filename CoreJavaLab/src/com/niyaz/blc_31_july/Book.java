package com.niyaz.blc_31_july;

public class Book 
{
    private String title;
    private String auther;
    private double price;
    public Book(String tit, String aut,double pri) 
    {
    	this.title = tit;
    	this.auther = aut;
    	this.price = pri;
    	applyDiscount();
    }
	public void applyDiscount() 
	{
		if(price < 0 ) 
		{
			System.out.println("Book Price cannot be negative.");
			//System.exit(0);
		}
	}
    
    
    
	public String toString() {
		return "Book [title=" + title + ", auther=" + auther + ", price=" + price + "]";
	} 
    
}
