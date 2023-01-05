package org.example;

// https://www.codewars.com/kata/5390bac347d09b7da40006f6/java

public class JadenCase {
    public String toJadenCase(String phrase) {
        String changedWord = null;

        if (phrase != null && !phrase.equals("")) {
            changedWord = "";
            String[] arr = phrase.split(" ");

            for (int i = 0; i < arr.length; i++) {
                String word = arr[i];

                System.out.println("Before change: " + word);

                char wordFirstCharacter = word.charAt(0);
                String wordFirstCharacterUpperCase = String.valueOf(wordFirstCharacter).toUpperCase();
                String wordWithoutFirstCharacter = word.substring(1);

                changedWord += wordFirstCharacterUpperCase + wordWithoutFirstCharacter;
                if (i < arr.length - 1) {
                    changedWord += " ";
                }

                System.out.println("After change: " + changedWord);
            }
        }
        System.out.println("Changed Word: " + changedWord);
        return changedWord;
    }
}
