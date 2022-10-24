import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args){

        // declare array list
        ArrayList<Integer> list = new ArrayList<Integer>();

        // System.out.println(Arrays.toString(list));

        // method to append elements in list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4 );

        System.out.println(list);
        // method to remove element by index in the list
        // list.remove(1);
        // System.out.println(list);
        // list.remove(2);

        // System.out.println(list);

        //method to get element by index from existing list
        // int third = list.get(3);
        // System.out.println(third);

        // method to set (change) element in existing list 
        // list.set(3,5);
        // System.out.println(list);

        // method to check if an element exists in the give list
        // System.out.println(list.contains(4));

    }
}
