package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;

public class ToolController 
{
	private List<Donut> donutList;
	//Adds in the list
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
	}
	//Added in the array list.
	public void start ()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		// Putting in the first lie of these two removed the error in the second line 
	}
}
