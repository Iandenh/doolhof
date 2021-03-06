/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

import doolhof.Item.Bazooka;
import doolhof.Item.Cheater;
import doolhof.Item.Finish;
import doolhof.Item.Helper;
import doolhof.Item.Speler;
import doolhof.Item.Muur;
import doolhof.Item.SpelItem;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ian
 */
public class Basisspel extends javax.swing.JPanel implements SpelListener {

    private final static int HOOGTE = 15;
    private final static int BREEDTE = 20;
    private List<Veld> speelVeld = new ArrayList<>();
    private ArrayList<Veld> helperPath = new ArrayList<>();
    private Spelstatus spelstatus;
    private boolean helper = false;

    public ArrayList<Veld> getHelperPath() {
        return helperPath;
    }
    private int stappen = 0;

    /**
     * Creates new form Basisspel
     */
    public Basisspel() {
        initComponents();
    }

     /**
     * Reset het spel
     */
    public void reset() {
        removeKeyListener(getSpeler());
        speelVeld.clear();
        stappen = 0;
    }

    /**
     * bouwt het spel op
     */
    public void BouwSpelveld(String[][] layout) {

        for (int i = 0; i < HOOGTE; i++) {
            for (int j = 0; j < BREEDTE; j++) {
                Veld veld = new Veld(j, i);
                System.out.println("i=" + i + " j=" + j);
                if ("m".equals(layout[i][j])) {
                    Muur muur = new Muur(veld, this);
                    veld.setSpelelement(muur);
                }
                if ("s".equals(layout[i][j])) {
                    Speler speler = new Speler(veld, this);
                    veld.setSpelelement(speler);
                }

                if ("b".equals(layout[i][j])) {
                    Bazooka wapen = new Bazooka(veld, this);
                    veld.setSpelelement(wapen);
                }
                if ("f".equals(layout[i][j])) {
                    Finish finish = new Finish(veld, this);
                    veld.setSpelelement(finish);
                }

                if ("h".equals(layout[i][j])) {
                    Helper helper = new Helper(veld, this);
                    veld.setSpelelement(helper);
                }
                
                if ("c".equals(layout[i][j])) {
                    int random = (int) ((double)Math.random()*40);
                    Cheater cheater = new Cheater(veld, this, random);
                    veld.setSpelelement(cheater);
                }

                speelVeld.add(veld);

            }

        }

        for (int i = 0; i < speelVeld.size(); i++) {
            Veld veld = speelVeld.get(i);
            int boven = i - 20;
            int onder = i + 20;
            int rechts = i + 1;
            int links = i - 1;

            if (indexExists(speelVeld, boven)) {
                veld.setBuur(Richting.OMHOOG, speelVeld.get(boven));
            }
            if (indexExists(speelVeld, onder)) {
                veld.setBuur(Richting.OMLAAG, speelVeld.get(onder));
            }

            if (indexExists(speelVeld, rechts)) {
                veld.setBuur(Richting.RECHTS, speelVeld.get(rechts));
            }

            if (indexExists(speelVeld, links)) {
                veld.setBuur(Richting.LINKS, speelVeld.get(links));
            }
        }
        addKeyListener(getSpeler());
        setSpelstatus(Spelstatus.GESTART);
        ArrayList<Veld> path;
        helperPath = getHelper().generatePath();
        repaint();
    }

    public boolean indexExists(final List list, final int index) {
        return index >= 0 && index < list.size();
    }

    public Veld getVeld(int x, int y) {
        for (Veld veld : speelVeld) {
            if (veld.getxPos() == x) {
                if (veld.getyPos() == y) {
                    return veld;
                }
            }
        }
        return null;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Veld veld : speelVeld) {
            veld.tekenVierkant(g);
        }
        if (helper) {
            for (Veld veld : helperPath) {
                veld.tekenHelperPath(g);
            }
            helper = false;
        }
        g.drawString("Aantal stappen: " + stappen, 0, 470);
    }

    @Override
    public void setSpelstatus(Spelstatus spelstatus) {
        this.spelstatus = spelstatus;
    }

    @Override
    public Spelstatus getSpelstatus() {
        return spelstatus;
    }

    private Speler getSpeler() {
        for (Veld veld : speelVeld) {
            if (veld.getSpelItem() instanceof Speler) {
                return (Speler) veld.getSpelItem();
            }
        }
        return null;
    }
    
    public Veld getSpelerVeld() {
        for (Veld veld : speelVeld) {
            if (veld.getSpelItem() instanceof Speler) {
                return  veld;
            }
        }
        return null;
    }
    private Veld getHelper() {
        for (Veld veld : speelVeld) {
            if (veld.getSpelItem() instanceof Helper) {
                return veld;
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void enableHelper() {
        helper = true;
    }

    @Override
    public void addStap() {
        stappen++;
    }
    
    @Override
    public void addStap(int stappen) {
        this.stappen = this.stappen+stappen;
        if(this.stappen < 0)
        {
            this.stappen = 0;
        }
    }
}
