package Test;

import java.util.Arrays;

import static Test.TestMatch.getIntOne;

public class TestUnit10 {

    public static int[] isInit() {
        int[] tArray = new int[3];
        tArray[0] = getIntOne();
        tArray[1] = getIntOne();
        tArray[2] = getIntOne();
        return tArray; }

    public static String isPrint(int[] tempArray)
    {        String str="";
         for (int i = 0; i<tempArray.length; i++)
             str = new StringBuilder().append(str).append(tempArray[i]).toString();
         return str;}

    public static int[] isSwap(int[] in3,int a,int b){
        int temp = in3[a];
        in3[a] = in3[b];
        in3[b] = temp;
        return in3;}

    public static boolean isNextPermutation(int[] tempArray) {
        int a = tempArray.length - 2;
        while (a != -1 && tempArray[a] >= tempArray[a + 1]) a--;
        if (a == -1) return false;
        int b = tempArray.length - 1;
        while (tempArray[a]>=tempArray[b]) b--;
        isSwap(tempArray,a,b);
        for (int i = a + 1, j = tempArray.length - 1; i < j; i++, j--) isSwap(tempArray, i, j);
        return true;}

    public static void isPermutation(int[] tArray) {
        int i=0;
        Arrays.sort(tArray);
        System.out.println("--------------------------");
        System.out.println(new StringBuilder().append(++i).append(" ").append(isPrint(tArray)).toString());
        while(isNextPermutation(tArray))
            System.out.println(new StringBuilder().append(++i).append(" ").append(isPrint(tArray)).toString());
        System.out.println("--------------------------"); }

        public static void main(String[] args) {
       isPermutation(isInit()); }
}