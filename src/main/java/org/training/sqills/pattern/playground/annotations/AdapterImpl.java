package org.training.sqills.pattern.playground.annotations;

import java.lang.reflect.Field;

public class AdapterImpl {

    public static Object adaptObj(Object src) {
        Object instance = null;
        Class<?> classLoc = src.getClass();
        Field[] declaredFieldsLoc = classLoc
                                        .getDeclaredFields();

        for (Field declaredFieldLoc : declaredFieldsLoc) {
            AdapterMapping annotationLoc = declaredFieldLoc.getAnnotation(AdapterMapping.class);
            if (annotationLoc != null){
                if (instance == null){
                    try {
                        instance = annotationLoc.targetClass().newInstance();
                    } catch (Exception eParam) {
                        eParam.printStackTrace();
                        return null;
                    }
                }
                declaredFieldLoc.setAccessible(true);
                try {
                    Object oLoc = declaredFieldLoc.get(src);
                    Field  fieldLoc = annotationLoc.targetClass()
                                                   .getDeclaredField(annotationLoc.target());
                    if (fieldLoc != null){
                        fieldLoc.setAccessible(true);
                        fieldLoc.set(instance, oLoc);
                    }
                } catch (Exception eParam) {
                    eParam.printStackTrace();
                }
            }
        }
        return instance;
    }

    public static <T,R> T adapt(R src) {
        T instance = null;
        Class<?> classLoc = src.getClass();
        Field[] declaredFieldsLoc = classLoc
                .getDeclaredFields();

        for (Field declaredFieldLoc : declaredFieldsLoc) {
            AdapterMapping annotationLoc = declaredFieldLoc.getAnnotation(AdapterMapping.class);
            if (annotationLoc != null){
                if (instance == null){
                    try {
                        instance = (T) annotationLoc.targetClass().newInstance();
                    } catch (Exception eParam) {
                        eParam.printStackTrace();
                        return null;
                    }
                }
                declaredFieldLoc.setAccessible(true);
                try {
                    T oLoc = (T) declaredFieldLoc.get(src);
                    Field  fieldLoc = annotationLoc.targetClass()
                                                   .getDeclaredField(annotationLoc.target());
                    if (fieldLoc != null){
                        fieldLoc.setAccessible(true);
                        fieldLoc.set(instance, oLoc);
                    }
                } catch (Exception eParam) {
                    eParam.printStackTrace();
                }
            }
        }
        return instance;
    }

}
