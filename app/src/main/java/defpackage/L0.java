package defpackage;

/* loaded from: classes.dex */
public abstract class L0 {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(EV0 ev0) {
        B00 b00 = (B00) this;
        int i = b00.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = ev0.i(this);
        b00.memoizedSerializedSize = i2;
        return i2;
    }

    public abstract void c(C6735qu c6735qu);
}
