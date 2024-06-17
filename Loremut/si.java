public static int findMaxSubarray(int[] arr) {
  int maxSoFar = Integer.MIN_VALUE;
  int maxEndingHere = 0;

  for (int i = 0; i < arr.length; i++) {
    maxEndingHere = maxEndingHere + arr[i];
    if (maxSoFar < maxEndingHere) {
      maxSoFar = maxEndingHere;
    }

    if (maxEndingHere < 0) {
      maxEndingHere = 0;
    }
  }

  return maxSoFar;
}
