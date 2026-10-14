package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordBank <T> {

    private final List<T> words;
    private final Random random;


    public WordBank() {
        this.words = new ArrayList<>();
        this.random = new Random();
    }

    public void add(T word) {
        words.add(word);
    }

    public T getRandom() {
        if(words.isEmpty()) {
            return null;
        }

        int index = random.nextInt(words.size());
        return words.get(index);
    }
    

    public int size() {
        return words.size();
    }

    public void printAll(List < ? extends T > wordList) {
        for( T word : wordList) {
            System.out.println(word);
        }
    }
}
