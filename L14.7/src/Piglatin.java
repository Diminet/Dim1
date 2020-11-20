import java.util.Scanner;

public class Piglatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print(" word:= ");
        String word = in.next();
        System.out.println("Piglatin:= " + Plat(word));
    }}

    public static String Plat (String word) {
        String temp = word;
        char[] vocal = {'a', 'e', 'i', 'o', 'u'};
        char prim = temp.charAt(0);

        for (int i = 0; i < vocal.length; i++) {
     if (prim == vocal[i]) {
    return word + "way"; } }
        word = word.substring(1);
        word += prim + "ay";
        return word;
    }
}
