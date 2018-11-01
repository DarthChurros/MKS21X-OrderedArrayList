import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public void add(int index, T val) {
    if (val == null) {
      throw new IllegalArgumentException("Failed to add null to NoNullArrayList");
    }
    super.add(index, val);
  }

  public boolean add(T val) {
    if (val == null) {
      throw new IllegalArgumentException("Failed to add null to NoNullArrayList");
    }
    return super.add(val);
  }

  public T set(int index, T val) {
    if (val == null) {
      throw new IllegalArgumentException("Failed to add null to NoNullArrayList");
    }
    return super.set(index, val);
  }
}
