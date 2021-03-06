public class QuickUnionUF {

    private int[] id;

    public QuickUnionUF(int n) {
        id = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int proot = root(p);
        int qroot = root(q);

        id[proot] = qroot;
    }


    public static void main(String[] args) {
        Integer x = 1;
        byte y = (byte) 1;

        System.out.println(x == y);
    }
}
