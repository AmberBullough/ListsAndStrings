package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ToolController 
{
	private List<Donut> donutList;
	//Adds in the list
	
	private PopupDisplay display;
	
	public ToolController()
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
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + " was removed from the list.");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);
		
		display.displayText("The list is still contains: " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed.");
		
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
			
	}
}
