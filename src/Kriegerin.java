import java.util.Random;

public class Kriegerin extends Spielfiguren{

    private String geschlecht;

    /**
     * Modellklasse der Spielfiguren + Methoden für Fähigkeiten
     * @param geschlecht
     * @param name
     * @param groesse
     * @param ausdauer
     * @param agilitaet
     * @param kraft
     * @param armor
     * @param xp
     */
    public Kriegerin(String geschlecht, String name, double groesse, int ausdauer, int agilitaet, int kraft, int armor, int xp) {
        super(name, groesse, ausdauer, agilitaet, kraft, armor, xp);
        this.geschlecht = geschlecht;
    }

    // Setter
    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    // Getter
    public String getGeschlecht() {
        return geschlecht;
    }

    @Override
    public String toString(){
        String output = "=========================="
                + "\nKriegerin!               |"
                + "\n--------------------------"
                + "\nGechlecht:\t" + this.getGeschlecht() + "            |"
                + "\nName:\t\t" + this.getName() + "        |"
                + "\nGröße:\t\t" + this.getGroesse() + "m        |"
                + "\nAusdauer:\t" + this.getAusdauer() + "           |"
                + "\nAgilität:\t" + this.getAgilitaet() + "           |"
                + "\nKraft:\t\t" + this.getKraft() + "           |"
                + "\nArmor:\t\t" + this.getArmor() + "           |"
                + "\nXP:\t\t\t" + this.getXp()
                + "\n==========================";

        return output;
    }
    //bestimmt eine zufällige Kampfstärke für den Kampf
    public Integer kaempfen(){
        Random schwertStaerke = new Random();
        return schwertStaerke.nextInt(10);
    }

}
