package com.mapper.bm.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NullForTest {
    public static void main(String[] args) {
        List<Map<String,Object>> test = new ArrayList<Map<String,Object>>();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("a","123");
        map.put("b","456");
        test.add(map);
        Map<String,Object> map2 = new HashMap<String, Object>();
        map2.put("a","111");
        map2.put("b","222");
        test.add(map2);
        Map<String,Object> map3 = new HashMap<String, Object>();
        map3.put("a","333");
        map3.put("b","666");
        test.add(map3);
        Map<String,Object> map1 = new HashMap<String, Object>();
        map1.put("c","123");
        map1.put("d","456");
    // a--c     b--d
        boolean bool = false;
        for (Map<String,Object> mapTeat:test) {
            if (mapTeat.get("a").equals(map1.get("c"))&&mapTeat.get("b").equals(map1.get("d"))){
                bool = true;
                break;
            }
        }
        System.out.println(bool);
    }
}
