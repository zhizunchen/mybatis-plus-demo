package com.example.demo.collectionbasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Created by chenhe
 * @Date 2019-08-29 17:42
 * @Description list 操作相关
 */
public class ListTest {


    public static void main(String[] args) {
//        asListTest();
//        testBasicDataType();

        testArrToList();
    }
//数组转list
    public static void asListTest(){
        String[] myArray = { "Apple", "Banana", "Orange" };

        //Arrays.asList() 将数组转换为集合后，底层还是数组，不能使用集合相关的方法，asList的返回对象
        //是一个Arrays内部类，并没有实现集合的修改方法，方法提现的是适配器模式，只是转换接口，后台数据仍是数组
        List<String> myList = Arrays.asList(myArray);

        System.out.println(myList);
        //
        List<String> myListTwo = Arrays.asList("Apple", "Banana", "Orange");
    }

    public static void testBasicDataType(){
        //原生数据类型数据作为参数，Arrays.asList()得到的参数不是数组中的元素，是数组对象本身，list的唯一元素是这个数组
        int[] myArray = { 1, 2, 3 };
        List myList = Arrays.asList(myArray);

//        System.out.println(myList.size());//1
//        System.out.println(myList.get(0));//数组地址值
//        System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
//        int [] array=(int[]) myList.get(0);
//        System.out.println(array[0]);//1
        Integer[] myArray1 = { 1, 2, 3 }; //使用包装类
        List myList1 = Arrays.asList(myArray);
    }
     public static void testArrToList(){
         String[] myArray = { "Apple", "Banana", "Orange" };
         List<String> list = Arrays.asList(myArray);
         List newList1 = list.stream().collect(Collectors.toList());

         //or
         List newList2 = new ArrayList(Arrays.asList(myArray));
         System.out.println(newList1.add(1));
         System.out.println(newList2.add(2));

     }

//List转数组
    public static void testOne(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("1111");
        list.add("2222");
        list.add("3333");

        list.toArray(new String[0]);
    }
}
