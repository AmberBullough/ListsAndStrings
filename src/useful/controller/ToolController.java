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
		showTheList();
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
}
