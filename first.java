package arrayList;
import java.util.ArrayList;
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
    }
    
}
