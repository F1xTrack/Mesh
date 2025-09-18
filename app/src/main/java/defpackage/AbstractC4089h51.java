package defpackage;

/* renamed from: h51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4089h51 {
    public InterfaceC1584Ub1 b;
    public YR c;
    public InterfaceC5790lx0 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final C5408jx0 a = new C5408jx0();
    public CC0 j = new CC0(27, false);

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(C4103hA0 c4103hA0);

    public abstract boolean c(C4103hA0 c4103hA0, long j, CC0 cc0);

    public void d(boolean z) {
        if (z) {
            this.j = new CC0(27, false);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
