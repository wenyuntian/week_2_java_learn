package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        for(String key : collectionA.keySet()) {
            Integer count = collectionA.get(key);

            List<String> list = object.get("value");
            if(list.contains(key)) {
                double step = Math.floor(count / 3);
                count -= (int)(step);
                collectionA.put(key, count);
            }
        }

        return collectionA;
    }
}
