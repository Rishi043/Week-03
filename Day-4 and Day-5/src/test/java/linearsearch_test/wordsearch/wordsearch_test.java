package linearsearch_test.wordsearch;

import linearsearch.wordsearch.WordSearchInSentence;
import org.junit.Assert;
import org.junit.Test;

public class wordsearch_test {
    @Test
    public void tester(){
        String [] sentences = {"I love ice cream", "the sun is shining", "She went to sea shore"};
        String word = "sun";

        Assert.assertEquals("the sun is shining", WordSearchInSentence.findSentenceWithWord(sentences,word));

    }
}
