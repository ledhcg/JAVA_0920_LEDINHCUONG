package app.Prak6;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSortingStudentsByGPA {
    public static void main(String args[]) {

        Students arrayStudents[] = createArrayStudents();
        System.out.println("Default List");
        TestStudents.showArrayStudents(arrayStudents, 5);

        System.out.println("\nQuick Sort");
        quickSortArrayStudents(arrayStudents);
        TestStudents.showArrayStudents(arrayStudents, 5);
    }

    public static Students[] createArrayStudents() {
        Students arrayStudents[] = new Students[5];
        arrayStudents[0] = new Students("Kun", 514, 3.61);
        arrayStudents[1] = new Students("Tom", 172, 3.21);
        arrayStudents[2] = new Students("Zac", 871, 3.45);
        arrayStudents[3] = new Students("John", 120, 3.72);
        arrayStudents[4] = new Students("Harry", 111, 3.1);
        return arrayStudents;
    }

    public static void quickSortArrayStudents(Students arrayStudents[]) {
        SortingStudentsByGPA.quickSortArrayStudents(arrayStudents, 0, 4);
    }

    public static void sortWithCollectionComparator(Students arrayStudents[]) {
        List<Students> listStudents = Arrays.asList(arrayStudents);
        Collections.sort(listStudents, new SortingStudentsByGPA());
    }
}
