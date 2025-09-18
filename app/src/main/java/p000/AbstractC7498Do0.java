package p000;

/* renamed from: Do0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7498Do0 extends AbstractC1061Qr {

    /* renamed from: j */
    public final long f2255j;

    public AbstractC7498Do0(InterfaceC1586ZC interfaceC1586ZC, C3976eD c3976eD, C6686qX c6686qX, int i, Object obj, long j, long j2, long j3) {
        super(interfaceC1586ZC, c3976eD, 1, c6686qX, i, obj, j, j2);
        c6686qX.getClass();
        this.f2255j = j3;
    }

    /* renamed from: a */
    public long mo1898a() {
        long j = this.f2255j;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    /* renamed from: b */
    public abstract boolean mo1899b();
}
