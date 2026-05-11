package t52_String_Templates;

public class Ups {
    static void main() {
        String feature = "String Templates";
        int javaVersion = 23;
        String status = "deprecated";
//      System.out.println(STR."Oops! \{feature} feature was \{status} in Java \{javaVersion}!");
        System.out.printf("Oops! %s feature was %s in Java %d!", feature, status, javaVersion);
    }
}
