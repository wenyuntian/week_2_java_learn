package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> countMap = new cn.school.thoughtworks.section2.PracticeB().countSameElements(collectionA);
        return new PracticeB().createUpdatedCollection(countMap, object);
    }
}
