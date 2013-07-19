package rpg;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 * @author GoddardMorse & Mcat12
 */
public class RPGFrame extends javax.swing.JFrame {
static int y = 0;
static int x = 0;
    /**
     * Creates new form RPGFrame
     */
    public RPGFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("West");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("East");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("North");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("South");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Rest");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("0,0");

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("hello, " + RPG.name + ", a " + RPG.whatclass + " with " + RPG.hp + " hp");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 255)));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        jMenu1.setText("File");

        jMenuItem1.setText("Save Game");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Load Game");
        jMenuItem2.setActionCommand("Load Game");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            y = y + 1;
            jLabel1.setText(x + "," + y);
            encounter();
        } catch (InterruptedException ex) {
            Logger.getLogger(RPGFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        RPG.updateStats();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            y = y - 1;
            jLabel1.setText(x + "," + y);
            encounter();
        } catch (InterruptedException ex) {
            Logger.getLogger(RPGFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        RPG.updateStats();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            x = x - 1;
            jLabel1.setText(x + "," + y);
            encounter();
        } catch (InterruptedException ex) {
            Logger.getLogger(RPGFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        RPG.updateStats();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        x = x + 1;
        jLabel1.setText(x + "," + y);
        try {
            encounter();
        } catch (InterruptedException ex) {
            Logger.getLogger(RPGFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        RPG.updateStats();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            encounter();
            if (jTextArea1.getText().equals("Nothing has happened")) {
                jTextArea1.setText("You rested and gained 5 HP");
                RPG.hp++;
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(RPGFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        RPG.updateStats();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SaveLoadEngine.save();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        SaveLoadEngine.load();
        RPG.updateStats();
        updateLocation();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void NewJFrame(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RPGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RPGFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
    public void encounter() throws InterruptedException {
        Random chance = new Random();
        int h = chance.nextInt(100) + 1;
        if (h < 21) {
            jTextArea1.setText("Nothing has happened");
        } else if (h < 51) {
            if (RPG.arguments.equals("-old")) {
                village v = new village();
                v.setVisible(true);
            } else if (h < 81) {
                int yy = JOptionPane.showOptionDialog(RPG.frame,
                        "You have encountered a village",
                        "Village", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        RPG.village,
                        RPG.village[2]);
                System.out.println(yy);
                if (yy == 0) {
                    RPG.frame.setTheText("You have rested and gained 10 HP");
                    RPG.hp = RPG.hp + 10;
                    if (RPG.hp > RPG.maxhp) {
                        RPG.hp = RPG.maxhp;
                    }
                    RPG.frame.setTheText(RPG.frame.getTheText() + "\nYou now have " + RPG.hp + " HP");
                } else if (yy == 1) {
                    if (RPG.exp > 99) {
                        JOptionPane.showMessageDialog(this, "You have gained a level!");
                        RPG.exp = RPG.exp - 100;
                        RPG.level++;
                        RPG.strength = RPG.strength + 10;
                        RPG.magic = RPG.magic + 5;
                        RPG.maxhp = RPG.maxhp + 15;
                        RPG.hp = RPG.maxhp;
                    } else {
                        JOptionPane.showMessageDialog(this, "You need 100 exp");
                    }
                } else if (yy == 2) {
                    if (RPG.whatclass.equalsIgnoreCase("fighter")) {
                        int oo = JOptionPane.showOptionDialog(this, "What do you wish to buy?",
                                "Shop",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, RPG.shop,
                                RPG.shop[RPG.shop.length - 1]);
                        if (RPG.gold < RPG.shopgold[oo]) {
                            JOptionPane.showMessageDialog(this, "You don't have enough money!");
                        } else {
                            String ll = "Use " + RPG.shop[oo];
                            RPG.gold = RPG.gold - RPG.shopgold[oo];
                            RPG.inventory[RPG.on] = ll;
                            RPG.inventorypower[RPG.on - 1] = RPG.shoppower[oo];
                            RPG.on++;
                        }
                    } else {
                        int oo = JOptionPane.showOptionDialog(this, "What do you wish to buy?",
                                "Shop",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, RPG.mageshop,
                                RPG.mageshop[RPG.mageshop.length - 1]);
                        if (RPG.gold < RPG.mageshopgold[oo]) {
                            JOptionPane.showMessageDialog(this, "You don't have enough money!");
                        } else {
                            String ll = "Use " + RPG.mageshop[oo];
                            RPG.gold = RPG.gold - RPG.mageshopgold[oo];
                            RPG.inventory[RPG.on] = ll;
                            RPG.inventorypower[RPG.on - 1] = RPG.mageshoppower[oo];
                            RPG.on++;
                        }
                    }
                }
            }
        } else if (h < 91) {
            fight(10, 10, "Troll");
        } else {
            fight(10, 3, "Goblin");
        }
    }

    public void setTheText(String f) {
        jTextArea1.setText(f);
    }

    public void setTheLabel(String o) {
        jTextArea2.setText(o);
    }

    public String getTheText() {
        String f = jTextArea1.getText();
        return f;
    }

    public void updateLocation() {
        jLabel1.setText(x + "," + y);
    }

    public void fight(int x, int y, String name) throws InterruptedException {
        boolean dead = false;
        int turn;
        int hp = x;
        JOptionPane.showMessageDialog(this, "A " + name + " appears!");
        if (RPG.initiative < 2) {
            turn = 0;
        } else {
            turn = 1;
        }

        while (hp > 0 && dead == false) {
            if (turn == 0) {
                JOptionPane.showMessageDialog(this, "The " + name + " attacks!");
                Random hit = new Random();
                RPG.hp = RPG.hp - hit.nextInt(y);
                JOptionPane.showMessageDialog(this, "You have " + RPG.hp + " HP.");
                if (RPG.hp < 1) {
                    dead = true;
                } else {
                    turn = 1;
                }
            } else {
                int vv = JOptionPane.showOptionDialog(RPG.frame,
                        "What do you do?",
                        "Attack", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        RPG.inventory,
                        RPG.inventory[RPG.on - 1]);
                JOptionPane.showMessageDialog(this, "You attack!");
                Random hits = new Random();
                if (RPG.whatclass.equalsIgnoreCase("Fighter")) {
                    hp = hp - hits.nextInt(RPG.strength + RPG.inventorypower[vv]);
                } else {
                    hp = hp - hits.nextInt(RPG.magic + RPG.inventorypower[vv]);
                }
                JOptionPane.showMessageDialog(this, "The " + name + " now has " + hp + " HP");
                turn = 0;
            }
        }
        if (dead == false) {
            JOptionPane.showMessageDialog(this, "You have defeated the " + name + "!");
            RPG.exp = RPG.exp + 5;
            JOptionPane.showMessageDialog(this, "You now have " + RPG.exp + " Exp and " + RPG.hp + " HP");
        } else if (dead == true) {
            JOptionPane.showMessageDialog(this, "You have died...");
            System.exit(0);
        }
    }
}
