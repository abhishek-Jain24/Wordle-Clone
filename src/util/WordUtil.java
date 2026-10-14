package util;

import model.LetterStatus;
import model.Word;

public interface WordUtil {

    // Guess evaluate karo
    LetterStatus[] evaluate(String guess, Word secret);
}