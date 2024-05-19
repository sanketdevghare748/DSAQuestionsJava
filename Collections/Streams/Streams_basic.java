package Sanket.Collections.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_basic {
    //use of streams to get the unique elements of  the given numbers

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(3);

       List <Integer> unique= list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(unique);
        System.out.println(unique.stream().filter(s -> s%2==0).map(s ->unique.size()).collect(Collectors.toList()));



    }
}
