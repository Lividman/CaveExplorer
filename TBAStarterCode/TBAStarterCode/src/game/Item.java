package game;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Item 
{
	private int durabality;
	private static int[] durabalities = {50, 100, 30, 150, 250, 500};
	private String type;
	private static String[] types = {"wood", "stone", "gold", "iron", "diamond", "mythril"};
	public Item(String type, int durabality)
	{
		this.type = type;
		this.durabality = durabality ;
	}
	
	public static List<Item> generate(int num)
	{
		List<Item> myList = new ArrayList<Item>();
		int i = 0;
		while(i < num)
		{
		 int rnd = new Random().nextInt(myList.size());
		 Item thing = new Item(types[rnd], durabalities[rnd]);
		 myList.add(thing);
		 i++;
		}
		 return myList;
	}
}
