class InsertTest {

    @org.junit.jupiter.api.Test
    void sort() {
        int N = 10000;
        int[] ins = new int[N];
        ;
        for (int i = 0; i < N; i++) {
            ins[i] = (int) (Math.random() * 10000);
        }
        Insert.sort(ins);
        for (int i : ins) {
            System.out.println(i);
        }
    }
}