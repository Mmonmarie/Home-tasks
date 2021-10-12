import java.util.Objects;
public class Pair<T, S> {

        private T x;
        private S y;

        private Pair(T x, S y) {
            this.x = x;
            this.y = y;
        }

        public T getFirst() {
            return x;
        }

        public S getSecond() {
            return y;
        }

        public static Pair of(Object T, Object S) {
            Pair pair = new Pair(T, S);
            return pair;
        }

        public static void main(String[] args) {
            Pair<Integer, String> pair = Pair.of(1, "hello");
            Integer i = pair.getFirst(); // 1
            String s = pair.getSecond(); // "hello"

            Pair<Integer, String> pair2 = Pair.of(1, "hello");
            boolean mustBeTrue = pair.equals(pair2); // true!
            boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
            Object object = new Object();
            System.out.println(mustBeTrue + " " + mustAlsoBeTrue);
        }
        public String toString(){
            return this.x + " " + this.y;
        }
        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
        @Override
        public boolean equals(Object a) {
            if (this == a) return true;
            if (a == null || getClass() != a.getClass()) return false;
            Pair pair = (Pair) a;
            if (x == null) {
                if (pair.x != null) return false;
            } else if (!x.equals(pair.x)) return false;
            if (y == null) {
                if (pair.y != null) return false;
            } else if (!y.equals(pair.y)) return false;
            return true;
    }
}

