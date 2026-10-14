# Wordle Clone

Console-based Wordle game built with Core Java.
Guess the 5-letter word in 6 attempts with color-coded feedback.

## Features

- 5-letter secret word
- 6 attempts
- Color feedback (🟩 🟨 ⬜)
- Win/Lose detection

## Topics Covered

- Interface
- String Deep Dive
- StringBuilder
- Generics
- Wildcards
- Enum
- Custom Exception

## 🚀 How to Run

1. Compile all files
2. Run Main.java

## 📖 Sample Output

## 📖 Sample Output

```
=== WORDLE ===
Guess the 5-letter word in 6 attempts!

=== HOW TO PLAY ===
1. Guess the 5-letter word
2. You have 6 attempts
3. Color feedback:
   Green  - Correct letter, correct position
   Yellow - Correct letter, wrong position
   Grey   - Letter not in word
===================


Attempt 1/6
Enter 5-letter word: abcde
A - Yellow
B - Grey
C - Yellow
D - Grey
E - Yellow

Attempt 2/6
Enter 5-letter word: FGHIJ
F - Grey
G - Grey
H - Yellow
I - Grey
J - Grey

Attempt 3/6
Enter 5-letter word: caeho
C - Yellow
A - Yellow
E - Yellow
H - Yellow
O - Grey

Attempt 4/6
Enter 5-letter word: heacm
H - Yellow
E - Green
A - Green
C - Green
M - Grey

Attempt 5/6
Enter 5-letter word: peach
P - Green
E - Green
A - Green
C - Green
H - Green

=========================
     CONGRATULATIONS!    
=========================
You won in 5 attempts!
```
