package fr.lramss;

public class MarsRover {

    public String execute(String commands) {
        int nbMoves = commands.length();
        return move(nbMoves) + ":N";
    }

    private String move(int nbMoves) {
        return "0:" + nbMoves;
    }
}
