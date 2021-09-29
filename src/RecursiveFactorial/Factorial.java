package RecursiveFactorial;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(3));
    }
    public static int recursiveFactorial(int num){
        //stackoverflow error if not defined
        if(num==0) {
            return 1;
        }
        //n! = n *(n-1)!,so calling recursively n-1
        return num * recursiveFactorial(num-1);
    }
}
