package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Test.TestMatch.getString;

public class TestUnit5 {

    public static void isCountWord(String text,String word){
        String REGEX = "\\b"+word+"\\b";
        Pattern p = Pattern.compile(REGEX.toLowerCase());
        Matcher m = p.matcher(text.toLowerCase());
        int count = 0;
        while(m.find()) {
            count++;
            System.out.println("Номер "+count+"["+m.start()+"-"+m.end()+"]"); }  }

    public static void main(String[] args) {
       isCountWord(getString("Введите текст"),getString("Введите слово")); }
}
