/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof.Item;

import doolhof.SpelListener;
import doolhof.Veld;

/**
 *
 * @author Ian
 */
public class Bazooka extends SpelItem {
    
    public Bazooka(Veld veld, SpelListener listener) {
        super(veld, listener);
        super.setPlaatje(this);
    }
    
}
