public void BubbleSort(Integer[] arr) {
    int i = 0, n = arr.length;
    boolean swapNeeded = true;
    while (i < n - 1 && swapNeeded) {
        swapNeeded = false;
        for (int j = 1; j < n - i; j++) {
            if (arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                swapNeeded = true;
            }
        }
        if(!swapNeeded) {
            break;
        }
        i++;
    }
}
