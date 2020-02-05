package hash_map.mutable;

import java.util.HashMap;
import java.util.Map;

public class TestMutableKey {
    public static void main(String[] args) {
        Map testMap = new HashMap<MutableKey, Object>();
        MutableKey mutableKey = new MutableKey();

        mutableKey.setName("TestName");
        testMap.put(mutableKey, new Object());
        Object o = testMap.get(mutableKey);
        System.out.println("before changing key = " + o);
        mutableKey.setName("NewName");
        o = testMap.get(mutableKey);
        System.out.println("after changing key = " + o);
    }
}
