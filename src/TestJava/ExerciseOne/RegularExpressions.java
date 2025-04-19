package TestJava.ExerciseOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static boolean matchesDamage(String input){
        String regex = "^(?!no )(?:damage|(?:minor|heavy) damages)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args){
        String inputOne = "damage";
        String inputTwo = "minor damages";
        String inputThree = "heavy damages";
        String inputFour = "no damages";
        System.out.println(matchesDamage(inputOne));
        System.out.println(matchesDamage(inputTwo));
        System.out.println(matchesDamage(inputThree));
        System.out.println(matchesDamage(inputFour));
    }
}
