package com.imooc.collection;

import java.util.Comparator;

/**
 * @author fujianjun
 * @date 2019/8/31 - 17:01
 */
public class StudentComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
