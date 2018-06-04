package Test;

import java.util.Arrays;

import static Test.TestMatch.getInt;
import static Test.TestMatch.square;

public class TestUnit6 {

    public static int[] isInit() {
        int[] iArray = new int[3];
        iArray[0]=getInt("1-й отрезок: ");
        iArray[1]=getInt("2-й отрезок: ");
        iArray[2]=getInt("3-й отрезок: ");
        return  iArray;}

    public static String isPifagor(int[] tArray){
        Arrays.sort(tArray);
        if ((square(tArray[0])+square(tArray[1])==square(tArray[2])) & (tArray[0]!=0))
        {return new StringBuilder().append("Можно с катетами ").append(tArray[0]).append(", ").
                    append(tArray[1]).append(" и гипотенузой ").append(tArray[2]).toString();}
        else return "Нельзя";  }

    public static void main(String[] args) {
        System.out.println(isPifagor(isInit()));  }
}
