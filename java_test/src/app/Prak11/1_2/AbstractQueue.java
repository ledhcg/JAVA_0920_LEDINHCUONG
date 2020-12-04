package ru.mirea.pr11.zd1_2;

abstract class AbstractQueue {
    protected int count;
    protected int front;
    protected int rear;

    abstract public void enqueue(Object element);
    abstract public Object element();
    abstract public void dequeue();
    abstract public void clear();
    abstract public int size();
    abstract public boolean isEmpty();
}
