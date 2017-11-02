/**
 * 
 */
package game;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * @author BT_1N3_24
 *
 */
public class Mineral 
{
	private String material;
	private static String[] materialtype = {"Copper", "Iron", "Acanthite", "Bornite", "Galena", "Molybdenite", "Pentlandite", "Scheelite" };
	private static int[] strengthlist = {10, 25, 30, 50, 100, 250, 300, 499};
	private static int strength;
	public Mineral(String material, int strength) 
	{
		this.strength = strength;
		this.material = material;
	}
	public static List<Mineral> generatemineral(int num)
	{
		List<Mineral> myList = new ArrayList<Mineral>();
		int i = 0;
		while(i < num)
		{
		 int rnd = new Random().nextInt(7);
		 Mineral mineral = new Mineral(materialtype[rnd], strengthlist[rnd]);
		 myList.add(mineral);
		 i++;
		}
		return myList;
	}
	public void printnombre()
	{
		System.out.println(this.material);
	}
}
//wee