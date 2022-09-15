/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameControler;

import eightpuzzle.view.GameWindow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author icaro
 */
public class Randomizer {
    public static String[] puzzle = new String[9];
    private static List<String> puzzlelist = new ArrayList<String>();
    
    public static void CreateString(){
        puzzlelist.clear();
        for(int i = 0; i < 8; i++){
            puzzlelist.add("" + (i+1));
        }
        puzzlelist.add("");
        Collections.shuffle(puzzlelist);
        for(int i = 0; i < puzzle.length; i++){
            puzzle[i] = (String) puzzlelist.get(i);
        }
    }
    
    public static void CreateBoard(GameWindow window){
        window.getB1().setText(puzzle[0]);
        window.getB2().setText(puzzle[1]);
        window.getB3().setText(puzzle[2]);
        window.getB4().setText(puzzle[3]);
        window.getB5().setText(puzzle[4]);
        window.getB6().setText(puzzle[5]);
        window.getB7().setText(puzzle[6]);
        window.getB8().setText(puzzle[7]);
        window.getB9().setText(puzzle[8]);
    }
}
