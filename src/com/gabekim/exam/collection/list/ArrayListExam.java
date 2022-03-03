package com.gabekim.exam.collection.list;

import com.gabekim.exam.utils.CommonUtils;

import java.util.ArrayList;

// 단방향 포인터 구조, 데이터에 인덱스를 가지고있어 조회기능에 사용
public class ArrayListExam<T> extends ArrayList<T>{


    CommonUtils utils = new CommonUtils();

    // 인덱스로 지움
    public void removeByIndex(int index){
        this.remove(index);
        utils.loggingList("index로 지움",this);
    }

    // object를 이용해 지움
    public void removeByObject(T obj){
        this.remove(obj);
        utils.loggingList("Object로 지움",this);

    }

    //컬렉션에 속한 리스트를 지움
    public void removeByCollection(ArrayList<T> list){
        this.removeAll(list);
        utils.loggingList("list로 지움",this);

    }

    //index에 object추가
    public void addByIndex(int index,T obj){
        this.add(index,obj);
        utils.loggingList("index에 추가",this);

    }

    //object를 추가
    public void addByObj(T obj){
        this.add(obj);
        utils.loggingList("object를 맨뒤에 추가",this);

    }

    //해당 index에 리스트에 속한 것들을 추가
    public void addAllByIndex(int index,ArrayList<T> list){
        this.addAll(index,list);
        utils.loggingList("list를 index에 추가",this);
    }
}
