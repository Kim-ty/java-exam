package com.gabekim.exam.collection.list;

import java.util.ArrayList;

// 단방향 포인터 구조, 데이터에 인덱스를 가지고있어 조회기능에 사용
public class ArrayListExam<T> extends  ArrayList<T>{

    private ArrayList<T> list = new ArrayList<T>();

    private void loggingList(String methods){
        System.out.println("======================================================");
        System.out.println(methods);
        System.out.println("-------------------------------------------------------");
        System.out.println("list : "+list.toString());
        System.out.println("======================================================");
    }

    // 인덱스로 지움
    public void removeByIndex(int index){
        list.remove(index);
        loggingList("index로 지움");
    }

    // object를 이용해 지움
    public void removeByObject(T obj){
        list.remove(obj);
        loggingList("Object로 지움");

    }

    //컬렉션에 속한 리스트를 지움
    public void removeByCollection(ArrayList<T> list){
        this.list.removeAll(list);
        loggingList("list로 지움");

    }

    //index에 object추가
    public void addByIndex(int index,T obj){
        list.add(index,obj);
        loggingList("index에 추가");

    }

    //object를 추가
    public void addByObj(T obj){
        list.add(obj);
        loggingList("object를 맨뒤에 추가");

    }

    //해당 index에 리스트에 속한 것들을 추가
    public void addAllByIndex(int index,ArrayList<T> list){
        this.list.addAll(index,list);
        loggingList("list를 index에 추가");
    }

}
