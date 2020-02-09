package generics.subtypingandWildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubtypingAndWildcards {

    public void printMethod(){
        /*List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(7);*/
        List<Number> numberList = new ArrayList();
        numberList.add(1);
        numberList.add(3.4);
        List<? super Integer> integerList = numberList;
        //List<? extends Number> integerList = numberList;
        /*List<Integer> ints = Arrays.asList(1, 2);
        List<Double> dbls = Arrays.asList(2.78, 3.14);
        numberList.addAll(ints);
        numberList.addAll(dbls);*/
        integerList.add(4);

        //integerList.forEach(System.out::println);

        //printList(integerList);

        Integer[] ints = new Integer[] {1,2,3};
        Number[] nums = ints;
        nums[2] = 3.14;

        for(int i=0; i<nums.length; i++)
            System.out.println(nums[i]);
        List<Integer> intList = Arrays.asList(1,2,3);
        List<? extends Number> numList = intList;
        //numList.set(2, 3);
        //List<?> list = new List<Object>();

    }

    private void printList(List<?> integerList){
        for(Object ints : integerList)
            System.out.println(ints);
    }
}
