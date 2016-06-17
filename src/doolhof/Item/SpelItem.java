/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof.Item;

import doolhof.Doolhof;
import doolhof.Richting;
import doolhof.SpelListener;
import doolhof.Veld;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Ian
 */
public class SpelItem {

    protected boolean blocker;
    protected Veld veld;
    private BufferedImage plaatje;
    protected SpelListener listener;
    protected Bazooka wapen;

    public void setWapen(Bazooka wapen) {
        this.wapen = wapen;
    }

    public SpelItem(Veld veld, SpelListener listener) {

        this.veld = veld;
        this.listener = listener;
    }

    protected void setHokje(Veld veld) {
        this.veld = veld;
    }

    /**
    * tekent het plaatje in het veld
    */
    public void tekenPlaatje(Graphics g) {
        g.drawImage(plaatje, veld.getxPos(), veld.getyPos(), null);
    }

    /**
    * maakt een String van de lokatie van het plaatje  
    */
    public void setPlaatje(SpelItem spelelement) {
        String element = spelelement.getClass().getSimpleName();

        leesPlaatje("img/" + element + ".png");
    }

    /**
    * haalt het plaatje op
    */ 

    private Image leesPlaatje(String plaatjeLokatie) {
        try {
            URL url = ClassLoader.getSystemResource(plaatjeLokatie);
            plaatje = ImageIO.read(url);
            return plaatje;
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

}
