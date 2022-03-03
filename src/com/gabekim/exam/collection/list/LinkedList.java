package com.gabekim.exam.collection.list;

import com.gabekim.exam.utils.CommonUtils;

import java.util.Collection;

// 양방향 포인터 구조, 데이터의 삽입,삭제가 빈번할 경우 데이터의 위치정보만 수정할수 있음
// 스택,큐,양방향 큐를 만들기 용이
public class LinkedList<T> extends java.util.LinkedList<T> {
    
    CommonUtils utils = new CommonUtils();
    

    public void addByObj(T object){
        this.add(object);
        utils.loggingList("object추가",this);
    }

    public void addByIndex(int index,T object){
        this.add(index,object);
        utils.loggingList("index로 추가",this);

    }

    public void addAllByIndex(int index, Collection<T> collection){
        this.addAll(index,collection);
        utils.loggingList("index로 list추가",this);
    }

    public void addAllByObj(Collection<T> collection){
        this.addAll(collection);
        utils.loggingList("list 추가",this);
    }

    @Override
    public void addFirst(T object){
        super.addFirst(object);
        utils.loggingList("첫번째에 추가",this);
    }

    @Override
    public void addLast(T object){
        super.addLast(object);
        utils.loggingList("마지막에 추가",this);
    }
//
//    public void remove(){
//        this.re
//    }

}
