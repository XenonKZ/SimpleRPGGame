package Assignment2;

class Rogue extends Character {
    private int stealthLevel;
    private String daggerType;

    public Rogue(String characterID, String characterName, int level, int stealthLevel, String daggerType) {
        super(characterID, characterName, level);
        this.stealthLevel = stealthLevel;
        this.daggerType = daggerType;
    }

    public void stab(Character target) {
        int damage;

        if (getLevel() >= 1 && getLevel() <= 3) {		//damage is based off of rogue's level
            damage = 10;
        } else if (getLevel() >= 4 && getLevel() <= 5) {
            damage = 15;
        } else {		// For levels above 5
            damage = 20;
        }

        target.setHealth(target.getHealth() - damage);

        System.out.println(getCharacterName() + " performed a stabbing attack with a " + daggerType +
                ". Damage dealt: " + damage);
    }

    public void evasion() {
        // Check if the stealthLevel is less than 5
        if (stealthLevel < 5) {
            System.out.println(getCharacterName() + "'s stealth level must reach level 5 before evading attacks.");
        } else {
            System.out.println(getCharacterName() + " successfully evaded an incoming attack!");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nStealth Level: " + stealthLevel +
                "\nDagger Type: " + daggerType;
    }
}
