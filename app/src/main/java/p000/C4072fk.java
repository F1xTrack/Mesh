package p000;

/* renamed from: fk */
/* loaded from: classes.dex */
public final class C4072fk implements InterfaceC8357Ub1 {

    /* renamed from: a */
    public final int f27357a;

    /* renamed from: b */
    public final C6686qX f27358b;

    /* renamed from: c */
    public final C1404WJ f27359c = new C1404WJ();

    /* renamed from: d */
    public C6686qX f27360d;

    /* renamed from: e */
    public InterfaceC8357Ub1 f27361e;

    /* renamed from: f */
    public long f27362f;

    public C4072fk(int i, int i2, C6686qX c6686qX) {
        this.f27357a = i2;
        this.f27358b = c6686qX;
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: a */
    public final void mo960a(long j, int i, int i2, int i3, C8305Tb1 c8305Tb1) {
        long j2 = this.f27362f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f27361e = this.f27359c;
        }
        InterfaceC8357Ub1 interfaceC8357Ub1 = this.f27361e;
        int i4 = AbstractC7485Dh1.f2166a;
        interfaceC8357Ub1.mo960a(j, i, i2, i3, c8305Tb1);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: b */
    public final void mo961b(C9591hA0 c9591hA0, int i, int i2) {
        InterfaceC8357Ub1 interfaceC8357Ub1 = this.f27361e;
        int i3 = AbstractC7485Dh1.f2166a;
        interfaceC8357Ub1.mo963d(i, c9591hA0);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: c */
    public final int mo962c(InterfaceC1082RC interfaceC1082RC, int i, boolean z) {
        InterfaceC8357Ub1 interfaceC8357Ub1 = this.f27361e;
        int i2 = AbstractC7485Dh1.f2166a;
        return interfaceC8357Ub1.mo964e(interfaceC1082RC, i, z);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: d */
    public final /* synthetic */ void mo963d(int i, C9591hA0 c9591hA0) {
        F91.m2531n(this, c9591hA0, i);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: e */
    public final int mo964e(InterfaceC1082RC interfaceC1082RC, int i, boolean z) {
        return mo962c(interfaceC1082RC, i, z);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: f */
    public final void mo965f(C6686qX c6686qX) {
        C6686qX c6686qX2 = this.f27358b;
        if (c6686qX2 != null) {
            c6686qX = c6686qX.m24023e(c6686qX2);
        }
        this.f27360d = c6686qX;
        InterfaceC8357Ub1 interfaceC8357Ub1 = this.f27361e;
        int i = AbstractC7485Dh1.f2166a;
        interfaceC8357Ub1.mo965f(c6686qX);
    }
}
