package general.fail_fast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {
    public static void main(String[] args) {
        List<Integer> failFastList = new ArrayList();
        int num = 0;
        for(int i=0; i<10; i++){
            failFastList.add(num+=10);
        }

        Iterator<Integer> itr = failFastList.iterator();
        int indexFlag = 0;
        while(itr.hasNext()){
            if(++indexFlag == 4)
                failFastList.remove(itr);
            System.out.println(itr.next());
        }
    }
}
