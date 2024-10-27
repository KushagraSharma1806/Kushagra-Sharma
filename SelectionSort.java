import java.util.Scanner;

class SelectionSort {
    public void selectionSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter elements:");
        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }

        System.out.println("Array:");
        for (int b = 0; b < n; b++) {
            System.out.print(a[b] + "\t");
        }
        System.out.println();

        // Selection Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            // Swap the found minimum element with the first element
            swap(a, min, i);
        }

        System.out.println("Sorted array:");
        for (int m = 0; m < n; m++) {
            System.out.print(a[m] + "\t");
        }
        sc.close();
    }

    public void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();
        sorter.selectionSort();
    }
}