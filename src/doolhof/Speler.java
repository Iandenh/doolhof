/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

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
	}
	
    }
}
