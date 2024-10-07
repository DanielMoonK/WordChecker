import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<String> banList = new ArrayList<String>();
        banList.add("ban");
        banList.add("band");
        banList.add("band");
        banList.add("abandon");

        WordChecker wordBanList = new WordChecker(banList);
        wordBanList.printList();

        if(wordBanList.isWordChain()){
            System.out.println("The list is a word chain");
        }
        else{
            System.out.println("The list is not a word chain");
        }

        System.out.println(" ");

        ArrayList<String> toList = new ArrayList<String>();
        toList.add("to");
        toList.add("too");
        toList.add("stool");
        toList.add("tools");

        WordChecker wordToList = new WordChecker(toList);
        wordToList.printList();

        if(wordToList.isWordChain()){
            System.out.println("The list is a word chain");
        }
        else{
            System.out.println("The list is not a word chain");
        }

        System.out.println(" ");

        ArrayList<String> catList = new ArrayList<String>();
        catList.add("catch");
        catList.add("bobcat");
        catList.add("catchacat");
        catList.add("cat");
        catList.add("at");

        // System.out.println(catList);

        WordChecker wordCatList = new WordChecker(catList);

        System.out.println(wordCatList.createList("cat"));
        System.out.println(wordCatList.createList("catch"));
        System.out.println(wordCatList.createList("dog"));
    }
}