//package solution_tasks.src.main.java.ru.spb.taranenkoant.solution.tasks.strings;


import java.util.Scanner;

public class Count_Simvol {
    private static long countOccurrences(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

    public static void main(String[] args)
    {
        //String str = "ABAACBDD";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
         num = in.nextInt();
        char ch = 'A';

        String str;
        System.out.println("Character " + ch + " occurs " + countOccurrences(num) + " times.");
    }
}
