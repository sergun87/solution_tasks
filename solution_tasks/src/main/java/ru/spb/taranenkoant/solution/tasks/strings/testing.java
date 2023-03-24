//Сгенировать случайную строку заданой длины

package solution_tasks.src.main.java.ru.spb.taranenkoant.solution.tasks.strings;// генерация строки заданной длины

import java.nio.charset.Charset;
import java.util.Random;

//Обьявляем класс я его назвал тестинг
class Texting
{
    public static void main(String[] args) {
        byte[] array = new byte[8]; // длина ограничена 8
        new Random().nextBytes(array);  // генерация строчки
        String generatedString = new String(array, Charset.forName("UTF-8")); // формат строки

        System.out.println(generatedString);
    }
}

