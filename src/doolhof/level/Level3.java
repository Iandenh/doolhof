/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof.level;

/**
 *
 * @author Ian
 */
public class Level3 extends Level {
   public Level3() {
        String[][] level = {
            {"m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m"},
            {"m", "", "s", "m", "", "", "m", "", "", "", "", "", "", "", "", "m", "", "", "", "m"},
            {"m", "", "m", "m", "m", "h", "m", "m", "m", "m", "", "m", "", "m", "", "m", "", "", "", "m"},
            {"m", "b", "m", "", "m", "", "", "", "", "", "m", "m", "m", "m", "m", "m", "m", "m", "", "m"},
            {"m", "", "m", "", "m", "", "", "m", "m", "", "", "", "", "", "", "", "", "", "", "m"},
            {"m", "", "m", "", "m", "", "m", "", "m", "", "", "", "m", "", "", "", "", "", "", "m"},
            {"m", "", "m", "", "m", "", "m", "", "m", "", "m", "m", "m", "m", "m", "", "", "", "", "m"},
            {"m", "c", "", "", "m", "", "m", "", "", "", "", "", "", "", "", "m", "", "m", "", "m"},
            {"m", "", "m", "c", "m", "", "m", "m", "", "", "", "", "", "m", "", "m", "", "m", "", "m"},
            {"m", "", "m", "", "m", "", "", "m", "", "m", "", "m", "", "m", "", "m", "", "m", "", "m"},
            {"m", "", "m", "", "m", "m", "", "m", "", "m", "", "m", "", "m", "", "", "m", "", "", "m"},
            {"m", "", "m", "", "", "", "", "m", "", "", "m", "", "m", "", "", "", "", "", "", "m"},
            {"m", "m", "m", "m", "m", "", "m", "", "", "", "m", "", "m", "m", "m", "m", "", "m", "", "m"},
            {"m", "", "", "", "", "", "", "m", "", "", "", "", "", "", "", "", "", "m", "f", "m"},
            {"m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m"}
        };
        this.level = level;
    } 
}
