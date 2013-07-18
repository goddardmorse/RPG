/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rpg;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JDialog;


public class RPG {
    static String[] village = {
        "rest at the inn                 ",
        "level up at the training grounds",
        "get a new weapon at the shop    "
    };
    static String[] inventory = {
        " ", " ", " ", " ", " "
    };
    static int[] inventorypower = {
        0, 0, 0, 0, 0
    };
    static int on = 1;
    static Object[] shop = {
        "greatsword", "potion", 
    };
    static int[] shoppower = {
        5, 10
    };
    static int [] shopgold = {
        50, 100
    };
    static int level = 1;
    static int exp = 0;
    static int hp;
    static int gold;
    static String whatclass;
    static int strength;
    static int magic;
    static String name;
    static String arguments = "-nothing";
    static boolean submitted = false;
    static int initiative;
    static int maxhp;
    static chooseclass v = new chooseclass();
    public static NewJFrame frame = new NewJFrame();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            arguments = args[0];
        }
        if (arguments.equals("-rick")) {
            try {
                java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://dafk.net/what"));
            } catch (IOException ex) {
                Logger.getLogger(RPG.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(null, "please build your character.");
        v.setVisible(true);
        while (submitted == false) {
        }
        frame.setthetext("hello, " + name + ", a " + whatclass + " with " + hp + " hp");
        updatestats();
        frame.setVisible(true);
    }
    public static void updatestats() {
        frame.setthelabel (name +
                "\nlevel: " + level +
                "\nexp: " + exp +
                "\nhp: " + hp + 
                "\nstrength: " + strength + 
                "\nmagic: " + magic +
                "\ninitiative: " + initiative +
                "\ngold:" + gold);
    }

}
