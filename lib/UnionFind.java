import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {
    static class UnionFind {
        int[] parent;
        int[] size;

        public UnionFind(int N) {
            this.parent = new int[N];
            this.size   = new int[N];
            for (int i=0; i<N; i++) {
                this.parent[i] = i;
                this.size[i]   = 1;
            }
        }

        // search root and re-label parent
        public int root(int x) {
            // x is the boss
            if (x == parent[x]) return x;

            // re-label and serch parent recursively
            parent[x] = root(parent[x]);

            return parent[x];
        }

        // return success merge or not
        public boolean merge(int x, int y) {
            // no merge (already same group)
            if (isSame(x, y)) return false;

            // merge small group to large one
            if (size[x] > size[y]) {
                size[root(x)] += size[root(y)];
                parent[root(y)] = root(x);
            } else {
                size[root(y)] += size[root(x)];
                parent[root(x)] = root(y);
            }

            return true;
        }

        // return is same group or not
        public boolean isSame(int x, int y) {
            return root(x) == root(y);
        }

        // return size of group
        public int size(int x) {
            return size[root(x)];
        }

        // for debug
        public void printParent() {
            for (int i=0; i<parent.length; i++) {
                System.out.print(parent[i]+" ");
            }
            System.out.println();
        }

        // for debug
        public void printSize() {
            for (int i=0; i<size.length; i++) {
                System.out.print(size[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UnionFind uf = new UnionFind(N);
    }
}

