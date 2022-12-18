public class generalized<T extends Comparable,N extends Animal & Serializable,K> {
    private T q;
    private N w;
    private K e;

    public generalized(T q, N w, K e) {
        this.q = q;
        this.w = w;
        this.e = e;
    }

    @Override
    public String toString() {
        return "generalized{" +
                "q=" + q +" "+q.getClass()+
                ", w=" + w+" "+w.getClass() +
                ", e=" + e+" "+e.getClass() +
                '}';
    }
}