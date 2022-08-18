import java.util.Random;

public class Monster extends Spielfiguren{
    /**
     * Modellklasse der Spielfiguren
     * @param name
     * @param groesse
     * @param ausdauer
     * @param agilitaet
     * @param kraft
     * @param armor
     * @param xp
     */
    public Monster(String name, double groesse, int ausdauer, int agilitaet, int kraft, int armor, int xp){
        super(name, groesse, ausdauer, agilitaet, kraft, armor, xp);
    }

    @Override
    public String toString(){
        String output = "=========================="
                + "\nMonster!                 |"
                + "\n--------------------------"
                + "\nName:\t\t" + this.getName() + "         |"
                + "\nGröße:\t\t" + this.getGroesse() + "m        |"
                + "\nAusdauer:\t" + this.getAusdauer() + "           |"
                + "\nAgilität:\t" + this.getAgilitaet() + "           |"
                + "\nKraft:\t\t" + this.getKraft() + "          |"
                + "\nArmor:\t\t" + this.getArmor() + "          |"
                + "\n==========================";

        return output;
    }

}
