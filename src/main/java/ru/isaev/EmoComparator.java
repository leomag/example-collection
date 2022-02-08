package ru.isaev;

import java.util.Comparator;

public class EmoComparator implements Comparator<EmoList> {

    @Override
    public int compare(EmoList o1, EmoList o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
