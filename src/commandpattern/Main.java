package commandpattern;

import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int min = 1, max = 4;
        Random random = new Random();
        int randomNumber = 1;

        Player player = new Player();

        CommandInvoker commandInvoker = new CommandInvoker();

        for(int i=0; i<50; i++){
            randomNumber = random.ints(min,(max+1)).findFirst().getAsInt();
            switch (randomNumber) {
                case 1:
                    CommandInterface moveNorth = new MoveNorth(player);
                    commandInvoker.setCommand(moveNorth);
                    break;
                case 2:
                    CommandInterface moveEast = new MoveEast(player);
                    commandInvoker.setCommand(moveEast);
                    break;
                case 3:
                    CommandInterface moveSouth = new MoveSouth(player);
                    commandInvoker.setCommand(moveSouth);
                    break;
                case 4:
                    CommandInterface moveWest = new MoveWest(player);
                    commandInvoker.setCommand(moveWest);
                    break;
            }
            commandInvoker.execute();
            System.out.println("(" + player.getxCoord() + "," + player.getyCoord() +")");
            CommandInterface m = new MoveNorth(player);
    		
    		boolean t = m.undo();
    		if (t == false) {
    			player.xCoord = 0;
    			player.yCoord = 0;
    		}
        }
    }
}