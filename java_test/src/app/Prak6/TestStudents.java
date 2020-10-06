package app.Prak6;

class Students {

    private String name;
    private int IDNumber;
    private double GPA;

    public Students(String name, int IDNumber, double GPA) {
        this.name = name;
        this.IDNumber = IDNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void showInformation() {
        System.out.println("Name: " + this.getName() + "\t ID: " + this.getIDNumber() + "\t GPA: " + this.getGPA());
    }
}

public class TestStudents {
    public static void main(String args[]) {

        Students arrayStudents[] = createArrayStudents();

        System.out.println("Default list");
        showArrayStudents(arrayStudents, 5);
        insertionSort(arrayStudents, 5);
        System.out.println("\nSorted list by ID");
        showArrayStudents(arrayStudents, 5);
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

    public static Students[] insertionSort(Students arrayStudents[], int numberElements) {
        int i, j;
        Students tempValue;
        for (i = 1; i < numberElements; i++) {
            tempValue = arrayStudents[i];
            j = i - 1;
            while (j >= 0 && arrayStudents[j].getIDNumber() > tempValue.getIDNumber()) {
                arrayStudents[j + 1] = arrayStudents[j];
                j = j - 1;
            }
            arrayStudents[j + 1] = tempValue;
        }
        return arrayStudents;
    }

    public static void showArrayStudents(Students arrayStudents[], int numberElements) {
        System.out.println("List Students -----------------------------");
        for (int i = 0; i < numberElements; i++) {
            arrayStudents[i].showInformation();
        }
    }
}


