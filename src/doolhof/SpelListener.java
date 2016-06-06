/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhof;

/**
 *
 * @author Sven
 */
public interface SpelListener {
    
 public void repaint();
 
 public Spelstatus getSpelstatus();
 
 public void setSpelstatus(Spelstatus spelstatus); 
 
 public void enableHelper();
 
 public void addStap();
 
  public void addStap(int stappen);
}
