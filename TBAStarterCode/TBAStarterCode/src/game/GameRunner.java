package game;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//import items.Item;
import rooms.*;
//import people.Person;

import java.util.Scanner;
public class GameRunner 

{
	

    public static void main (String[] args)
    {
    	//List<Item> items = Item.generatechest(6);
    	//for(Item i: items )
    	//{
    	//	i.printname();
    	//}
    	
    	List<Mineral> mlist = Mineral.generatemineral(6);
    	for(Mineral i: mlist)
    	{
    		i.printnombre();
    	}
    	
    }
}
        //Room[][] map = new Room[5][5];
       // for (int j = 0; j<map.length; j++)
        //{
        //weee	Room[] row = map[j];
         //   for (int i = 0; i<row.length;i++)
    //        {
  //              boolean[] doors = {true,true,true,true};
  //              Person[] people = {};
    //            Item[] items = {};

                //row[i] = new Hallway(doors, people, items, i, j);
      //      }

        //System.out.print(map);
        //}
    //}
//}

        /*School tech = new School(map);
/*Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Unknown Source)
	at java.util.Arrays.copyOf(Unknown Source)
	at java.util.ArrayList.grow(Unknown Source)
	at java.util.ArrayList.ensureExplicitCapacity(Unknown Source)
	at java.util.ArrayList.ensureCapacityInternal(Unknown Source)
	at java.util.ArrayList.add(Unknown Source)
	at game.Mineral.generatemineral(Mineral.java:31)
	at game.GameRunner.main(GameRunner.java:24)

        boolean gameOn = true;
        Person player1 = Utilities.createPerson();
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Welcome to the Halls of Tech, " + player1.getFirstName());
            map[0][0].addOccupant(player1);

            tech.printMap();
            player1.printRoom();
            String move = player1.chooseMove();
            Utilities.movePlayer(tech, player1,move);
            //gameOn = false;
            







        }
		in.close();
    }

}
*/


