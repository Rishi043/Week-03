package linearsearch.wordsearch;

public class WordSearchInSentence {

    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence; // Return sentence if word is found
        }
        return "Not Found"; // Return "Not Found" if word is not in any sentence
    }

    public static void main(String[] args) {
        String[] sentences = {
                "Hello world",
                "Java is a popular programming language",
        };

        String word = "Java"; // Word to search

        // Call search function
        String result = findSentenceWithWord(sentences, word);
        System.out.println(result);
    }
}

