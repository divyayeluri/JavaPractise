public class ComparisionStrings {

        public static void main(String[] args)
        {
            String s1 = "Ram";
            String s2 = "Ram";
            String s3 = "Shyam";
            String s4 = "ABC";
            int n = 10;
            String s = String.valueOf(n); // converts int,char ,long, float, double, boolean, char and char array into String.
            System.out.println(" Comparing strings with compareTo:");
            System.out.println(s1.compareTo(s2));
            System.out.println(s1.compareTo(s3));
            System.out.println(s1.compareTo(s4));
            System.out.println(s+10);
        }
    }

