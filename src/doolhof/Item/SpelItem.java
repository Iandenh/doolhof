/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof.Item;

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

    public SpelItem(Veld veld, SpelListener listener) {

        this.veld = veld;
        this.listener = listener;
    }

    private void setHokje(Veld veld) {
        this.veld = veld;
    }

    // tekent het plaatje in het veld
    public void tekenPlaatje(Graphics g) {
        g.drawImage(plaatje, veld.getxPos(), veld.getyPos(), null);
    }

    // maakt een String van de lokatie van het plaatje  
    public void setPlaatje(SpelItem spelelement) {
        String element = spelelement.getClass().getSimpleName();

        leesPlaatje("img/" + element + ".png");
    }

    // haalt het plaatje op

    private Image leesPlaatje(String plaatjeLokatie) {
        try {
            URL url = ClassLoader.getSystemResource(plaatjeLokatie);
            plaatje = ImageIO.read(url);
            return plaatje;
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    //verplaatst een spelelement
    protected void beweeg(Richting richting) {
        Veld buur = veld.getBuur(richting);
        System.out.println(buur);
        if (buur.getSpelItem() instanceof Bazooka) {
            wapen = (Bazooka) buur.getSpelItem();
        }
        
        if(buur.getSpelItem() instanceof Helper){
           listener.enableHelper();
        }
        if(buur.getSpelItem() instanceof Cheater){
           Cheater cheater = (Cheater) buur.getSpelItem();
           int stappen =  cheater.getStappen();
           listener.addStap(-stappen);
        }
        if (!(buur.getSpelItem() instanceof Muur)) {
            this.veld.setSpelelement(null);
            buur.setSpelelement(this);
            this.setHokje(buur);
            listener.addStap();
        }

        listener.repaint();

    }

    public void schiet(Richting richting) {
        if (wapen != null) {

            Veld buur = veld.getBuur(richting);
            while (true) {

                if (buur.getSpelItem() != null && (buur.getSpelItem() instanceof Muur)) {
                    buur.setSpelelement(null);
                    wapen = null;
                    listener.repaint();
                    break;
                }
                buur = buur.getBuur(richting);
            }

        }
    }

}
