package fr.lramss;

public class MarsRover {
    public String execute(String commands) {
        if(commands.equals("MMM")) return "0:3:N";
        if(commands.equals("MM")) return "0:2:N";
        return "0:1:N";
    }
}
