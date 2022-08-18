public abstract class Spielfiguren {

    private String name;
    private double groesse;
    private int ausdauer, agilitaet, kraft, armor, xp;

    /**
     * abstrakte Basisklasse von der die Figuren erben
     * @param name
     * @param groesse
     * @param ausdauer
     * @param agilitaet
     * @param kraft
     * @param armor
     * @param xp
     */
    public Spielfiguren(String name, double groesse, int ausdauer, int agilitaet, int kraft, int armor, int xp){
        this.name = name;
        this.groesse = groesse;
        this.ausdauer = ausdauer;
        this.agilitaet = agilitaet;
        this.kraft = kraft;
        this.armor = armor;
        this.xp = xp;
    }

    // Setter
    public void setName(String name){
        this.name = name;
    }
    public void setGroesse(double groesse){
        this.groesse = groesse;
    }
    public void setAusdauer(int ausdauer){
        this.ausdauer = ausdauer;
    }
    public void setAgilitaet(int agilitaet){
        this.agilitaet = agilitaet;
    }
    public void setKraft(int kraft){
        this.kraft = kraft;
    }
    public void setArmor(int armor){
        this.armor = armor;
    }
    public void setXp(int xp){
        this.xp = xp;
    }

    // Getter
    public String getName(){
        return this.name;
    }
    public double getGroesse() {
        return groesse;
    }
    public int getAusdauer() {
        return ausdauer;
    }
    public int getAgilitaet() {
        return agilitaet;
    }
    public int getKraft() {
        return kraft;
    }
    public int getArmor() {
        return armor;
    }
    public int getXp() {
        return xp;
    }
}
