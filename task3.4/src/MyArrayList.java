import java.util.NoSuchElementException;

public class MyArrayList implements SimpleList {
    public int array[];
    public int current_size = 0;
    public int size = 10;

    public MyArrayList() {
        int array[] = new int[size];
        current_size = size;
    }

    public MyArrayList(int capacity) {
        int array[] = new int[capacity];
        current_size = capacity;
    }

    @Override
    public void add(int item) {

        int[] t = new int[current_size + 1];

        for (int i = 0; i < current_size + 1; ++i)
        {
            t[i] = this.array[i];
        }

        t[current_size] = item;
        this.array = t;
        current_size++;
    }

    @Override
    public int remove(int idx) throws NoSuchElementException {


        if (idx >= current_size || idx < 0) throw new NoSuchElementException("It is not index");
        int x = array[idx];
        int[] t = new int[current_size - 1];

        for (int i = 0; i < current_size; i++)
        {
            if (i == idx) {
                continue;
            } else if  (i > idx){
                t[i - 1] = this.array[i];
            }
            else t[i] = this.array[i];
        }

        this.array = t;
        current_size--;
        return x;
    }

    @Override
    public int size() {
        return current_size;
    }

    @Override
    public int get(int idx) throws NoSuchElementException {
        if (idx >= size || idx < 0){
            throw new NoSuchElementException("It is not index");
        }
        else {
            return this.array[idx];
        }
    }
}
