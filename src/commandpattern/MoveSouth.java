package commandpattern;

public class MoveSouth implements CommandInterface {

    Player player;

    public MoveSouth(Player player){
        this.player = player;
    }
    public void execute(){
        player.MoveSouth();
    }

    public boolean undo(){
        return false;
    }
}

