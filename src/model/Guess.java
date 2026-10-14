package model;


public class Guess {

    private final String word;
    private final LetterStatus[] statuses;

    public Guess(String word, LetterStatus[] statuses) {
        this.word = word.toUpperCase();
        this.statuses = statuses;
    }

    public String getWord() {
        return word;
    }

    public LetterStatus[] getStatuses() {
        return statuses;
    }

    // Display Guess
    public void display() {
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            LetterStatus status = statuses[i];

            String color;

            if (status == LetterStatus.GREEN) {
                color = "Green";
            } else if (status == LetterStatus.YELLOW) {
                color = "Yellow";
            } else {
                color = "Grey";
            }

            System.out.println(letter + " - " + color);
        }
    }

    // Every letter is correct ? 
    public boolean isCorrect() {
        for (LetterStatus status : statuses) {
            if (status != LetterStatus.GREEN) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return word;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Guess other = (Guess) obj;
        return this.word.equals(other.word);
    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }
}