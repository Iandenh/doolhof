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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Ian
 */
public class Speler extends SpelItem implements KeyListener {

    public Speler(Veld veld, SpelListener listener) {
        super(veld, listener);
        super.setPlaatje(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keycode = e.getKeyCode();
        System.out.println(e);
        switch (keycode) {

            case KeyEvent.VK_UP:
                beweeg(Richting.OMHOOG);
                break;
            case KeyEvent.VK_DOWN:
                beweeg(Richting.OMLAAG);
                break;
            case KeyEvent.VK_LEFT:
                beweeg(Richting.LINKS);
                break;
            case KeyEvent.VK_RIGHT:
                beweeg(Richting.RECHTS);
                break;

            case KeyEvent.VK_D:
                schiet(Richting.RECHTS);
                break;
            case KeyEvent.VK_S:
                schiet(Richting.OMLAAG);
                break;
            case KeyEvent.VK_A:
                schiet(Richting.LINKS);
                break;
            case KeyEvent.VK_W:
                schiet(Richting.OMHOOG);
                break;
        }

    }
    
     public void beweeg(Richting richting) {
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
        
        if ((buur.getSpelItem() instanceof Finish)) {
            Doolhof.nextLevel();
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
