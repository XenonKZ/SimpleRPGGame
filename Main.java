package Assignment2;

public class Main {
    public static void main(String[] args) {
        // i. Create two Player instances.
        Player player1 = new Player("P001", "XenonKZ", null);
        Player player2 = new Player("P002", "Destroyer", null);

        // ii. Create instances of the Character class for named Gideon, Elara, and Darian.
        Warrior gideon = new Warrior("GS001", "Gideon Stoneheart", 5, "Sword", "Chainmail");

        Mage elara = new Mage("EF001", "Elara Frostweaver", 1, "Ice");

        Rogue darian = new Rogue("DW001", "Darian Whisperwind", 10, 15, "Shuriken");

        // iii. Create instances of the Skill class for the skills.
        Skill whirlwindSlash = new Skill("Whirlwind Slash", "Powerful spinning attack");
        Skill dualWielding = new Skill("Dual Wielding", "Expertise in using two weapons");
        Skill frostNova = new Skill("Frost Nova", "Freezing area-of-effect spell");
        Skill lockpicking = new Skill("Lockpicking", "Skillful in unlocking doors and chests");

        // iv. Assign the skills to characters.
        gideon.addSkill(whirlwindSlash);
        gideon.addSkill(dualWielding);
        elara.addSkill(frostNova);
        darian.addSkill(lockpicking);

        // v. Assign Characters to Players.
        player1.setCharacter(gideon);
        player2.setCharacter(elara);

        // vi. Assign Players to the corresponding Characters.
        gideon.setPlayer(player1);
        elara.setPlayer(player2);

        // vii. Execute specific actions for each character.
        // a. Gideon performs a charge attack on Darian.
        gideon.chargeAttack(darian);

        // b. Elara casts the "Teleportation" spell.
        elara.castElementalSpell("Teleportation");

        // c. Darian stabs Gideon.
        darian.stab(gideon);

        // d. Gideon performs a shield block.
        gideon.shieldBlock();

        // e. Darian attempts to evade.
        darian.evasion();

        // viii. Print Character information.
        printCharacterInformation(gideon);
        printCharacterInformation(elara);
        printCharacterInformation(darian);
    }

    // Helper method to display character information
    private static void printCharacterInformation(Character character) {
        System.out.println("\nCharacter Information:\n" + character.getCharacterName()+ "\n"+character);
    }
}