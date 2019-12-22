package com.summer.design.patterns.created.singleton.containertype;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {
    private static Map<String,Object> singletonMap = new HashMap<String,Object>();

    private ContainerSingleton(){

    }

    public static void putInstance(String key,Object instance){
        if (!singletonMap.containsKey(key)){
            singletonMap.put(key,instance);
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
