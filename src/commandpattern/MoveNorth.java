package commandpattern;

public class MoveNorth implements CommandInterface {

    Player player;

    public MoveNorth(Player player){
        this.player = player;
    }
    public void execute(){
        player.MoveNorth();
    }

    public boolean undo(){
        return false;
    }
}
