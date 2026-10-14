package model;

public final class Word {

    private final String value;

    public Word(String value) {
        this.value = value.toUpperCase();
    }

    public String getValue() {
        return value;
    }

    // Check Letter
    public boolean contains(char letter) {
        return value.indexOf(letter) != -1;
    }

    // Position Check
    public boolean isCorrectPosition(char letter, int position) {
        return value.charAt(position) == letter;
    }

    // Word Length
    public int length() {
        return value.length();
    }

    // toString()
    @Override
    public String toString() {
        return value;
    }
}