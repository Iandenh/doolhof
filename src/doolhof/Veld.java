/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

import java.awt.Color;
import java.awt.Graphics;
import java.util.EnumMap;

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
    public void tekenVierkant(Graphics g){
	g.setColor(Color.BLACK);
	g.drawRect(xPos, yPos, CELL, CELL);
	if(spelelement != null){
	    spelelement.tekenPlaatje(g);
    }
}
}
