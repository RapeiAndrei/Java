package Test;

import static Test.TestMatch.getString;
import static Test.TestMatch.isPalindrome;

public class TestUnit3 {

    public static String isPrintTestPalindromeWord(String str){
        if (isPalindrome(str)){
            return "Строка является палидромом";
        }else return "Строка не является палидромом";}

    public static void main(String[] args) {
         System.out.println(isPrintTestPalindromeWord(getString("Введите слово для проверки на палиндромность:"))); }
}
