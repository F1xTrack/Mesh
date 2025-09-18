package p000;

/* renamed from: L0 */
/* loaded from: classes.dex */
public abstract class AbstractC0694L0 {
    protected int memoizedHashCode;

    /* renamed from: a */
    public abstract int mo430a();

    /* renamed from: b */
    public final int m4819b(EV0 ev0) {
        B00 b00 = (B00) this;
        int i = b00.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iMo2325i = ev0.mo2325i(this);
        b00.memoizedSerializedSize = iMo2325i;
        return iMo2325i;
    }

    /* renamed from: c */
    public abstract void mo431c(C6709qu c6709qu);
}
