public class Zork {

}

public class MazeGame {
    Maze CreateMaze();
    final Maze* createMaze() { return new Maze; }
    final Room* MakeRoom(int n) { return new Room(n); }
    final Wall* MakeWall()
}
public class MazeBuilder {
    void BuildMaze() { }
    void BuildRoom(int room) { }
    void BuildDoor(int roomFrom, int roomTo) { }
    Maze* GetMaze() {return 0;}

    protected MazeBuilder();
}

public class CreateMaze extends MazeGame {

}

public class StandardMazeBuilder extends MazeBuilder {
    StandardMazeBuilder();

    void BuildMaze();
    void BuildRoom(int);
    void BuildDoor(int, int);

    Maze* GetMaze();
}

public class Item {

}

public class Weapons extends Item {

}

public class Medicine extends Item {

}

public class DungeonKey extends Item {

}

public class Directions {

}

public class Character {

}

public class Player extends Character {

}

public class Troll extends Character {
    
}