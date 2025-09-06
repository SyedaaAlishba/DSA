package hashSet;
import java.util.HashSet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args){
        //creating
        HashSet<Integer> set= new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);

        //Size
        System.out.println("Size of set is "+set.size());

        //print all elements
        System.out.println(set);

        //Search - contains
        if (set.contains(1)){
            System.out.println("Set contains 1");
        }
        if (!set.contains(9)){
            System.out.println("Not contains 9");
        }

        //delete
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("We deleted one");
        }

        //Iterator
        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
