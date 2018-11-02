import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T val) {
    for (int i = 0; i < size(); i++) {
      if (val.compareTo(get(i)) >= 0) {
        super.add(val);
        return true;
      }
    }
    super.add(val);
    return true;
  }

  public void add(int index, T val) {
    add(val);
  }

  public T set(int index, T val) {
    T del = remove(index);
    add(val);
    return del;
  }
}
