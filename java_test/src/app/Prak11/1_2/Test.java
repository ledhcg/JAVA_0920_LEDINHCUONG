package ru.mirea.pr11.zd1_2;

public class Test {
    public static void main(String[] args) {
        ArrayQueueModule arr=new ArrayQueueModule();
        arr.enqueue("obj1");
        arr.enqueue("obj2");
        arr.enqueue("obj3");
        arr.enqueue("obj4");
        arr.enqueue("obj5");
        System.out.println(arr.toString());
        System.out.println("Array size: "+arr.size());
        System.out.println("Array first element: "+arr.element());
        arr.dequeue();
        System.out.println("Array after delete first element");
        System.out.println(arr.toString());
        System.out.println("Delete array");
        arr.clear();
        System.out.println("Array is empty? "+arr.isEmpty());
        System.out.println("");

        ArrayQueueADT arr2=new ArrayQueueADT(10);
        ArrayQueueADT.enqueue(arr2,"obj1");
        ArrayQueueADT.enqueue(arr2,"obj2");
        ArrayQueueADT.enqueue(arr2,"obj3");
        ArrayQueueADT.enqueue(arr2,"obj4");
        ArrayQueueADT.enqueue(arr2,"obj5");
        System.out.println(arr2.toString());
        System.out.println("Array size: "+ArrayQueueADT.size(arr2));
        System.out.println("Array first element: "+ArrayQueueADT.element(arr2));
        ArrayQueueADT.dequeue(arr2);
        System.out.println("Array after delete first element");
        System.out.println(arr2.toString());
        System.out.println("Delete array");
        ArrayQueueADT.clear(arr2);
        System.out.println("Array is empty? "+ArrayQueueADT.isEmpty(arr2));
        System.out.println("");

        ArrayQueue arr3=new ArrayQueue(10);
        arr3.enqueue("obj1");
        arr3.enqueue("obj2");
        arr3.enqueue("obj3");
        arr3.enqueue("obj4");
        arr3.enqueue("obj5");
        System.out.println(arr3.toString());
        System.out.println("Array size: "+arr3.size());
        System.out.println("Array first element: "+arr3.element());
        arr3.dequeue();
        System.out.println("Array after delete first element");
        System.out.println(arr3.toString());
        System.out.println("Delete array");
        arr3.clear();
        System.out.println("Array is empty? "+arr3.isEmpty());
    }
}
