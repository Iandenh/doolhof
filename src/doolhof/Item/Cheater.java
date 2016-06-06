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
public class Cheater extends SpelItem{
    protected int stappen = 50;
    public Cheater(Veld veld, SpelListener listener, int stappen) {
        super(veld, listener);
        super.setPlaatje(this);
    }
    public int getStappen()
    {
        return stappen;
    }
}
