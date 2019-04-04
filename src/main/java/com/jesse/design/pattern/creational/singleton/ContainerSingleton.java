package com.jesse.design.pattern.creational.singleton;

import org.apache.commons.lang.StringUtils;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jesse Guo
 * @Title: ContainerSingleton
 * @ProjectName design_course
 * @Description: 单利模式--容器单利
 * @date 2019/4/317:46
 */
public class ContainerSingleton {

    private ContainerSingleton(){

    }

    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }


}
