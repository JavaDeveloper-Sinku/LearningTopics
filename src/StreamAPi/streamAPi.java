package StreamAPi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamAPi {
    public static void main(String[] args) {

        List<Integer> list = List.of(3, 4, 3, 1, 5, 3);

        List<Integer> list2 = new ArrayList<>();
        List<Integer> list11= new ArrayList<>();



        for (Integer i : list){
            if ( i % 2 == 0){
                list2.add(i);
            }
        }
//        System.out.println(list);
//        System.out.println(list2);
//
//
//        //Starting Using Stream API's
//
        Stream<Integer> stream = list.stream();
//        Stream<Integer> stream1 = list11.stream();

//        stream.forEach(e->{
//            System.out.println(e);
//        });
//        List<Integer> num = stream.distinct().collect(Collectors.toList());
        List<Integer> wa = stream.distinct().sorted().collect(Collectors.toList());
//        System.out.println(num);
        System.out.println(wa);



//stream api using

//        List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);
//
//
//        Stream<Object> empty = Stream.empty();



    }
}
