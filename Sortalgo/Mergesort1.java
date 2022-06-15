package Sortalgo;

public class Mergesort1 {

    void merge(int a[], int beg, int mid, int end) {

        int i, j, k;

        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int leftarr[] = new int[n1];

        int rightarr[] = new int[n2];

        for (i = 0; i < n1; i++) {
            leftarr[i] = a[beg + i];
        }

        for (j = 0; j < n2; j++) {
            rightarr[i] = a[mid + 1 + j];
        }

        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = beg; /* initial index of merged sub-array */

        while (i < n1 && j < n2) {
            if (leftarr[i] <= rightarr[j]) {
                a[k] = leftarr[i];
                i++;
            } else {
                a[k] = rightarr[j];
                j++;

            }
            k++;
        }

        while (i < n1) {
            a[k] = leftarr[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = rightarr[i];
            j++;
            k++;
        }

    }

    void mergeSort(int a[], int beg, int end) {

        if (beg > end) {
            int mid = (end - beg) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, beg);

            merge(a, beg, mid, end);
        }

    }

    void printArray(int a[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {

        int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
        int n = a.length;
        Mergesort1 m1 = new Mergesort1();
        System.out.println("\nBefore sorting array elements are - ");
        m1.printArray(a, n);
        m1.mergeSort(a, 0, n - 1);
        System.out.println("\nAfter sorting array elements are - ");
        m1.printArray(a, n);
        System.out.println("");
    }

}
