package generics.intro;

import java.util.ArrayList;
import java.util.List;

public class Intro {
    public void printMethod(){
        //Integer[] i = {1,2,3,4,5,6,7};
        List<Integer> integerList = addList(1,2,3,4,5,6,7);
        List<Integer> ints = addList();
        //List<Object> objs = addList(1, "two");

        printList(ints);
        //printList(objs);
        printSum(integerList);
    }

    private void printList(List<?> integerList){
        //List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        for(Object ints : integerList)
            System.out.println(ints);
    }

    private void printSum(List<Integer> integerList){
        //List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        int s = 0;
        for(int ints : integerList){
            s+= ints;
        }
        //assert s == 6;
        System.out.println(s);
    }

    private void printHelloWorld(){
        List<String> words = new ArrayList();
        words.add("Hello ");
        words.add("world!");
        String s = words.get(0)+words.get(1);
        System.out.println(s);
    }


    public <T> List<T> addList(T... arr) {
        List<T> list = new ArrayList<T>();
        for (T elt : arr)
            list.add(elt);
        return list;
    }

    public <T> void addAll(List<T> list, T... arr) {
        for (T elt : arr)
            list.add(elt);
    }

}
