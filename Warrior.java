package Assignment2;

class Warrior extends Character {
    private String weaponType;
    private String armorType;

    public Warrior(String characterID, String characterName, int level, String weaponType, String armorType) {
        super(characterID, characterName, level);
        this.weaponType = weaponType;
        this.armorType = armorType;
    }

    public void chargeAttack(Character target) {
        int damage = 0;

        if (weaponType.equals("Sword")) {			 // damage based on weaponType and level
            damage = (getLevel() > 5) ? 50 : (int) (50 * 0.5);
        } else if (weaponType.equals("Dagger")) {
            damage = (getLevel() > 5) ? 20 : (int) (20 * 0.5);
        } else if (weaponType.equals("Crossbow")) {
            damage = (getLevel() > 5) ? 50 : (int) (50 * 0.5);
        } else if (weaponType.equals("Staff")) {
            damage = (getLevel() > 5) ? 10 : (int) (10 * 0.5);
        } else {
            damage = 1;
        }

        target.setHealth(target.getHealth() - damage);		// Set damage to target health

        System.out.println(getCharacterName() + " performed a charge attack with a " + weaponType +
                ". Damage dealt: " + damage);
    }

    public void shieldBlock() {
        String blockMessage;

        // Implement shield block logic based on armorType
        switch (armorType) {
            case "Shield":
                blockMessage = getCharacterName() + " is raising its shield";
                break;
            case "Gauntlet":
                blockMessage = getCharacterName() + " is raising its gauntlets";
                break;
            case "Helmet":
                blockMessage = getCharacterName() + "'s head is protected";
                break;
            default:
                blockMessage = getCharacterName() + " I hope you're protected... somehow.";
        }

        // Print the shield block message
        System.out.println(blockMessage);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nWeapon Type: " + weaponType +
                "\nArmor Type: " + armorType;
    }
    @Override
    public void setPlayer(Player player) {
        super.setPlayer(player);
    }
}
