package com.mapper.bm.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import org.apache.commons.beanutils.PropertyUtilsBean;

public class ResHandler {
    public List resForArrayList(Object resObject){

        return new ArrayList();
    }

        public static ArrayList ConvertObjToMap(Object obj){
            ArrayList<String> list=new ArrayList<String>();
            if (obj == null)
                return null;
            Field[] fields = obj.getClass().getDeclaredFields();
            try {
                for(int i=0;i<fields.length;i++){
                    try {
                        Field f = obj.getClass().getDeclaredField(fields[i].getName());
                        f.setAccessible(true);
                        Object o = f.get(obj);
                        list.add(o.toString());
                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            }
            return list;
        }
        //将javabean实体类转为map类型，然后返回一个map类型的值
//        public static HashMap<String, Object> beanToMap(Object obj) {
//            HashMap<String, Object> params = new HashMap<String, Object>(0);
//            try {
//                PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
//                PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj);
//                for (int i = 0; i < descriptors.length; i++) {
//                    String name = descriptors[i].getName();
//                    if (!"class".equals(name)) {
//                        params.put(name, propertyUtilsBean.getNestedProperty(obj, name));
//                    }
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            return params;
//        }
}
