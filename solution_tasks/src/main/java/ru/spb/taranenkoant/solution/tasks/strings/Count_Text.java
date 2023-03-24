
//Пример взят из интернетов но я его чуть доработал.
//Добавил алгоритм подчета запятых

import java.util.Scanner;

public class Count_Text {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Вводим предложение в консоль
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();
        //Начальное количество слов равно 0
        int count = 0;
        int zapyatay = 0;
        //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
        if (input.length() != 0) {
            count++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < input.length(); i++) {

                if (input.charAt(i) == ' ') {
                    //Если пробел - увеличиваем количество слов на 1
                    count++;

                    for (; i < input.length(); i++) {
                        if (input.charAt(i) == ',') {

                            //System.out.println("Вы ввели запятые в предложении");
                            zapyatay++;


                        }
                    }
                }
            }
        }
        System.out.println("Вы ввели "+count+" слов, запятых "+zapyatay+"");
        //System.out.println("Вы ввели "+zapyatay+"  запятых");
    }
}