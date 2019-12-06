package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试泛型
 * @author fujianjun
 * @date 2019/8/29 - 14:48
 */
public class TestGeneric {

    /**
     *带有泛型--Course,的List类型熟悉
     */
    public List<Course> courses;

    /**
     * 对带有泛型courses属性利用构造器进行实例化
     */
    public TestGeneric(){
        this.courses = new ArrayList<>();

    }

    /**
     * 测试添加
     */
    public void testAdd(){
        Course cr1 = new Course("1","大学语文");
        courses.add(cr1);
        //泛型集合中，不能添加泛型规定的类型及其子类型以外的对象，否则会报错！
//        courses.add("能否添加一些奇怪的东西呢？？");
        Course cr2 = new Course("2","java基础");
        courses.add(cr2);

    }
    /**
     * 泛型集合可以添加泛型的子类型的对象实例
     */
    public void testChild(){
        ChildCourse ccr = new ChildCourse();
        ccr.id = "3";
        ccr.name = "我是子类型的课程对象实例~~";
        courses.add(ccr);
    }
    /**
     * 泛型不能使用基本类型
     */
    public void testBasicType(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.println("基本类型的包装必须使用包装类作为泛型"+list.get(0));
    }
    /**
     * 测试循环遍历
     */
    public void testForEach(){
        for(Course cr:courses){
            System.out.println(cr.id+":"+cr.name);
        }
    }
    public static void main(String[] args){
        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.testForEach();
        tg.testChild();
        tg.testForEach();
        tg.testBasicType();
    }
}
