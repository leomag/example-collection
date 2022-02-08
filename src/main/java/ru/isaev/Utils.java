package ru.isaev;

import java.util.Iterator;
import java.util.Map;

public class Utils {

    public static void printAllWhile(Iterable<?> iterable) {
        Iterator<?> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

    public static void printAllFor(Iterable<?> iterable) {
        for (Object obj : iterable) {
            System.out.println(obj);
        }
    }

    //TODO: нужна проверка на null, чтобы не бросалось IllegalStateException
    public static void removeEmpty(Iterable<EmoList> iterable) {
        Iterator<EmoList> iterator = iterable.iterator();
        while (iterator.hasNext()) {
              try {
                  iterator.remove();
              } catch (IllegalStateException e) {
                  System.exit(0);
              }

        }
    }

    public static void iterateOverMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " -> " + value);
        }
    }

    public static void iterateOverMapAnalog(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }


}
