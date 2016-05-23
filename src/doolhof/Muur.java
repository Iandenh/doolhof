/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

/**
 *
 * @author Ian
 */
public class Muur extends SpelItem {
    public Muur(Veld veld, SpelListener listener) {
	super(veld, listener);
	super.setPlaatje(this);
    }
}
