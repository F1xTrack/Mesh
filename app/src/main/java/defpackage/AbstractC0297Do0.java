package defpackage;

/* renamed from: Do0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0297Do0 extends AbstractC1318Qr {
    public final long j;

    public AbstractC0297Do0(ZC zc, C3538eD c3538eD, C6666qX c6666qX, int i, Object obj, long j, long j2, long j3) {
        super(zc, c3538eD, 1, c6666qX, i, obj, j, j2);
        c6666qX.getClass();
        this.j = j3;
    }

    public long a() {
        long j = this.j;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean b();
}
