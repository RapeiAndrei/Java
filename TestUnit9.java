package Test;

import static Test.TestMatch.getInt;

public class TestUnit9 {

    public static int isInit(String str) { return getInt(str);}

    public static void isSumma(int n) {
        int summ=0;
        for (int i = 0; i <= n; i+=2)
        {summ+=i;
            System.out.print(new StringBuilder().append(i).append(" ").toString()); };
        System.out.println(new StringBuilder().append("\nCумма: ").append(summ).toString()); }

    public static void main(String[] args) {
        isSumma(isInit("Введите целое положительное число [0-N]: ")); }
}
