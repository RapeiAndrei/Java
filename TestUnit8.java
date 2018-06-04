package Test;

import static Test.TestMatch.getInt;
import static Test.TestMatch.isPalindrome;

public class TestUnit8 {

    public static int isInit(String str) {
        return getInt(str); }

    public static void isIntPalidrome(int n) {
        if (n <= 100) {
            for (int i = 0; i <= n; i++)
                if (isPalindrome(Integer.toString(i))){
                    System.out.print(new StringBuilder().append(i).append(" ").toString());}
        }
        System.out.println("\nЧисло не должно быть больше 100"); }

    public static void main(String[] args) {
        isIntPalidrome(isInit("Введите целое положительное число [0-100]: "));}
}
