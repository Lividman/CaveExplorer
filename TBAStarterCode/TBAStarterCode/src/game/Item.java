package game;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Item 
{
	private int durabality;
	private static int[] durabalities = {50, 100, 30, 150, 250, 500};
	private String mattype;
	private int damage;
	private String type;
	private static int[] damages = {1, 2, 3, 4, 5, 6};
	private static String[] mattypes = {"wood", "stone", "gold", "iron", "diamond", "mythril"};
	private static String[] types = {"sword", "pickaxe"};
	private String name;
	public Item(String mattype, int durabality, String type, int damage)
	{
		this.mattype = mattype;
		this.durabality = durabality;
		this.type = type;
		this.damage = damage;
		this.name = this.mattype + " " + this.type;
	}
	
	public static List<Item> generatechest(int num)
	{
		List<Item> myList = new ArrayList<Item>();
		int i = 0;
		while(i < num)
		{
		 int rnd2 = new Random().nextInt(2);
		 int rnd = new Random().nextInt(num);
		 Item thing = new Item(mattypes[rnd], durabalities[rnd], types[rnd2], damages[rnd]);
		 if(thing.type == "pickaxe")
		 {
			 thing.damage = 0;
			 thing.name = thing.mattype + " " + thing.type;
		 }
		 thing.name = thing.mattype + " " + thing.type;
		 myList.add(thing);
		 i++;
		}
		 return myList;
	}
	public void printname()
	{
		System.out.println(this.name);
	}
	}
