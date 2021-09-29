package StringMethods;

public class ReplaceAll {
    public static void main(String[] args) {
        String s1="My name is Khan. My name is Bob. My name is Sonoo.";
      String s2 =  s1.replaceAll("Khan","divya");
              String s3    =  s1.replaceAll("\\s","");
              String s4 = s1.replace('a','d');
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
