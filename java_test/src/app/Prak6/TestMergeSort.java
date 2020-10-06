package app.Prak6;

import java.util.Arrays;
import java.util.Iterator;

public class TestMergeSort {
    public static void main(String args[]) {
        Students[] bigList = combineTwoList(createList1(), createList2());
        System.out.println("List Default --------------------------------");
        showArrayStudents(bigList);

        MergeSort newSort = new MergeSort();
        Students[] sortedArray = executeMergeSort(bigList, newSort);

        System.out.println("\nSorted List (A-Z) ---------------------------");
        showArrayStudents(sortedArray);
    }

    public static Students[] createList1() {
        Students[] list = new Students[5];
        list[0] = new Students("Jame", 172, 3.56);
        list[1] = new Students("Harry", 943, 3.45);
        list[2] = new Students("Snaps", 368, 2.97);
        list[3] = new Students("Young", 718, 3.32);
        list[4] = new Students("Lily", 172, 3.61);
        return list;
    }

    public static Students[] createList2() {
        Students[] list = new Students[5];
        list[0] = new Students("Memory", 234, 2.5);
        list[1] = new Students("Beria", 159, 3.0);
        list[2] = new Students("Alost", 152, 3.9);
        list[3] = new Students("Hermine", 293, 3.1);
        list[4] = new Students("Ronde", 246, 3.5);
        return list;
    }

    public static Students[] combineTwoList(Students[] list1, Students[] list2) {
        Students[] bigList = new Students[10];
        for (int i = 0; i < 5; i++) {
            bigList[i] = list1[i];
        }

        for (int i = 0; i < 5; i++) {
            bigList[i + 5] = list2[i];
        }

        return bigList;
    }

    public static Students[] executeMergeSort(Students[] bigList, MergeSort newSort) {
        Students[] newArrayStudent = newSort.Sort(bigList, 0, bigList.length - 1);
        return newArrayStudent;
    }

    public static void showArrayStudents(Students[] arrayStudents) {
        Iterator<Students> iterator = Arrays.stream(arrayStudents).iterator();
        while (iterator.hasNext()) {
            Students element = iterator.next();
            element.showInformation();
        }
    }
}
