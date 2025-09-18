package p000;

/* loaded from: classes.dex */
public final class W00 implements D41 {

    /* renamed from: a */
    public final C7693Hh1 f12916a;

    /* renamed from: b */
    public final S81 f12917b;

    public W00(C7693Hh1 c7693Hh1, S81 s81) {
        this.f12916a = c7693Hh1;
        this.f12917b = s81;
    }

    @Override // p000.D41
    /* renamed from: a */
    public final boolean mo1537a(Exception exc) {
        this.f12917b.m7185c(exc);
        return true;
    }

    @Override // p000.D41
    /* renamed from: b */
    public final boolean mo1538b(C6313ke c6313ke) {
        if (c6313ke.f36583b != 4 || this.f12916a.m3550a(c6313ke)) {
            return false;
        }
        String str = c6313ke.f36584c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f12917b.m7184b(new C1172Sd(c6313ke.f36586e, c6313ke.f36587f, str));
        return true;
    }
}
