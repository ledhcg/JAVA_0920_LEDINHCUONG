package ru.mirea.pr11.zd1_2;


import java.util.LinkedList;

public class LinkedQueue {
    private int front;
    private int rear;
    private int count;
    private int cap;
    private LinkedList<Object> ll=new LinkedList<>();

    public LinkedQueue(int cap){
        this.cap=cap;
    }
    public void enqueue(Object e){
        ll.add(e);
        rear=(rear+1)%cap;
        count++;
    }
    public Object element(){
        return ll.get(front);
    }
    public void dequeue(){
        if(count == 0)
            System.out.println("UnderFlow");
        else {
            ll.set(front,null);
            front = (front + 1)%cap;
            count = count - 1;
        }
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return (count==0);
    }
    public void clear(){
        front=0;
        rear=0;
        count=0;
    }

    @Override
    public String toString() {
        return "LinkedQueue{" +
                  ll +
                '}';
    }
}
