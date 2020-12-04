package ru.mirea.pr11.zd1_2;

import java.util.Arrays;

public class ArrayQueueADT {
    private Object[] arr;
    private int front;
    private int rear;
    private int count;

    public ArrayQueueADT(int cap){
        arr=new Object[cap];
    }
    public static void enqueue(ArrayQueueADT aqadt,Object element){
        if(aqadt.count==aqadt.arr.length){
            System.out.println("Over flow");
        }
        else {
            aqadt.arr[aqadt.rear] = element;
            aqadt.rear = (aqadt.rear + 1) % aqadt.arr.length;
            aqadt.count++;
        }
    }
    public static Object element(ArrayQueueADT aqadt){
        return aqadt.arr[aqadt.front];
    }
    public static void dequeue(ArrayQueueADT aqadt){
        if(aqadt.count == 0)
            System.out.println("UnderFlow");
        else {
            aqadt.arr[aqadt.front] = null;
            aqadt.front = (aqadt.front + 1)%aqadt.arr.length;
            aqadt.count = aqadt.count - 1;
        }
    }
    public static int size(ArrayQueueADT aqadt){
        return aqadt.count;
    }
    public static void clear(ArrayQueueADT aqadt){
        aqadt.front=0;
        aqadt.rear=0;
        aqadt.count=0;
    }
    public static boolean isEmpty(ArrayQueueADT aqadt) {
        return(aqadt.count==0);
    }

    @Override
    public String toString() {
        return "ArrayQueueADT{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
