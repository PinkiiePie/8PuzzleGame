/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eightpuzzle;

import eightpuzzle.view.GameWindow;
import eightpuzzle.view.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author icaro
 */
public class EightPuzzle {
    
    static Principal principal;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        principal = new Principal();
        principal.validate();
        principal.pack();
        principal.setVisible(true);
    }
    
    public static void Test(GameWindow currentgame){
        if(currentgame.getB1().getText().equals("1") &&
                currentgame.getB2().getText().equals("2") &&
                currentgame.getB3().getText().equals("3") &&
                currentgame.getB4().getText().equals("4")&&
                currentgame.getB5().getText().equals("5") &&
                currentgame.getB6().getText().equals("6")&&
                currentgame.getB7().getText().equals("7") &&
                currentgame.getB8().getText().equals("8")){
            JOptionPane.showMessageDialog(null, "PARABÉNS VOCÊ RESOLVEU O PROBLEMA!!");
            principal.NewGame();
        }
    }
}
