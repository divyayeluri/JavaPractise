package StringMethods;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("java"); //The append() method concatenates the given argument with this String.
        System.out.println(sb);
        sb.insert(1,"c");//The insert() method inserts the given String with this string at the given position.
        System.out.println(sb);
        sb.replace(1,7,"j2EE");//The replace() method replaces the given String from the specified beginIndex and endIndex.
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);//The reverse() method of the StringBuilder class reverses the current String
    }
}
