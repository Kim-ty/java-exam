package com.gabekim.exam.collection.list;

import java.util.Collection;

// 양방향 포인터 구조, 데이터의 삽입,삭제가 빈번할 경우 데이터의 위치정보만 수정할수 있음
// 스택,큐,양방향 큐를 만들기 용이
public class LinkedList<T> extends java.util.LinkedList<T> {

    public void loggingList(String methods){
        System.out.println();
        System.out.println("======================================================");
        System.out.println(methods);
        System.out.println("-------------------------------------------------------");
        System.out.println("list : "+this.toString());
        System.out.println("======================================================");
        System.out.println();
    }

    public void addByObj(T object){
        this.add(object);
    }

    public void addByIndex(int index,T object){
        this.add(index,object);

    }

    public void addAllByIndex(int index, Collection<T> collection){
        this.addAll(index,collection);
    }

    public void addAllByObj(Collection<T> collection){
        this.addAll(collection);
    }

    @Override
    public void addFirst(T object){
        super.addFirst(object);
    }

    @Override
    public void addLast(T object){
        super.addLast(object);
    }
//
//    public void remove(){
//        this.re
//    }

}
