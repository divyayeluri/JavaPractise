package Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class VectorExample {
    List<CustomEmployee> list = new Vector<>();

    public static void main(String[] args) {
        List<CustomEmployee> list = new Vector<>();//Vector implements ArrayList
        list.add(new CustomEmployee("Divya", "Gogula", 445));
        list.add(new CustomEmployee("Appu", "G", 441));
        list.add(new CustomEmployee("Sai", "G", 442));
        list.add(new CustomEmployee("vasavi", "g", 447));
     //   list.forEach(s -> System.out.println(s));
        List<CustomEmployee> sortedName = list.stream().sorted((o1, o2) -> (int)(o2.getFirstname().compareTo(o1.getFirstname()))).collect(Collectors.toList());
        List<CustomEmployee> sortedlist1 = list.stream().sorted((o1, o2) -> (int)(o2.getId()- o1.getId())).limit(3).collect(Collectors.toList());
        List<CustomEmployee> sortedlist2 = list.stream().sorted((o1, o2) -> (int)(o2.getId()- o1.getId())).skip(3).collect(Collectors.toList());
      //  System.out.println(sortedlist1);
     //   System.out.println(sortedlist2);
        System.out.println(sortedName);
    }
}
