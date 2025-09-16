package com.niyaz.blc_1_august;

public class Task 
{
     private String title;
     private String description;
     private String priority;
    
    
	public Task(String title, String description, String priority) 
	{
		if(title==null||title.trim()==""||title.isEmpty());
		{
			System.err.println("indicating invalid title");
		}
		
		this.title = title;
		this.description = description;
		this.priority = priority;
	}
    public void updateDescription(String newDescription) 
    {
    	  this.description=newDescription;
    }
    public void updatePriority( String newPriority) 
    {
    	  this.priority=newPriority;
    	 
    }
    public Boolean markAsCompleted() 
    {
    	  if(title.equalsIgnoreCase("Complete Project"))
    			  {
    		        return true;
    			  
    			  }
    	  else 
    	  
    		  return false;
    			  
    }
    public String getTitle() 
    {
    	 System.out.println("title:"+title);
    	  return title;
    }
    public String getPriority() 
    {
    	System.out.println("description:"+description);
    	  return description;
    }
    public String isCompleted() 
    {
    	System.out.println("priority:"+priority);
    	return priority;
    }
}
