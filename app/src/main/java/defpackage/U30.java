package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class U30 implements U21 {
    public final HX a;
    public boolean b;
    public final /* synthetic */ C5350je c;

    public U30(C5350je c5350je) {
        this.c = c5350je;
        this.a = new HX(((C8351zN0) c5350je.e).a.r());
    }

    @Override // defpackage.U21
    public long H(C6129nj c6129nj, long j) throws IOException {
        C5350je c5350je = this.c;
        O90.f(c6129nj, "sink");
        try {
            return ((C8351zN0) c5350je.e).H(c6129nj, j);
        } catch (IOException e) {
            ((FN0) c5350je.d).l();
            m();
            throw e;
        }
    }

    public final void m() {
        C5350je c5350je = this.c;
        int i = c5350je.b;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + c5350je.b);
        }
        HX hx = this.a;
        C0334Ea1 c0334Ea1 = hx.e;
        hx.e = C0334Ea1.d;
        c0334Ea1.a();
        c0334Ea1.b();
        c5350je.b = 6;
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        return this.a;
    }
}
