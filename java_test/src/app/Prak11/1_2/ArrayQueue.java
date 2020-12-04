package ru.mirea.pr11.zd1_2;

import java.util.Arrays;

public class ArrayQueue extends AbstractQueue {
    private Object[] arr;
    public ArrayQueue(int cap){
        arr=new Object[cap];
    }
    @Override
    public void enqueue(Object element){
        if(count==arr.length){
            System.out.println("Over flow");
        }
        else {
            arr[rear] = element;
            rear = (rear + 1) % arr.length;
            count++;
        }
    }
    @Override
    public Object element(){
        return arr[front];
    }
    @Override
    public void dequeue(){
        if(count == 0)
            System.out.println("UnderFlow");
        else {
            arr[front] = null;
            front = (front + 1)%arr.length;
            count = count - 1;
        }
    }
    @Override
    public int size(){
        return count;
    }
    @Override
    public void clear(){
        front=0;
        rear=0;
        count=0;
    }
    @Override
    public boolean isEmpty() {
        return(count==0);
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
