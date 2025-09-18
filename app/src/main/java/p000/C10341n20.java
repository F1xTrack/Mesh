package p000;

/* renamed from: n20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10341n20 {

    /* renamed from: a */
    public final InterfaceC8357Ub1 f38048a;

    /* renamed from: b */
    public boolean f38049b;

    /* renamed from: c */
    public boolean f38050c;

    /* renamed from: d */
    public boolean f38051d;

    /* renamed from: e */
    public int f38052e;

    /* renamed from: f */
    public int f38053f;

    /* renamed from: g */
    public long f38054g;

    /* renamed from: h */
    public long f38055h;

    public C10341n20(InterfaceC8357Ub1 interfaceC8357Ub1) {
        this.f38048a = interfaceC8357Ub1;
    }

    /* renamed from: a */
    public final void m23059a(byte[] bArr, int i, int i2) {
        if (this.f38050c) {
            int i3 = this.f38053f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f38053f = (i2 - i) + i3;
            } else {
                this.f38051d = ((bArr[i4] & 192) >> 6) == 0;
                this.f38050c = false;
            }
        }
    }

    /* renamed from: b */
    public final void m23060b(int i, long j, boolean z) {
        YN1.m9281f(this.f38055h != -9223372036854775807L);
        if (this.f38052e == 182 && z && this.f38049b) {
            this.f38048a.mo960a(this.f38055h, this.f38051d ? 1 : 0, (int) (j - this.f38054g), i, null);
        }
        if (this.f38052e != 179) {
            this.f38054g = j;
        }
    }
}
