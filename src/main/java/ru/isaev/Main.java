package ru.isaev;

import java.util.*;

import static ru.isaev.Utils.*;

public class Main {

    public static void main(String[] args) {
//        List<EmoList> list = new ArrayList<>();
//        list.add(new EmoList("Кристина", 18));
//        list.add(new EmoList("Дима", 18));
//
//        printAllWhile(list);
////        removeEmpty(list);
////        printAllFor(list);
//
////        list.remove(1);
////        list.remove(list.get(1));
////        printAllFor(list);
////        System.out.println(list.size());
//
//        List<String> stringList = new ArrayList<>();
//        stringList.add("привет");
//        stringList.add("пока");
//        stringList.add("как дела");
//        stringList.add("ха-ха-ха");
//        printAllFor(stringList);
//        System.out.println(stringList.indexOf("х"));
//        System.out.println(stringList.indexOf("пока"));
//
//        Set<EmoList> emoListSet = new HashSet<>();
//        emoListSet.add(new EmoList("Вася", 19));
//        emoListSet.add(new EmoList("Аня", 19));
//        printAllFor(emoListSet);
//        emoListSet.add(new EmoList("Аня", 19));
//        printAllFor(emoListSet);
//        TODO: в Set нельзя хранить дубликаты
//        Set<Integer> setInt = new HashSet<>();
//        setInt.add(1);
//        setInt.add(2);
//        setInt.add(3);
//        setInt.add(4);
//        printAllFor(setInt);
//        setInt.add(2);
//        printAllFor(setInt);
//        Queue<String> integerQueue = new LinkedList<>();
//        integerQueue.offer("ИТМО");
//        integerQueue.offer("СПбГУ");
//        integerQueue.offer("Политех");
//        integerQueue.offer("ЛЭТИ");
//        printAllWhile(integerQueue);
//        System.out.println("Удаленный элемент: " + integerQueue.poll());
//        printAllFor(integerQueue);
//        System.out.println("Первый элемент: " + integerQueue.peek());
            //TODO ArrayDeque максимум 16 элементов
//        Deque<String> stringDeque = new ArrayDeque<>();
//        stringDeque.addFirst("Исаев");
//        stringDeque.addFirst("Цопа");
//        stringDeque.addFirst("Клименков");
//        stringDeque.addFirst("Николаев");
////        printAllFor(stringDeque);
//
//        //    stringDeque.addLast("Кустарев");
////        printAllFor(stringDeque);
//        //  stringDeque.removeFirst();
//        //   printAllWhile(stringDeque);
//        //   stringDeque.removeLast();
//
////        printAllFor(stringDeque);
//
//        System.out.println(stringDeque.getFirst());
//        System.out.println(stringDeque.getLast());
//
//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Санкт-Петербург", 1);
//        hashMap.put("Москва", 2);
//        hashMap.put("Ростов-на-Дону", 2);
//        hashMap.put("Нижний Новгород", 3);
//        hashMap.put("Нижний Новгород", 6);
//        iterateOverMapAnalog(hashMap);
//        hashMap.put("Москва", 4);
//        iterateOverMapAnalog(hashMap);


//        SortedSet<Student> set = new TreeSet<>();
//        set.add(new Student("Ира", "Медведа", 19));
//        set.add(new Student("Катя", "Петрова", 23));
//        set.add(new Student("Аня", "Машкова", 55));
//        set.add(new Student("Ася", "Иванова", 15));
//        set.forEach(System.out::println);
//
//        Student studentFirst = new Student("Саша", "Иванов", 36);
//        Student studentSecond = new Student("Вася", "Иванов", 25);
//
//        System.out.println(studentFirst.compareTo(studentSecond));


        EmoComparator emoComparator = new EmoComparator();
        SortedSet<EmoList> emoLists = new TreeSet<>(emoComparator);
        emoLists.add(new EmoList("Кристина", 24));
        emoLists.add(new EmoList("Ася", 20));
        emoLists.add(new EmoList("Настя", 15));
        emoLists.forEach(System.out::println);

    }


}
