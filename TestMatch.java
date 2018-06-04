package Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatch {

    public static String getString(String st) {
        System.out.println(st);
        Scanner in = new Scanner(System.in);
        return in.nextLine();}

    public static boolean isPalindrome(String text) {
        text=text.replaceAll("\\W","");
        return  text.equalsIgnoreCase(new StringBuilder(text).reverse().toString()); }


    static float square(float  a) {
        return a * a;  }


    public static int getIntOne() {
        Scanner in = new Scanner(System.in);
        String st = null;
        Pattern p = Pattern.compile("^\\d");
        Matcher m = null;
        do {
            System.out.print("Введите цифру от 0 до 9: ");
            st = in.nextLine();
            m = p.matcher(st);
            if (!m.matches()) System.out.println( "Ошибка ввода!");
        } while (!m.matches());

        return Integer.parseInt(st);  }


    public static int getInt(String str) {
        Scanner in = new Scanner(System.in);
        String st = null;
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = null;
        do {
            System.out.print(str);
            st = in.nextLine();
            m = p.matcher(st);
            if (!m.matches()) System.out.println("Некорректные данные!");
        } while (!m.matches());
        try {
            return Integer.parseInt(st);
        } catch (NumberFormatException e) {System.out.println("Число не соответствет типу int");
        }
        return -1;
    }
}
