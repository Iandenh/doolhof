/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

import doolhof.Item.Finish;
import doolhof.Item.Muur;
import doolhof.Item.SpelItem;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.EnumMap;
import javax.imageio.ImageIO;

/**
 *
 * @author Ian
 */
public class Veld {

    private SpelItem spelelement;
    private int xPos;
    private int yPos;
    private final int CELL = 30;

    EnumMap<Richting, Veld> buren = new EnumMap<>(Richting.class);

    public Veld(int xPos, int yPos) {
        this.xPos = xPos * CELL;
        this.yPos = yPos * CELL;
    }

    public SpelItem getSpelItem() {
        return spelelement;
    }

    public void setSpelelement(SpelItem spelelement) {
        this.spelelement = spelelement;
    }

    public Veld getBuur(Richting richting) {
        return buren.get(richting);
    }

    public void setBuur(Richting richting, Veld veld) {
        buren.put(richting, veld);
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    // buitenste lijnen van de hokjes tekenen
    public void tekenVierkant(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(xPos, yPos, CELL, CELL);
        if (spelelement != null) {
            spelelement.tekenPlaatje(g);
        }

    }
    public void tekenHelperPath(Graphics g) {
        
        BufferedImage plaatje;
        try {
            URL url = ClassLoader.getSystemResource("img/path.png");
            plaatje = ImageIO.read(url);
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        g.setColor(Color.BLACK);
        g.drawRect(xPos, yPos, CELL, CELL);

            
            g.drawImage(plaatje, getxPos(), getyPos(), null);


    }

    public ArrayList<Veld> generatePath(ArrayList<Veld> path) {
        path = (ArrayList<Veld>) new ArrayList(path);
        if(path.contains(this)){
            return null;
        }
        if (this.getSpelItem() != null && this.getSpelItem() instanceof Muur) {
            return null;
        }
        if (this.getSpelItem() != null && this.getSpelItem() instanceof Finish) {
            return path;
        }
        System.out.println((xPos / 30) + " " + (yPos / 30));
        path.add(this);
        Veld buur;
        for (Richting richting : Richting.values()) {
            buur = this.getBuur(richting);
            if (!(buur.getSpelItem() == null && (buur.getSpelItem() instanceof Muur))) {
                ArrayList<Veld> tmp = buur.generatePath(path);
                if(tmp != null){
                    return tmp;
                }
            }
        }

        return null;
    }

    public ArrayList<Veld> generatePath() {
        return generatePath(new ArrayList<Veld>());
    }
}
