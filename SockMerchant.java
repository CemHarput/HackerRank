static int sockMerchant(int n, int[] ar) {
    Set<Integer> colors = new HashSet<>();
    int pairs = 0;

    for (int i = 0; i < n; i++) {
        if (!colors.contains(ar[i])) {
            colors.add(ar[i]);
        } else {
            pairs++;
            colors.remove(ar[i]);
        }
    }
    return pairs;


}
