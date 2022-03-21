public class Insert {
    public static void main(String[] args) {
        int N = 10000;
        int[] ins = new int[N];
        ;
        for (int i = 0; i < N; i++) {
            ins[i] = (int) (Math.random() * 10000);
        }
        sort(ins);
        for (int i : ins) {
            System.out.println(i);
        }
    }


    public static int[] sort(int[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && comp(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
        return a;
    }

    private static void exch(int[] a, int i, int j) {  //交换数组a中第i和j两个元素
        int c = a[i];
        a[i] = a[j];
        a[j] = c;
    }

    private static boolean comp(int c1, int c2) { //判断c1是否小于c2
        return c1 < c2;
    }

}