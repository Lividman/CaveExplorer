package board;

import rooms.Room;

public class Board {


    private Room[][] caveMap;



    public Board(Room[][] caveMap)
    {
        this.caveMap = caveMap;
    }

    public void printMap()
    {


        for(Room[] row : caveMap)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
    public Room[][] getCaveMap() {
        return caveMap;
    }

    public void setCaveMap(Room[][] schoolMap) {
        this.caveMap = schoolMap;
    }
}
//wee