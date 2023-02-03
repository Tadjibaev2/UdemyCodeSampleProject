package autoboxing;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public class CollectionMain {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(Integer.valueOf(1));

        Integer integ = 56;
        int s = integ.intValue();
        Double doub = 56.567;
        double d = doub.doubleValue();


        String[] colors = {"Yellow", "Green", "Blue"};

        LinkedList<String> ll = new LinkedList<>(Arrays.asList(colors));
        ll.add("Black");

        colors = ll.toArray(new String[ll.size()]);

        for(int i = 0; i<colors.length; i ++){
            System.out.println(colors[i]);
        }
    }
}
