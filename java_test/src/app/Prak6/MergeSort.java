package app.Prak6;

public class MergeSort {
    void Merge(Students arrayStudents[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Students L[] = new Students[n1];
        Students R[] = new Students[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arrayStudents[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arrayStudents[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            int temp = L[i].getName().compareTo(R[j].getName());
            if (temp < 1) {
                arrayStudents[k] = L[i];
                i++;
            } else {
                arrayStudents[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arrayStudents[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arrayStudents[k] = R[j];
            j++;
            k++;
        }
    }
    public Students[] Sort(Students arrayStudents[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            Sort(arrayStudents, l, m);
            Sort(arrayStudents, m + 1, r);
            Merge(arrayStudents, l, m, r);
        }
        return arrayStudents;
    }
}
