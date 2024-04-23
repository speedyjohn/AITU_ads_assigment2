package org.example.utils.sort;

public class MergeSort {
    static void merge(Object arr[], int l, int m, int r) {
        int size1 = m - l + 1;
        int size2 = r - m;

        Object L[] = new Object[size1];
        Object R[] = new Object[size2];

        for (int i = 0; i < size1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < size2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < size1 && j < size2) {
            try {
                if (((Comparable) L[i]).compareTo(R[j]) <= 0) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            } catch (NullPointerException e) {}
        }

        while (i < size1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < size2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sortArr(Object arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            sortArr(arr, l, m);
            sortArr(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static Object[] sort(Object[] arr, int l, int r) {
        sortArr(arr, l, r);
        return arr;
    }
}
