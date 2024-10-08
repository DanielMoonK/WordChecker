import java.util.ArrayList;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;
    private int count = 0;

    public WordChecker(ArrayList<String> wList){
        wordList = wList;
    }

    public void printList(){
        System.out.println(wordList);
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
        for(int word = 1; word != wordList.size(); word++){
            // System.out.println(wordList.get(word));
            if (wordList.get(word).contains(wordList.get(word - 1))){
                count++;
            }
        }
        return count == wordList.size() - 1;
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
    public ArrayList<String> createList(String target) {
        ArrayList<String> newWordList = new ArrayList<String>();
        for (int word = 0; word != wordList.size(); word++){
            if(wordList.get(word).length() >= target.length()){
                if (wordList.get(word).substring(0, target.length()).equals(target)){
                    newWordList.add(wordList.get(word).substring(target.length(), wordList.get(word).length()));
                }
            }
        }
        return newWordList;
    }
}
