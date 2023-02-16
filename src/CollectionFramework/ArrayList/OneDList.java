package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OneDList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(45);
        list.add(50);

        System.out.println(list);     // printing
        list.set(2,56);
        System.out.println(list);       //setting an  index number with another number

        int max= list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
