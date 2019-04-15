package commandpattern;

public class Player {

    public int xCoord = 0;
    public int yCoord = 0;

    public Player() {}

    public Player(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public void MoveNorth(){
        this.yCoord = this.yCoord + 1;
    }

    public void MoveEast(){
        this.xCoord = this.xCoord + 1;
    }

    public void MoveSouth(){
        this.yCoord = this.yCoord - 1;
    }
}
