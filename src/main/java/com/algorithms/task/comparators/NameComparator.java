package com.algorithms.task.comparators;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();

        if (name1 == null && name2 == null) {
            return 0;
        }

        if (name1 == null) {
            return -1;
        }

        if (name2 == null) {
            return 1;
        }

        return name1.compareTo(name2);
    }

}
