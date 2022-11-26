import java.util.ArrayList;
import java.util.Collection;

import static java.util.Collection.*;
import static java.util.Collections.sort;

public class Araylist {
    public static void main(String[] args) {
        // using of string
        //ArrayList<String> cars =new ArrayList<>();
//        cars.add("valvo");
//        cars.add("bmw");
//        cars.add("ford mustang");
//        cars.add("porche");
//        cars.set(0,"farri");
//        cars.remove(0);
//        System.out.println(cars.get(2));
//        System.out.println(cars);
//        cars.clear();
//        cars.isEmpty();


//        System.out.println(cars.size());// we cheak the size of the cars
//   using for loop     for (int i=0; i< cars.size();i++){
//            System.out.println(cars.get(i));
//        }
        // using for each loop
//        for(String i:cars){
//            System.out.println(i);
//        }
        ArrayList<Integer> i=new ArrayList<>();
        i.add(12);
        i.add(14);
        i.add(176);
        i.add(17);

        sort(i);
        for (int j:i) {
            System.out.println(j);

        }

    }
}
