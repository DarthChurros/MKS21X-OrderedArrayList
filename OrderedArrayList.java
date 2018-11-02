import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T val) {
    if (val == null) {
      throw new IllegalArgumentException("Failed to add null to OrderedArrayList");
    }
    for (int i = 0; i < size(); i++) {
      if (val.compareTo(get(i)) <= 0) {
        super.add(i, val);
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
    if (val == null) {
      throw new IllegalArgumentException("Failed to add null to OrderedArrayList");
    }
    T del = remove(index);
    add(val);
    return del;
  }
}
