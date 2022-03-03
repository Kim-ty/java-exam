package com.gabekim.exam.collection.list;

import com.gabekim.exam.collection.map.HashTable;
import com.gabekim.exam.utils.User;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.TreeMap;

public class ListMain {

    public static void main(String[] args) {

        ArrayListExam<User> list = new ArrayListExam<User>();
        ArrayList<User> list2 = new ArrayList<User>();

        User user1 = new User("강병찬",29);
        User user2 = new User("강민우",29);
        User user3 = new User("양근영",29);
        User user4 = new User("설가",29);
        User user5 = new User("김태연",29);
        User user6 = new User("강빈",29);
        User user7 = new User("깅병무우우우우우우우우우우우",29);


        list2.add(user1);
        list2.add(user2);
        list2.add(user3);

        list.addByObj(user4);
        list.addByIndex(0,user5);
        list.addByObj(user6);
        list.addByIndex(list.size()-1,user7);
        list.addAllByIndex(0,list2);

        list.removeByIndex(0);
        list.removeByObject(user2);
        list.removeByCollection(list2);

        System.out.println(list.get(0).toString());
        System.out.println(list.indexOf(user7));
        list.clear();
        System.out.println(list.toString());

        Hashtable<String,User> treeTest = new Hashtable<String,User>();

        treeTest.put("강병찬",null);

        System.out.println(treeTest.toString());





    }
}
