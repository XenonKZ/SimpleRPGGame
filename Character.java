package Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String characterID;
    private String characterName;
    private int level;
    private int health;
    private List<Skill> skills;
    private Player player;

    public Character(String characterID, String characterName, int level) {
        this.characterID = characterID;
        this.characterName = characterName;
        this.level = level; 		// Default character level is 1
        this.health = 100; 		// Initial character health is 100
        this.skills = new ArrayList<>();
    }
    
    
    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
    
    public String getCharacterID() {
        return characterID;
    }

    public void setCharacterID(String characterID) {
        this.characterID = characterID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public void levelUp() {
        this.level++;
    }
    
    @Override
    public String toString() {
        return "Character ID: " + characterID +
                "\nCharacter Name: " + characterName +
                "\nLevel: " + level +
                "\nHealth: " + health +
                "\nSkills: " + skillsToString();
    }

    private String skillsToString() {
        StringBuilder result = new StringBuilder();
        for (Skill skill : skills) {
            result.append("\n- ").append(skill.getSkillName()).append(": ").append(skill.getSkillDescription());
        }
        return result.toString();
    }
}