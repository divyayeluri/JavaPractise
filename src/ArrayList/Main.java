package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void print(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        List<CustomEmployee> list = new ArrayList<>();
        list.add(new CustomEmployee("Divya","Gogula",445));
        list.add(new CustomEmployee("Appu","G",441));
        list.add(new CustomEmployee("Sai","G",442));
        list.add(new CustomEmployee("vasavi","g",447));
     //  list.forEach(s -> System.out.println(s));
     //  list.forEach(s -> System.out.println(s.getFirstname()));
       list.forEach(s -> print(s.getFirstname())); // for method
        Consumer<CustomEmployee> c = s -> System.out.println(s);
        list.forEach(c);
        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.contains(new CustomEmployee("Mary","christ",22)));
        list.remove(2);
        list.forEach(s -> System.out.println(s));
    }
}
