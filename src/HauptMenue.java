import java.util.*;

/**
 * Benutzeroberfläche
 * Menü, Spielerauswahl, Kampf Methoden, Spiel, Test Ausgabe
 */
public class HauptMenue {
    public static Scanner sc = new Scanner(System.in);
    //erstellung der Helden und des Monsters bzw Gegners
    Bogenschuetze bs = new Bogenschuetze("M", "Hugo", 1.80, 51, 53, 35, 36, 0);
    Dieb db = new Dieb("M", "Horst", 1.76, 57, 59, 41, 44, 0);
    Diebin dbn = new Diebin("W", "Vivi", 1.71, 55, 57, 38, 41, 0);
    Krieger kg = new Krieger("M", "Ludolph", 1.89, 48, 49, 54, 56, 0);
    Kriegerin kgn = new Kriegerin("W", "Luder", 1.84, 45, 43, 49, 51, 0);
    Magier mg = new Magier("W", "Babajaga", 2.01, 34, 36, 11, 14, 0);
    Monster ms = new Monster("Fifi", 3.12, 52, 57, 100, 100, 0);

    //Hauptmenu
    public void mainMenu() {
        System.out.println("================================================");
        System.out.println("MyGame      Hauptmenü       von: Thomas Heinrich");
        System.out.println("------------------------------------------------");
        System.out.println("1) Spiel starten");
        System.out.println("2) Highscores");
        System.out.println("3) Einstellungen");
        System.out.println("4) Über MyGame");
        System.out.println("0) Spiel beenden");
        System.out.println("9) Test Ausgabe");
        System.out.println("------------------------------------------------");
        System.out.println("Bitte wählen:");

        myMenu();
    }
    //Auswahloptionen werden ausgeführt
    public void myMenu() {
        String sc_menu = sc.next();
        if (sc_menu.equals("1")) {
            System.out.println("================================================");
            System.out.println("              Spiel wird gestartet");
            System.out.println("================================================");
            spielerwahl();
        } else if (sc_menu.equals("2")) {
            System.out.println("------------------------------------------------");
            System.out.println("                  Highscores");
            System.out.println("------------------------------------------------");
        } else if (sc_menu.equals("3")) {
            System.out.println("------------------------------------------------");
            System.out.println("                 Einstellungen");
            System.out.println("------------------------------------------------");
        } else if (sc_menu.equals("4")) {
            System.out.println("------------------------------------------------");
            System.out.println("                   Über MyGame");
            System.out.println("================================================");
            System.out.println("         Entwickelt von THC-Productions");
            System.out.println("================================================");
        } else if (sc_menu.equals("0")) {
            System.out.println("Wirklich beenden? J / N");
            String sc_exit = sc.next().toUpperCase();
            if (sc_exit.equals("J")) {
                System.out.println("------------------------------------------------");
                System.out.println("        Spiel wird beendet... Tschüß!");
                System.out.println("------------------------------------------------");
                System.exit(0);
            } else if (sc_exit.equals("N")) {
                mainMenu();
            } else {
                System.out.println("Falsche Eingabe!");
                mainMenu();
            }
        } else if (sc_menu.equals("9")) {
            myTest();
        } else {
            System.out.println("------------------------------------------------");
            System.out.println("                Falsche Eingabe");
            System.out.println("------------------------------------------------");
        }
        mainMenu();

    }
    //auswahl eines Helden zum spielen
    public void spielerwahl() {

        System.out.println("Wähle eine Klasse!");
        System.out.println("------------------------------------------------");
        System.out.println("1) Bogenschütze");
        System.out.println("2) Dieb");
        System.out.println("3) Diebin");
        System.out.println("4) Krieger");
        System.out.println("5) Kriegerin");
        System.out.println("6) Magier");
        String charWahl = sc.next();

        if (charWahl.equals("1")) {
            System.out.println("==========================");
            System.out.println("Deine Auswahl!");
            //System.out.println(bs.toString());
            kampfBs();
        } else if (charWahl.equals("2")) {
            System.out.println("==========================");
            System.out.println("Deine Auswahl!");
            //System.out.println(db.toString());
            kampfDb();
        } else if (charWahl.equals("3")) {
            System.out.println("==========================");
            System.out.println("Deine Auswahl!");
            //System.out.println(dbn.toString());
            kampfDbn();
        } else if (charWahl.equals("4")) {
            System.out.println("==========================");
            System.out.println("Deine Auswahl!");
            //System.out.println(kg.toString());
            kampfKg();
        } else if (charWahl.equals("5")) {
            System.out.println("==========================");
            System.out.println("Deine Auswahl!");
            //System.out.println(kgn.toString());
            kampfKgn();
        } else if (charWahl.equals("6")) {
            System.out.println("==========================");
            System.out.println("Deine Auswahl!");
            //System.out.println(mg.toString());
            kampfMg();
        } else {
            System.out.println("------------------------------------------------");
            System.out.println("                Falsche Eingabe");
            System.out.println("------------------------------------------------");
        }
    }
    //Kampfgeschehen der verschiedenen Helden
    public void kampfBs() {
        System.out.println(bs.toString());
        System.out.println("------------------------------------------------");
        System.out.println("    'Bogenschütze " + bs.getName() + "' vs 'Monster " + ms.getName() + "'");
        System.out.println("------------------------------------------------");
        Random enemy = new Random();
        int ms = enemy.nextInt(10);
        int anzPfeile = bs.pfeileAbschiessen();

        if (ms < anzPfeile) {
            System.out.println(ms + " Monster - Pfeile " + anzPfeile + " ==> Gewonnen");
            if (ms == 0) {
                System.out.println("Monster sind geflohen!");
            }
            bs.setXp(bs.getXp() + bs.getXp() + ms * 2);
        } else if (ms > anzPfeile) {
            System.out.println(ms + " Monster - Pfeile " + anzPfeile + " ==> Verloren");
            if (anzPfeile == 0) {
                System.out.println("Ooops... Munition vergessen!");
            }
        } else {
            System.out.println(ms + " Monster - Pfeile " + anzPfeile + " ==> Double K.O.");
        }
        System.out.println(bs.toString());
    }
    public void kampfDb() {
        System.out.println(db.toString());
        System.out.println("------------------------------------------------");
        System.out.println("    'Dieb " + db.getName() + "' vs 'Monster " + ms.getName() + "'");
        System.out.println("------------------------------------------------");
        Random enemy = new Random();
        int ms = enemy.nextInt(10);
        int dolchStaerke = db.kaempfen();
        if (ms < dolchStaerke) {
            System.out.println(ms + " Monster - Dolchstärke " + dolchStaerke + " ==> Gewonnen");
            if (ms == 0) {
                System.out.println("Monster sind geflohen!");
            }
            db.stehlen();
            db.setXp(db.getXp() + db.getXp() + ms * 2);
            System.out.println("Es wurde " + db.diebesgutkammer.get(db.diebesgutkammer.size()-1) + " gestohlen");
        } else if (ms > dolchStaerke) {
            System.out.println(ms + " Monster - Dolchstärke " + dolchStaerke + " ==> Verloren");
            if (dolchStaerke == 0) {
                System.out.println("Ooops... Dolch ist stumpf!");
            }
        } else {
            System.out.println(ms + " Monster - Dolchstärke " + dolchStaerke + " ==> Double K.O.");
        }
        System.out.println(db.toString());
    }
    public void kampfDbn() {
        System.out.println(dbn.toString());
        System.out.println("------------------------------------------------");
        System.out.println("    'Diebin " + dbn.getName() + "' vs 'Monster " + ms.getName() + "'");
        System.out.println("------------------------------------------------");
        Random enemy = new Random();
        int ms = enemy.nextInt(10);
        int dolchStaerke = dbn.kaempfen();
        if (ms < dolchStaerke) {
            System.out.println(ms + " Monster - Dolchstärke " + dolchStaerke + " ==> Gewonnen");
            if (ms == 0) {
                System.out.println("Monster sind geflohen!");
            }
            db.stehlen();
            dbn.setXp(dbn.getXp() + dbn.getXp() + ms * 2);
            System.out.println("Es wurde " + db.diebesgutkammer.get(db.diebesgutkammer.size()-1) + " gestohlen");
        } else if (ms > dolchStaerke) {
            System.out.println(ms + " Monster - Dolchstärke " + dolchStaerke + " ==> Verloren");
            if (dolchStaerke == 0) {
                System.out.println("Ooops... Dolch ist stumpf!");
            }
        } else {
            System.out.println(ms + " Monster - Dolchstärke " + dolchStaerke + " ==> Double K.O.");
        }
        System.out.println(dbn.toString());
    }
    public void kampfKg() {
        System.out.println(kg.toString());
        System.out.println("------------------------------------------------");
        System.out.println("    'Krieger " + kg.getName() + "' vs 'Monster " + ms.getName() + "'");
        System.out.println("------------------------------------------------");
        Random enemy = new Random();
        int ms = enemy.nextInt(10);
        int schwertStaerke = kg.kaempfen();
        if (ms < schwertStaerke) {
            System.out.println(ms + " Monster - Schwertstärke " + schwertStaerke + " ==> Gewonnen");
            if (ms == 0) {
                System.out.println("Monster sind geflohen!");
            }
            kg.setXp(kg.getXp() + kg.getXp() + ms * 2);
        } else if (ms > schwertStaerke) {
            System.out.println(ms + " Monster - Schwertstärke " + schwertStaerke + " ==> Verloren");
            if (schwertStaerke == 0) {
                System.out.println("Ooops... Schwert ist gebrochen!");
            }
        } else {
            System.out.println(ms + " Monster - Schwertstärke " + schwertStaerke + " ==> Double K.O.");
        }
        System.out.println(kg.toString());
    }
    public void kampfKgn() {
        System.out.println(kgn.toString());
        System.out.println("------------------------------------------------");
        System.out.println("    'Kriegerin " + kgn.getName() + "' vs 'Monster " + ms.getName() + "'");
        System.out.println("------------------------------------------------");
        Random enemy = new Random();
        int ms = enemy.nextInt(10);
        int schwertStaerke = kgn.kaempfen();
        if (ms < schwertStaerke) {
            System.out.println(ms + " Monster - Schwertstärke " + schwertStaerke + " ==> Gewonnen");
            if (ms == 0) {
                System.out.println("Monster sind geflohen!");
            }
            kgn.setXp(kgn.getXp() + kgn.getXp() + ms * 2);
        } else if (ms > schwertStaerke) {
            System.out.println(ms + " Monster - Schwertstärke " + schwertStaerke + " ==> Verloren");
            if (schwertStaerke == 0) {
                System.out.println("Ooops... Schwert ist gebrochen!");
            }
        } else {
            System.out.println(ms + " Monster - Schwertstärke " + schwertStaerke + " ==> Double K.O.");
        }
        System.out.println(kgn.toString());
    }
    public void kampfMg() {
        System.out.println(mg.toString());
        System.out.println("------------------------------------------------");
        System.out.println("    'Magier " + mg.getName() + "' vs 'Monster " + ms.getName() + "'");
        System.out.println("------------------------------------------------");
        Random enemy = new Random();
        int ms = enemy.nextInt(10);
        int magicAttack = mg.zauberSpruchAufsagen();

        if (ms < magicAttack) {
            System.out.println(ms + " Monster - Magic Attack " + magicAttack + " ==> Gewonnen");
            if (ms == 0) {
                System.out.println("Monster sind geflohen!");
            }
            mg.setXp(mg.getXp() + mg.getXp() + ms * 2);
        } else if (ms > magicAttack) {
            System.out.println(ms + " Monster - Magic Attack " + magicAttack + " ==> Verloren");
            if (magicAttack == 0) {
                System.out.println("Ooops... keine Mana mehr!");
            }
        } else {
            System.out.println(ms + " Monster - Magic Attack " + magicAttack + " ==> Double K.O.");
        }
        System.out.println(mg.toString());
    }
    //Testausgabe aller Helden und ihrer Werte + Diebesgutkammer der dreisten Diebe
    public void myTest() {
        System.out.println("------------------------------------------------");
        System.out.println("           Ausgabe aller Spielfiguren!");
        System.out.println("------------------------------------------------");
        System.out.println(bs.toString());
        System.out.println(db.toString() + "\nDiebesgutkammer:\n" + db.diebesgutkammer);
        System.out.println(dbn.toString());
        System.out.println(kg.toString());
        System.out.println(kgn.toString());
        System.out.println(mg.toString());
        System.out.println(ms.toString());
    }

}


