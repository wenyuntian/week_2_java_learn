package cn.school.thoughtworks.section1;

import java.util.LinkedList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result = new LinkedList<>();
        List<String> subList = collection2.get(0);
        for(String item : collection1) {
            if(subList.contains(item)){
                result.add(item);
            }
        }
        return result;
    }
}
