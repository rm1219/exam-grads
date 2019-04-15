package commandpattern;

public class MoveEast implements CommandInterface {

    Player player;

    public MoveEast(Player player){
        this.player = player;
    }
    public void execute(){
        player.MoveEast();
    }

    public boolean undo(){
        return false;
    }
}
