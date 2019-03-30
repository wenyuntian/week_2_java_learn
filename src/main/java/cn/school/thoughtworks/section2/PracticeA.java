package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();
        for(String item : collection1) {
            if(result.containsKey(item)) {
                Integer count = result.get(item) + 1;
                result.put(item, count);
            } else {
                result.put(item, 1);
            }
        }

        return result;
    }
}
