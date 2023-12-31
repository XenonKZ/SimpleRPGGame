package Assignment2;

class Mage extends Character {
    private String elementalAffinity;

    public Mage(String characterID, String characterName, int level, String elementalAffinity) {
        super(characterID, characterName, level);
        this.elementalAffinity = elementalAffinity;
    }

    public void castElementalSpell(String spellType) {
        
        if (getLevel() < 5) {		// Check if the character's level is below 5
            System.out.println(getCharacterName() + " needs to reach level 5 before casting any spells.");
            return; // Exit the method if the level is below 5
        }

        switch (spellType) {		// select action based on user
            case "Teleportation":
                System.out.println("Teleporting " + getCharacterName() + " out of danger!");
                break;
            case "Illusion":
                System.out.println(getCharacterName() + " is creating illusions to confuse the enemy.");
                break;
            case "Detection":
                System.out.println(getCharacterName() + " is detecting the presence of magic nearby...");
                break;
            default:
                System.out.println(getCharacterName() + " is not familiar with that spell.");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nElemental Affinity: " + elementalAffinity;
    }
    @Override
    public void setPlayer(Player player) {
        super.setPlayer(player);
    }
}
