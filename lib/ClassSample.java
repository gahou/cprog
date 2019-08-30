import java.util.*;

public class Main {
    static class Myclass {
        public int a;

        public MyClass(int a) {
            this.a = a;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Myclass> pq = new PriorityQueue<Myclass>(new Comparator<MyClass() {
            public int compare(Myclass a, Myclass b) {
                return a.a-b.a;
            }
        });
    }
}
