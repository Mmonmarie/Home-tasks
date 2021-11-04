import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.ArrayList;
import java.util.List;

public class Notes{
    private final ReentrantReadWriteLock current = new ReentrantReadWriteLock();
    private final Lock read = current.readLock();
    private final Lock write = current.writeLock();
    public final List<String> notes = new ArrayList<String>();
    String note;

    public void removeNotes(int id){
        write.lock();
        System.out.println("Будет удалена заметка с места " + id);
        note = notes.remove(id);
        System.out.println("Заметка " + note + "удалена с места " + id);
        write.unlock();
    }

    public void readNotes(int id){
        read.lock();
        System.out.println("Будет прочтена заметка на месте " + id);
        note = notes.get(id);
        System.out.println("Заметка" + note + "прочтена с места " + id);
        read.unlock();
    }

    public void addNotes(int id, String note){
        write.lock();
        System.out.println("Будет добавлена заметка " + note + " на место " + id);
        notes.add(id, note);
        System.out.println("Добавлена заметка " + note + " ");
        write.unlock();
    }
}
