package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();

        for(String item : collection1) {
            String splitString = "";
            if(item.contains("-")){
                splitString = "-";
            } else if(item.contains(":")) {
                splitString = ":";
            } else if(item.contains("[")) {
                splitString = "\\[";
            }

            String [] valueArray = item.split(splitString);
            Integer step = 1;
            String value = valueArray[0];

            if(valueArray.length == 2) {
                step = Integer.valueOf(valueArray[1].replace("]", ""));
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
