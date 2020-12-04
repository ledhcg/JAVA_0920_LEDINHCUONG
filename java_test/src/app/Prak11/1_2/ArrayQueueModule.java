package ru.mirea.pr11.zd1_2;

import java.util.Arrays;

public class ArrayQueueModule {
    private Object[] arr=new Object[20];
    private int front;
    private int rear;
    private int count;

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
    public Object element(){
        return arr[front];
    }
    public void dequeue(){
        if(count == 0)            // Queue is empty
            System.out.println("UnderFlow");
        else {
            arr[front] = null;        // Delete the front element
            front = (front + 1)%arr.length;
            count = count - 1;
        }
    }
    public int size(){
        return count;
    }
    public void clear(){
        front=0;
        rear=0;
        count=0;
    }
    public boolean isEmpty() {
        return(count==0);
    }

    @Override
    public String toString() {
        return "ArrayQueueModule{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
