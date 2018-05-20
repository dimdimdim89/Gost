package test;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import static java.util.Objects.isNull;

class ThirdTest {
    private Map<String, Long> wordsCounts = new HashMap<>();

    void process(String text) {
        if (isNull(text)) {
            throw new RuntimeException("Null text");
        }
        StringTokenizer tokenizer = new StringTokenizer(text, " ,;.!?");
        while (tokenizer.hasMoreElements()) {
            String word = (String) tokenizer.nextElement();
            wordsCounts.compute(word, (k, v) -> {
                if (isNull(v)) {
                    return 1L;
                } else {
                    return v + 1;
                }
            });
        }
        wordsCounts.
                entrySet().
                stream().
                sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).
                forEach(System.out::println);
    }
}
