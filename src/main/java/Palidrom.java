public class Palidrom {


    private String palidrom (String word){
        String word1 = word.trim().replace(" ", "").toLowerCase();
        if (isPalidrome(word1, 0, word1.length()-1)){
            return "Word is a palidrome";
        }
        return "Word isn`t a palidrome";
    }

    boolean isPalidrome(String word, int x, int y){
        char[] word1 = word.trim().replace(" ", "").toLowerCase().toCharArray();
        if (y<=x){
            return true;
        }
        else if (word1[x] != word1[y]){
            return false;
        }
        else {
            return isPalidrome(word, x+1, y-1);
        }
    }
}
