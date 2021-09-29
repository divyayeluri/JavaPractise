package StringMethods;

public class SplitEx {

    public static void main(String args[]) {
        String s1 = "java string split method by javatpoint";
        String s[] = s1.split("\\s");
        //    String[] words=s1.split("\\s");//splits the string based on string
//using java foreach loop to print elements of string array

        for (String w : s) {
            System.out.println(w);
        }
    }
}
