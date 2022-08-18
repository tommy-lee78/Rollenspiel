import java.util.*;

public class Dieb extends Spielfiguren{
    ArrayList<String> diebesgutkammer = new ArrayList<>();
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
    public Dieb(String geschlecht, String name, double groesse, int ausdauer, int agilitaet, int kraft, int armor, int xp) {
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
                + "\nDieb!                    |"
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
        Random dolchStaerke = new Random();
        return dolchStaerke.nextInt(10);
    }
    /*public String stehlen(){
        diebesgutkammer.add("Goldstücke");
        return diebesgutkammer.get(diebesgutkammer.size()-1);
    }*/
    //bestimmt ein zufälliges Diebesgut und verstaut es in der Diebesgutkammer für Dieb und Diebin
    public String stehlen(){
        String[] stehlbares = {"'1 Goldstück'", "'1 Schild'", "'1 Manatrank'", "'1 Heiltrank'", "'1 Excalibur'",
                            "'1 Feuerdolch'", "'1 Heiliger Bogen'", "'1 Beutel Asche'", "'Heiße Luft'", "'1 BH'"};
        Random beute = new Random();
        int diebesgut = beute.nextInt(stehlbares.length);
        diebesgutkammer.add(stehlbares[diebesgut]);
        return diebesgutkammer.get(diebesgutkammer.size()-1);
    }

}
