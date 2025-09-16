package com.niyaz.elc_1_august;

import java.util.Scanner;

import com.niyaz.blc_1_august.Task;

public class TaskDemo
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the title:");
		String title = sc.nextLine();
		
		System.out.println("enter the description:");
		String description=sc.nextLine();
		
		System.out.println("enter the priority:");
		String priority = sc.nextLine();
		
		Task manage = new Task(title,description,priority);
		
		System.out.println("ennter the new updation:");
	    String newDescription  = sc.nextLine();
	    manage.updateDescription(newDescription);
	    
	    System.out.print("Enter new priority to update: ");
        String newPriority = sc.nextLine();
        manage.updatePriority(newPriority);
        if (manage.markAsCompleted()) {
            System.out.println("Task is marked as completed.");
        } else {
            System.out.println("Task is not completed.");
        }
       sc.close();
		manage.getTitle();
		manage.getPriority();
		manage.isCompleted();
	}

}
