package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ListController 
{
	private List<Donut> donutList;
	//Adds in the list
	
	private PopupDisplay display;
	
	public ListController()
	{
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	//Added in the array list.
	
	public void start ()
	{
		Donut temp = new Donut();
		donutList.add(temp);
		// Putting in the first lie of these two removed the error in the second line 
		fillTheList();
		//showTheList();
		//Took out show the list
		changeTheList();
		practiceWithList();
	}
	
	private void showTheList()
	{
		String favorite = "Apple Fritter";
		for(int index = 0; index < donutList.size(); index += 1)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			
			Donut currentDonut= donutList.get(index);
			String flavor = currentDonut.getFlavor();
			
			if(currentFlavor.equals(favorite))
			{
				for(int woop = 0; woop <5; woop += 1)
				{
					display.displayText("The Best Flavor EVER!");
				}
			}
			
			for(int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex,  currentLetterIndex + 1));
			}
			
			display.displayText(donutList.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("Jelly filled");
		Donut choclate = new Donut("Chocolate");
		Donut grasshopper = new Donut("Grasshopper");
		Donut choclateChip = new Donut("Chocolate Chip");
		Donut strawberry = new Donut("Strawberry");
	
		donutList.add(jellyFilled);
		donutList.add(choclate);
		donutList.add(grasshopper);
		donutList.add(choclateChip);
		donutList.add(strawberry);
		
		//Donut circle = new Donut ("Circle");
		//Donut isGlazed = new Donut (true);
		//Donut holeCount = new Donut (0);
	}
	
	private void changeTheList()
	{
		display.displayText("The flavors in the list are: " + donutList);
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + " was removed from the list.");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);
		
		
		display.displayText("The list is still contains: " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed.");
		
	}
	
	private void backwasLoopDemo()
	{
		for (int index = donutList.size() - 1; index >= 0; index -= 1)
		{
			display.displayText(donutList.get(index).getFlavor());
		}
	}
	
	private void practiceWithList()
	{
		String fallFlavor = "Pumpkin";
		for(int index = 0; index < donutList.size(); index += 1)
		{
			String flavor = donutList.get(index).getFlavor();
			Donut happyFlavor = donutList.get(index);
			String goodFlavor = happyFlavor.getFlavor();
			display.displayText("The flavors in the list are: " + happyFlavor.getFlavor());
			
			
			if(happyFlavor.equals(fallFlavor));
			{
				for (int woop = 0; woop < 3; woop +=1)
				{
					display.displayText("I love " + fallFlavor + " donuts with cream cheese frosting!");
				}
				display.displayText(donutList.get(index).toString());
			}
		}	
		donutList.add(new Donut("pumpkin"));
		display.displayText("New donut in list is: " + fallFlavor);
		Donut removed = donutList.remove(3);
		donutList.add(removed);
		display.displayText("The list is still contains: " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed.");
		display.displayText("The flavors in the list are: " + donutList);
		Donut apple = new Donut("Apple Fritter");
		display.displayText("OH! What is this? " + "This is not a normal donut! " + apple);
		donutList.add(1, apple);
		display.displayText("The flavors in the list are: " + donutList);
		display.displayText("Oh dear. A badger ate all the donuts.");
		donutList.clear();
		display.displayText("The flavors in the list are: " + donutList);
		display.displayText("Goodbye!");
	}
	
	public ArrayList<Donut> getDonutList()
	{
		return(ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
	
	public int maxLength(ArrayList<String> donutList)
	{
		int max = 0;
		
		for (int index = 0 ; index < donutList.size(); index +=1)
		{
			if (max < donutList.get(index).length())
			{
				max = donutList.get(index).length();
			}
			
		}
	return max;
	}
	public String getLongestString(ArrayList<String> donutList)
	{
		String longest = "";
		int max = 0;
		
		for (int index = 0; index < donutList.size(); index += 1)
		{
			if (donutList.get(index).length() > max)
			{
				max = donutList.get(index).length();
				longest = donutList.get(index);
			}
		}
		return longest;
			}
		
	}

