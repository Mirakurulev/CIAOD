package com.company;

public class Sort {
    public static void vivod (int[][] arr){
        for (int[] line : arr) {
            for (int stolb : line) {
                System.out.print(stolb + "   \t");
            }
            System.out.println();
        }
    }
    public static void swap (int[] arr, int odin, int dva){
        int vrem = arr[odin];
        arr[odin] = arr[dva];
        arr[dva] = vrem;
    }
    //
    //первая сортировка
    //

    public static void one(int[][] arr, int y, int x) {
        for (int l = 0; l < y; l++) {
            for (int i = 0; i < x; i++) {
                int min = arr[l][i];
                int min_i = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[l][j] <min){
                        min = arr[l][j];
                        min_i = j;
                    }
                }
                if (i != min_i) {
                    int vrem = arr[l][i];
                    arr[l][i] = arr[l][min_i];
                    arr[l][min_i] =vrem;
                }
            }
        }
        System.out.println("1) Выбором");
        vivod(arr);
    }
    //
    //вторая сортировка
    //
    public static void two (int[][] arr, int y, int x){
        for (int i = 0; i < y; i++) { //проходимя по строкам
            for (int left = 0; left < x; left++) { //проходимся по элементам в строке
                int value = arr[i][left];
                int j = left - 1;
                for (; j >= 0; j--) {
                    if (value < arr[i][j]) {
                        arr[i][j + 1] = arr[i][j];
                    } else {
                        break;
                    }
                }
                arr[i][j + 1] = value;
            }
        }
        System.out.println("2) Вставкой");
        vivod(arr);
    }

    //
    //третья сортировка
    //
    public static void three (int[][] arr, int y, int x){
        for (int l = 0; l < y; l++) {
            for (int i = x - 1; i >=1; i--){
                for (int j = 0; j < i; j++){
                    if (arr[l][j] > arr[l][j + 1]) {
                        swap(arr[l], j, j + 1);
                    }

                }
            }
        }
        System.out.println("3) Обменом");
      vivod(arr);
    }
    //
    //четвёртая сортировка
    //
    public static void four (int[][] arr, int y, int x){
        for (int i = 0; i < y; i++) {
            int h = x / 2;
            while (h >= 1) {
                for (int j = 0; j < x; j++) {
                    for (int k = j; k < x-h; k+= h) {
                        if (arr[i][k] > arr[i][k+h])
                            swap(arr[i], k, k + h);
                    }
                }
                h = h / 2;
            }
        }
        System.out.println("4) Сортировка Шелла");
        vivod(arr);
    }
    //
    //пятая сортировка
    //
    public static void five (int[][] arr, int y, int x) {
        for (int i = 0; i < y; i++) {
            int[] stroka = arr[i];
            quickSort(stroka, 0, stroka.length - 1);
        }
        System.out.println("5) Быстрая");
        vivod(arr);
    }
    private static void quickSort (int[] stroka, int leftBorder, int rightBorder){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int op = stroka[(leftMarker + rightMarker) / 2];
        do {
            while (stroka[leftMarker] < op) {
                leftMarker++;
            }
            while (stroka[rightMarker] > op) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    swap (stroka, leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSort(stroka, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(stroka, leftBorder, rightMarker);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }

    }
    //
    //шестая сортировка
    //
    private static int heapSize ;
   public static void six (int[][] arr, int y, int x){
        int rr[] = new int [x];
        int j;

        for(int i = 0; i < y; i++){

            for (j = 0; j < x; j++){
                int v = arr[i][j];
                rr[j] = v;
            }
            buildHeap(rr);
            while (heapSize > 1) {
            swap(rr, 0, heapSize - 1);
            heapSize--;
            heapify(rr,0);
        }
            for (int stolb : rr) {
                System.out.print(stolb + "   \t");
            }
            System.out.println();
    }
       System.out.println("6) Пирамидальная");
        vivod(arr);
    }
    private static void buildHeap(int[] a) {
        heapSize = a.length;
        for (int i = a.length / 2; i >= 0; i--) {
            heapify(a, i);
        }
    }
    private static void heapify(int[] rr, int j) {
        int l = left(j);
        int r = right(j);
        int largest = j;
        if (l < heapSize && rr[j] < rr[l]) {
            largest = l;
        }
        if (r < heapSize && rr[largest] < rr[r]) {
            largest = r;
        }
        if (j != largest) {
            swap(rr, j, largest);
            heapify(rr, largest);
        }
    }
    private static int right(int j) {
        return 2 * j + 1;
    }
    private static int left(int j) {
        return 2 * j + 2;
    }


}
