package Test;

import java.util.Arrays;

import static Test.TestMatch.getString;

public class TestUnit4 {

    public static String[] isCountWord(String text){
        text= text.replaceAll(","," ");
        String [] sArray = text.split(" ",-1);
        Arrays.sort(sArray);
        return sArray; }

    public static void isPrintWord(String[] sArray){
        for (int i = 0; i < sArray.length; i++)
            System.out.println("["+sArray[i]+"]");
        System.out.println("_________________________");
        System.out.println("Количество слов: "+sArray.length); }

    public static void main(String[] args) {
        isPrintWord(isCountWord(getString("Введите строку"))); }
}
