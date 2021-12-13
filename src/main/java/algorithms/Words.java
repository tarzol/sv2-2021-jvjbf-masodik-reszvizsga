package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Words {

    List<String> wordsOfList = new ArrayList<>();

    public void addWord(String word) {
        if( word.contains(" ")) {
            throw new IllegalArgumentException("It should be one word!");
        }

        for (char ch : word.toCharArray()) {
            if (ch >= 97 && ch <= 122 ) {
                wordsOfList.add(word);
            } else {
                throw new IllegalArgumentException("Word should be lower case!");
            }
        }
    }

    public List<String> getWords() {
        return wordsOfList;
    }

    public boolean isThereAWordTwice() {

        for ( int i = 0; i<wordsOfList.size(); i++) {
            /*if ( wordsOfList.get)) {

            }*/
        }
        return false;
    }
}
