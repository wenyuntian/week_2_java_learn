package cn.school.thoughtworks.section2;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();

        for(String item : collection1) {
            String [] valueArray = item.split("-");
            Integer step = 1;
            String value = valueArray[0];

            if(valueArray.length == 2) {
                step = Integer.valueOf(valueArray[1]);
            }

            if(result.containsKey(value)) {
                Integer count = result.get(value) + step;
                result.put(value, count);
            } else {
                result.put(value, step);
            }
        }

        return result;
    }
}
