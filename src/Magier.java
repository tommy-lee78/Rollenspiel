import java.util.Random;

public class Magier extends Spielfiguren{

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
    public Magier(String geschlecht, String name, double groesse, int ausdauer, int agilitaet, int kraft, int armor, int xp) {
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
                + "\nMagier!                  |"
                + "\n--------------------------"
                + "\nGechlecht:\t" + this.getGeschlecht() + "            |"
                + "\nName:\t\t" + this.getName() + "     |"
                + "\nGröße:\t\t" + this.getGroesse() + "m        |"
                + "\nAusdauer:\t" + this.getAusdauer() + "           |"
                + "\nAgilität:\t" + this.getAgilitaet() + "           |"
                + "\nKraft:\t\t" + this.getKraft() + "           |"
                + "\nArmor:\t\t" + this.getArmor() + "           |"
                + "\nXP:\t\t\t" + this.getXp()
                + "\n==========================";

        return output;
    }
    //bestimmt einen zufälligen Zauber mit zufälliger angriffsstärke zum kämpfen
    public Integer zauberSpruchAufsagen(){
        String[] zauber = {"'Vulkano'", "'Tsunami'", "'Erdbeben'", "'Tornado'", "'Komet'", "'Gravitas'", "'Inferno'"};
        Random magic = new Random();
        String zauberSpruch = String.valueOf(magic.nextInt(zauber.length));
        Random magicAttack = new Random();
        System.out.println("Ich beschwöre dich... " + zauber[Integer.parseInt(zauberSpruch)] + "!");
        return magicAttack.nextInt(10);
    }

}
