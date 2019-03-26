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
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                wordSearch[i][j] = "" + str.charAt(index);
                index++;
            }
        }
    }

    public boolean isFound(String word) {
         boolean found = false;
         for(int i = 0; i < wordSearch.length; i++){
             for(int j = 0; j<wordSearch.length;j++){
                  if(checkRight(word, i, j))
                      found = true;
                  if(checkLeft(word, i, j))
                      found = true;
                  if(checkDown(word, i, j))
                      found = true;
                  if(checkUp(word, i, j))
                      found = true;
                  if(checkDiagUpRight(word, i, j))
                      found = true;
                  if(checkDiagUpLeft(word, i, j))
                      found = true;
                  if(checkDiagDownRight(word, i, j))
                      found = true;
                  if(checkDiagDownLeft(word, i, j))
                      found = true;
             }
         }
        
         if (found) {
             return true;
         }
         return false;
    }

    public boolean checkRight(String w, int r, int c) {
        wordProg = "";
        for (int i = 0; i < w.length(); i++) {
            if (c + w.length() < wordSearch[r].length) {
                wordProg += wordSearch[r][c + i];
            }
        }
        if (wordProg.equals(w)) {
            return true;
        }
        return false;
    }

    public boolean checkLeft(String w, int r, int c) {
        wordProg = "";
        for (int i = 0; i < w.length(); i++) {
            if (c - w.length() >= 0) {
                wordProg += wordSearch[r][c - i];
            }
        }
        if (wordProg.equals(w)) {
            return true;
        }
        return false;
    }

    public boolean checkUp(String w, int r, int c) {
        wordProg = "";
        if (r + w.length() < wordSearch.length) {
            for (int i = 0; i < w.length(); i++) {
                wordProg += wordSearch[r + i][c];
            }
        }
        if (wordProg.equals(w)) {
            return true;
        }
        return false;
    }

    public boolean checkDown(String w, int r, int c) {
        wordProg = "";
        if (r - w.length() >= 0) {
            for (int i = 0; i < w.length(); i++) {
                wordProg += wordSearch[r - i][c];
            }
            if (wordProg.equals(w)) {
                return true;
            }
        }
            return false;
         }

    public boolean checkDiagUpRight(String w, int r, int c) {
        wordProg = "";

        if (r - w.length() >= 0 && c + w.length() < wordSearch[r].length) {
            for (int i = 0; i < w.length(); i++) {
                wordProg += wordSearch[r - i][c + i];
            }
            if (wordProg.equals(w)) {
                return true;
            }
        }
            return false;
    }

    public boolean checkDiagUpLeft(String w, int r, int c) {
        wordProg = "";
        if (r - w.length() >= 0 && c - w.length() >= 0) {
            for (int i = 0; i < w.length(); i++) {
                wordProg += wordSearch[r - i][c - i];
            }
            if (wordProg.equals(w)) {
                return true;
            }
        }
            return false;
    }

    public boolean checkDiagDownLeft(String w, int r, int c) {
        wordProg = "";
        if (r + w.length() < wordSearch.length && c - w.length() >= 0) {

            for (int i = 0; i < w.length(); i++) {
                wordProg += wordSearch[r + i][c - i];
            }
            if (wordProg.equals(w)) {
                return true;
            }
        }
            return false;
    }

    public boolean checkDiagDownRight(String w, int r, int c) {
        wordProg = "";
        if (r + w.length() < wordSearch[r].length && c + w.length() < wordSearch[r].length) {
            for (int i = 0; i < w.length(); i++) {
                wordProg += wordSearch[r + i][c + i];
            }
            if (wordProg.equals(w)) {
                return true;
            }
        }
            return false;
    }

    public String toString() {
        String strung = "";
        for (int i = 0; i < wordSearch.length; i++) {
            for (int j = 0; j < wordSearch[i].length; j++) {
                strung += wordSearch[i][j];
                strung += " ";
            }
            strung += "\n";
        }
        return strung;
    }
}