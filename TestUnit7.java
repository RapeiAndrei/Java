package Test;

import java.util.Arrays;

import static Test.TestMatch.getInt;

public class TestUnit7 {

    public static int isInit(String str) {
        return getInt(str);}

    public static int[] isInitArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (10 + (Math.random() * (100 - 10)));
            System.out.print(arr[i] + " ");  }
        return arr; }

    public static String isMinMaxArray(int[] tArray) {
        Arrays.sort(tArray);
        for (int i = 0; i < tArray.length; i++) {
            System.out.print(tArray[i] + " "); }
         return new StringBuilder().append("\nMIN: ").append(tArray[0]).
                append(" MAX: ").append(tArray[tArray.length - 1]).toString();}

    public static void main(String[] args) {
       System.out.print(isMinMaxArray(isInitArray(isInit("Введите целое положительное число [1-N]: "))));}
}