package commandpattern;

public class CommandInvoker {
	private CommandInterface command;

    public void setCommand(CommandInterface command){
        this.command = command;
    }
    public void execute(){
        command.execute();
    }

}


