import model.Word;
import service.WordBank;
import service.WordleGame;

public class Main {

    public static void main(String[] args) {

        // 1. Create WordBank 
        WordBank<String> wordBank = new WordBank<>();

        // 2. Add Words in WordBank
        wordBank.add("APPLE");
        wordBank.add("BRAVE");
        wordBank.add("CRANE");
        wordBank.add("GRAPE");
        wordBank.add("MANGO");
        wordBank.add("PEACH");
        wordBank.add("TRAIN");
        wordBank.add("HOUSE");
        wordBank.add("MOUSE");
        wordBank.add("LIGHT");
        wordBank.add("BREAD");
        wordBank.add("CHAIR");
        wordBank.add("DANCE");
        wordBank.add("EAGLE");
        wordBank.add("FLAME");
        wordBank.add("GHOST");
        wordBank.add("HONEY");
        wordBank.add("JUICE");
        wordBank.add("KNIFE");
        wordBank.add("LEMON");
        wordBank.add("MONEY");
        wordBank.add("NIGHT");
        wordBank.add("OCEAN");
        wordBank.add("PIANO");
        wordBank.add("QUEEN");
        wordBank.add("RIVER");
        wordBank.add("SNAKE");
        wordBank.add("TIGER");
        wordBank.add("UNCLE");
        wordBank.add("VOICE");
        wordBank.add("WATER");
        wordBank.add("YOUTH");
        wordBank.add("ZEBRA");

        // 3. Random secret word
        String randomWord = wordBank.getRandom();
        Word secret = new Word(randomWord);

        // 4. Game start 
        WordleGame game = new WordleGame(secret);
        game.start();
    }
}