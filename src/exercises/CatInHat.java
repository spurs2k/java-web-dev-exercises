package exercises;

import java.util.Arrays;

public class CatInHat {
    public static void main(String[] args) {
        String str = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. I " +
                "will not eat them with a mouse.";

        String[] newString = str.replaceAll("[,]", "").split("\\.");
        System.out.println(Arrays.toString(newString));
        //38 minutes into class video shows a different way to print each on a seperate line.
    }
}
