package Oops_Concept;
import java.util.ArrayList;
import java.util.List;
public class TestDemo {
    public static void main(String[] args) {
        String str = "it was great talking walking to you";
        //Created Arraylist to store.
        List<String> minWords= new ArrayList<>();
        List<String> maxWords= new ArrayList<>();
        String[] words = str.split(" ");
        int minLength= Integer.MAX_VALUE;
        int maxLength=0;
        //String minWord = words[0];
        for (String word : words) {

            int wordLength=word.length();

            if (wordLength < minLength) {
                minLength=wordLength;
                minWords.clear();
                minWords.add(word);
            }
            else if (wordLength==minLength)
            {
                minWords.add(word);
            }
            //For Maxword
            if (wordLength > maxLength) {
                maxLength=wordLength;
                maxWords.clear();
                maxWords.add(word);
            }
            else if (wordLength==maxLength)
            {
                maxWords.add(word);
            }
        }
        System.out.println("Maxword= "+ maxWords);
        System.out.println("Minword= "+ minWords);
    }}
