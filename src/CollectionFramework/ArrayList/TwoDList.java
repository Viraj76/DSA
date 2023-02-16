package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TwoDList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.get(0).add(23);
        list.get(0).add(33);
        list.get(0).add(43);
        list.get(1).add(54);
        list.get(1).add(64);
        list.get(1).add(74);
        List<Integer> curList  = list.get(0);
        System.out.println(curList);
        System.out.println(list);
        System.out.println(list.size());


    }
}
