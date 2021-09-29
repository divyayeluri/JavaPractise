package StringMethods;

public class IndexOFMethod {
    public static void main(String[] args) {
        String s1="this is index of example";
        int index1=s1.indexOf("is");
        System.out.println(index1);//returns the index of is substring
        int index2=s1.indexOf("index");//returns the index of index substring
        System.out.println(index2);
        int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index
        System.out.println(index3);
       // System.out.println(s1.charAt(50));
    }
}
