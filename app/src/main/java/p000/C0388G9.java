package p000;

/* renamed from: G9 */
/* loaded from: classes.dex */
public final class C0388G9 {

    /* renamed from: a */
    public final int f3602a;

    /* renamed from: b */
    public int f3603b;

    /* renamed from: c */
    public int f3604c;

    /* renamed from: d */
    public long f3605d;

    /* renamed from: e */
    public final boolean f3606e;

    /* renamed from: f */
    public final C9591hA0 f3607f;

    /* renamed from: g */
    public final C9591hA0 f3608g;

    /* renamed from: h */
    public int f3609h;

    /* renamed from: i */
    public int f3610i;

    public C0388G9(C9591hA0 c9591hA0, C9591hA0 c9591hA02, boolean z) throws C10103lA0 {
        this.f3608g = c9591hA0;
        this.f3607f = c9591hA02;
        this.f3606e = z;
        c9591hA02.m18741G(12);
        this.f3602a = c9591hA02.m18767y();
        c9591hA0.m18741G(12);
        this.f3610i = c9591hA0.m18767y();
        U02.m7858a("first_chunk must be 1", c9591hA0.m18749g() == 1);
        this.f3603b = -1;
    }

    /* renamed from: a */
    public final boolean m2930a() {
        int i = this.f3603b + 1;
        this.f3603b = i;
        if (i == this.f3602a) {
            return false;
        }
        boolean z = this.f3606e;
        C9591hA0 c9591hA0 = this.f3607f;
        this.f3605d = z ? c9591hA0.m18768z() : c9591hA0.m18765w();
        if (this.f3603b == this.f3609h) {
            C9591hA0 c9591hA02 = this.f3608g;
            this.f3604c = c9591hA02.m18767y();
            c9591hA02.m18742H(4);
            int i2 = this.f3610i - 1;
            this.f3610i = i2;
            this.f3609h = i2 > 0 ? c9591hA02.m18767y() - 1 : -1;
        }
        return true;
    }
}
