package Assignment2;
public class Player {
    private String playerID;
    private String playerName;
    private Character character;

    public Player(String playerID, String playerName, Character character) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.character = character;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}