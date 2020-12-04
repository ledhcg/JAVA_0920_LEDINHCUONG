package ru.mirea.pr11.zd1_2;

public interface Queue {
    void enqueue(Object element);
    Object element();
    void dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
