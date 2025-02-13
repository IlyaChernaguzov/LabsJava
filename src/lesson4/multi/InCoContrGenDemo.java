package lesson4.multi;

import java.util.*;


public class InCoContrGenDemo {
    public static void main(String[] args) {
//        Integer num1 = 22;
//        Number num2 = 2424;
//        num2 = num1;
//
        //Ковариантность массивов
        String[] srtArray = new String[0];
        Object[] objArray = srtArray;



        //Ковариантность List
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        List<Number> numb = new ArrayList<>();
        List<? extends Number> numbers = numb;

        //Контравариативность List
        List<Integer> integerList2 = new ArrayList<>();
        List<Double> doubleList2 = new ArrayList<>();
        List<Object> objectList2 = new ArrayList<>();
        List<Number> numb2 = new ArrayList<>();
        List<Integer> numbers2 = integerList2;


        //Инвариантность
//        List<String> srt = integerList2;




//        List<Number> list = new ArrayList<>();
//        list.add(1);
//        list.add(2L);
//        list.add(1.0);
//
//        Collection<? super Number> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(2L);
//        list2.add(1.0);


        //PECS

        List<Number> nums = Arrays.asList(4.1F, 0.2F);
        List<Integer> integers = Arrays.asList(1, 2);
        Collections.copy(nums, integers);

        nums.forEach(System.out::println);

    }
}
