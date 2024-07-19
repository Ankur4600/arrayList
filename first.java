package arrayList;
import java.util.ArrayList;
import java.util.Collections;
public class first {
    public static void main(String[] args) {
        /*syntax of arraylist is
         * ArrayList< ..class..> list_name= new ArrayList<>();
         */
        ArrayList<Integer> new_list= new ArrayList<Integer>();
        //it can be like this
        //ArrayList<Integer> list= new ArrayList<>();
        //adding values in the list
        new_list.add(7);
        new_list.add(45);
        new_list.add(18);
        //to print the list
        System.out.println(new_list);
        //to get element
        int element=new_list.get(1);
        System.out.println(element);
        //to add element in between
        new_list.add(1,17);
        System.out.println(new_list);


        //to change  element at  any index
        new_list.set(1,9);
        System.out.println(new_list); 

        //to delete element
        new_list.remove(0);
        System.out.println(new_list);


        //to get the size of the ArrayList
        System.out.println(new_list.size());


        //using loop[s in ArrayList
        for(int i=0;i<new_list.size(); i++){
            System.out.print(new_list.get(i)+" ");
        }
        System.out.println();

        //sorting in ArrayList
        Collections.sort(new_list);
        System.out.println(new_list);
    }

    
}
