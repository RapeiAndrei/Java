package Test;

import static Test.TestMatch.getInt;
public class TestUnit2 {

    public static int isSumma(int n1,int n2) { return n1+n2; }

    public static int isDifference(int n1,int n2) {return n1-n2; }

    public static int isNOD(int n1,int n2) {
        int max = n1;
        int min = n2;
        while ((max!=0)&(min!=0))
            if (max > min){max = max % min;}
            else { min = min % max;}
           return min+max; }

    public static int isNOK(int n1,int n2, int in3) { return (n1 * n2)/in3; }

    public static void isPrint(String st,int n1) {

    System.out.println(new StringBuilder().append(st).append(n1).toString()); }

    public static void main(String[] args) {
        int num1 = getInt("Введите num1 - целое положительное число: ");
        int num2 = getInt("Введите num2 - целое положительное число: ");
        isPrint("Сумма: ",isSumma(num1,num2));
        isPrint("Разность: ",isDifference(num1,num2));
        isPrint("НОД: ",isNOD(num1,num2));
        isPrint("НОК: ",isNOK(num1,num2,isNOD(num1,num2))); }
}
