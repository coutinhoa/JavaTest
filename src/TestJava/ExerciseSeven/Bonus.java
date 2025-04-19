package TestJava.ExerciseSeven;

public class Bonus {

    private static boolean previousValue = false;

    public static String printLetter(boolean input){
        if(input){
            return "a";
        }

        if(!previousValue){
            previousValue = true;
            return "b";
        } else {
            previousValue = false;
            return "c";
        }
    }

    public static void main(String[] args){
        System.out.println(printLetter(true));//a
        System.out.println(printLetter(false));//b
        System.out.println(printLetter(true));//a
        System.out.println(printLetter(false));//c
        System.out.println(printLetter(true));//a
        System.out.println(printLetter(false));//b
    }
}
