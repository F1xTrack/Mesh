package p000;

/* loaded from: classes.dex */
public final class X00 implements D41 {

    /* renamed from: a */
    public final S81 f13481a;

    public X00(S81 s81) {
        this.f13481a = s81;
    }

    @Override // p000.D41
    /* renamed from: a */
    public final boolean mo1537a(Exception exc) {
        return false;
    }

    @Override // p000.D41
    /* renamed from: b */
    public final boolean mo1538b(C6313ke c6313ke) {
        int i = c6313ke.f36583b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.f13481a.m7186d(c6313ke.f36582a);
        return true;
    }
}
