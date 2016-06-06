/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof.Item;

import doolhof.Richting;
import doolhof.SpelListener;
import doolhof.Veld;
import java.util.ArrayList;

/**
 *
 * @author Ian
 */
public class Helper extends SpelItem {
    private ArrayList<Veld> path;
     public Helper(Veld veld, SpelListener listener) {
	super(veld, listener);
	super.setPlaatje(this);
    }

    public ArrayList<Veld> getPath() {
        return path;
    }

    public void setPath(ArrayList<Veld> path) {
        this.path = path;
    }

    
    
}
