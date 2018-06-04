
package Test;

import static Test.TestMatch.getInt;

public class TestUnit1 {

    private static String isComposite(int n) {
        if (n < 2) return "Число не является ни составным, ни простым";
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return "Число составное";
        return "Число простое"; }

    private static String isEven(int n) {
      if( n % 2 == 0) return "четное";
      else return "нечетное"; }

    public static String isReshenie() {
        int n = getInt("Введите целое число: ");
        if (n ==0) return "Ошибка формата int";
        return new StringBuilder().append(isComposite(n)).append(" ").append(isEven(n)).toString(); }

    public static void main(String[] args) {
        System.out.println(isReshenie()); }
}
