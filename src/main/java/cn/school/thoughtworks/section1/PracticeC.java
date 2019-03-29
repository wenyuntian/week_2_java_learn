package cn.school.thoughtworks.section1;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> result = new LinkedList<>();
        List<String> list = collection2.get("value");
        for(String item : collection1) {
            if(list.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
