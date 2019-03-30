package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        for(String key : collectionA.keySet()) {
            Integer count = collectionA.get(key);

            List<String> list = object.get("value");
            if(list.contains(key)) {
                count--;
                collectionA.put(key, count);
            }
        }

        return collectionA;
    }
}
