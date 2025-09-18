package defpackage;

/* renamed from: pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6502pg extends AbstractC0297Do0 {
    public final long k;
    public final long l;
    public VH m;
    public int[] n;

    public AbstractC6502pg(ZC zc, C3538eD c3538eD, C6666qX c6666qX, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(zc, c3538eD, c6666qX, i, obj, j, j2, j5);
        this.k = j3;
        this.l = j4;
    }

    public final int c(int i) {
        int[] iArr = this.n;
        YN1.h(iArr);
        return iArr[i];
    }
}
