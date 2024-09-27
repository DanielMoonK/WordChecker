import java.util.List;
import java.util.ArrayList;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;
    private int count = 0;

    public WordChecker(ArrayList<String> wList){
        wordList = wList;
    }

    /**
     * Returns true if each element of wordList (except the first) contains the
     * previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    public boolean isWordChain() {
        count = 0;
        for(int i = 0; i == wordList.size() - 2; i++){
            if (wordList[i+1].contains(wordList)){
                count++;
            }
        }
        return count++ == wordList.size();
    }

    /**
     * Returns an ArrayList<String> based on strings from wordList that start
     * with target, as described in part (b). Each element of the returned ArrayList
     * has had
     * the initial occurrence of target removed.
     * Postconditions: wordList is unchanged.
     * Items appear in the returned list in the same order as they appear in
     * wordList.
     */
//     public ArrayList<String> createList(String target) {
//         /* to be implemented in part (b) */ }
// }