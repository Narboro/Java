package WordsCounter.module;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringAnalyzer {
    public int analyzeLine(String sentence){
        Set<String> newSet = new HashSet<>(Arrays.asList(sentence.trim().split(" ")));
        return newSet.size();
    }
}
