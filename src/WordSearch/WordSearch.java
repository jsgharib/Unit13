package WordSearch;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.*;
import java.io.*;

public class WordSearch {

    private String[][] wordSearch;
    String wordProg = "";

    public WordSearch(int size, String str) {
         wordSearch = new String[size][size];
         int index = 0;
         for(int i = 0; i < size; i++){
             for(int j = 0; j < size; j++){
                 wordSearch[i][j] = "" + str.charAt(index);
                 index++;
             }
         }
    }

    public boolean isFound(String word) {
         if(wordProg.equals(word)){
             return true;
         }
        return false;
    }

    public boolean checkRight(String w, int r, int c) {
         
         return false;
     }

    public boolean checkLeft(String w, int r, int c) {
        return false;
    }

    public boolean checkUp(String w, int r, int c) {
        return false;
    }

    public boolean checkDown(String w, int r, int c) {
        return false;
    }

    public boolean checkDiagUpRight(String w, int r, int c) {
        return false;
    }

    public boolean checkDiagUpLeft(String w, int r, int c) {
        return false;
    }

    public boolean checkDiagDownLeft(String w, int r, int c) {
        return false;
    }

    public boolean checkDiagDownRight(String w, int r, int c) {
        return false;
    }

    public String toString() {
        String strung = "";
        for(int i = 0; i < wordSearch.length; i++){
             for(int j = 0; j < wordSearch[i].length; j++){
                 strung += wordSearch[i][j];
                 strung += " ";
             }
             strung +="\n";
         }
        return strung;
    }
}
