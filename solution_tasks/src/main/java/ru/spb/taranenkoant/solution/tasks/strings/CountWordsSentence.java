package ru.spb.taranenkoant.solution.tasks.strings;

import java.util.List;

/**
 * Created by Anton on 22.03.2023
 * description:
 */
public class CountWordsSentence {

    public static void main(String args[]) {

        String sentence = "Тут у нас рандомное предложение, любое ,      какое нравится ";

        // не рабочий вариант, потому что выдает 14, а все таки слов отдельных у нас 8,
        // а если пробелов много, то вообще может быть сколько угодно
        String[] words = sentence.split(" ");
        System.out.println(words.length);

    }
}
