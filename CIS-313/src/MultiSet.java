public interface MultiSet<AnyType> {
    public void add(AnyType x);
    public boolean contains(AnyType x);
    public int count(AnyType x);
    public boolean removeOne(AnyType x);
    public boolean removeAll(AnyType x);
    public void toArray(AnyType[] x);

}
