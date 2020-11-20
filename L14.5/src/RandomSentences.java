
import java.util.*; //grants access to outside java utilities.
import java.util.Random;

public class RandomSentences {
    public static void main (String[] args) { //start of program.

        int i;

        String[] articles = { "the", "a", "one", "some", "any"};
        String[] noun = { "boy", "girl", "dog", "town" , "car"};
        String[] verb = {"drove", "jumped", "ran", "walked","skipped"};
        String[]  prep = {"to", "from", "over", "under", "on"};

        for (i = 1; i <= 20; i++) {
            Random r = new Random();
            int articles1 = r.nextInt(articles.length);
            int noun1 = r.nextInt(articles.length);
            int verb1 = r.nextInt(articles.length);
            int prep1 = r.nextInt( articles.length);
            int articles2 = r.nextInt(articles.length);
            int noun2 = r.nextInt(articles.length);

            String randomSentence = articles[articles1]+(" ") + noun[noun1] +(" ")+ verb[verb1]+(" ")
                    +  prep[prep1]+(" ")+articles[articles2]+(" ") + noun[noun2]+( ".\n");

            System.out.println("P:=  " + randomSentence.substring(0, 1).toUpperCase() + randomSentence.substring(1));
        }
    }

}