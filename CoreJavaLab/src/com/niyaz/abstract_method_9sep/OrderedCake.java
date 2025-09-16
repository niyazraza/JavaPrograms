package com.niyaz.abstract_method_9sep;

public class OrderedCake extends Cake 
{

	private String message;

	public OrderedCake() {
		super("Round", "Venila", 1);

	}

	public OrderedCake(String shape, String flavor, int qunatity)
	{
		super(shape, flavor, qunatity);
	}

	public OrderedCake(String shape, String flavor, int qunatity, String message)
	{
		super(shape, flavor, qunatity);
		this.message = message;
	}

	@Override
	public String toString() 
	{
		if(message==null) 
		{
			return super.toString();
			
		}
		else 
		{
		return "A "+getShape()+" "+getFlavor()+" of "+getQunatity()+"KG is Ready with "+message+" message @ Rs."+getPrice()*getQunatity()+"";
		}
	}

}
