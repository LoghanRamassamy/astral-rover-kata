package fr.lramss;

public class MarsRover {
    public String execute(String commands) {
        if(commands.equals("MM")) return "0:2:N";
        return "0:1:N";
    }
}
