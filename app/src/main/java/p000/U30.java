package p000;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class U30 implements U21 {

    /* renamed from: a */
    public final C0475HX f11623a;

    /* renamed from: b */
    public boolean f11624b;

    /* renamed from: c */
    public final /* synthetic */ C6250je f11625c;

    public U30(C6250je c6250je) {
        this.f11625c = c6250je;
        this.f11623a = new C0475HX(((C11917zN0) c6250je.f35300e).f46809a.mo97r());
    }

    @Override // p000.U21
    /* renamed from: H */
    public long mo96H(C6507nj c6507nj, long j) throws IOException {
        C6250je c6250je = this.f11625c;
        O90.m5968f(c6507nj, "sink");
        try {
            return ((C11917zN0) c6250je.f35300e).mo96H(c6507nj, j);
        } catch (IOException e) {
            ((FN0) c6250je.f35299d).m2616l();
            m7868m();
            throw e;
        }
    }

    /* renamed from: m */
    public final void m7868m() {
        C6250je c6250je = this.f11625c;
        int i = c6250je.f35297b;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + c6250je.f35297b);
        }
        C0475HX c0475hx = this.f11623a;
        C7523Ea1 c7523Ea1 = c0475hx.f4333e;
        c0475hx.f4333e = C7523Ea1.f2789d;
        c7523Ea1.mo2356a();
        c7523Ea1.mo2357b();
        c6250je.f35297b = 6;
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        return this.f11623a;
    }
}
