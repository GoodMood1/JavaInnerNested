package second;

public class Num <T extends Number>{
    private final T val;

    public Num(T _val){
        this.val = _val;
    }

    @Override
    public String toString() {
        return val.toString();
    }

    public static <M extends Number> M sum(M a, M b) {
        return (M) convert(a, (a.doubleValue() + b.doubleValue()));
    }

    public static <M extends Number> M sub(M a, M b) {
        return (M) convert(a, (a.doubleValue() - b.doubleValue()));
    }

    public static <M extends Number> M div(M a, M b) {
        return (M) convert(a, (a.doubleValue() / b.doubleValue()));
    }

    public static <M extends Number> M multi(M a, M b) {
        return (M) convert(a, (a.doubleValue() * b.doubleValue()));
    }

    public T sumVal(Num<T> a) {
        return (T) convert(this.val, (this.val.doubleValue() / a.val.doubleValue()));
    }

    public T subVal(Num<T> a) {
        return (T) convert(this.val, (this.val.doubleValue() / a.val.doubleValue()));
    }

    public  T divVal(Num<T> a) {
        return (T) convert(this.val, (this.val.doubleValue() / a.val.doubleValue()));
    }

    public T multiVal(Num<T> a) {
        return (T) convert(this.val, (this.val.doubleValue() / a.val.doubleValue()));
    }

    private static <M extends Number> M convert(M t, Double res){
        if (t instanceof Byte) {
            return (M) (Byte)res.byteValue();
        }

        if (t instanceof Short) {
            return (M) (Short)res.shortValue();
        }

        if (t instanceof Integer) {
            return (M) (Integer)res.intValue();
        }

        if (t instanceof Double) {
            return (M) (Double)res.doubleValue();
        }

        if (t instanceof Float) {
            return (M) (Float)res.floatValue();
        }

        if (t instanceof Long) {
            return (M) (Long)res.longValue();
        }
        return null;
    }
}
