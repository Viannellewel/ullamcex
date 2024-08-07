public int findMin(int[] array) {
    int min = array[0]; // Assuming array is not empty
    for (int i = 1; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
        }
    }
    return min; // Return the smallest value found in the array
}
