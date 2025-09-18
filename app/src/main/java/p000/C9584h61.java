package p000;

import java.io.EOFException;

/* renamed from: h61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9584h61 implements InterfaceC8357Ub1 {

    /* renamed from: a */
    public final InterfaceC8357Ub1 f28260a;

    /* renamed from: b */
    public final InterfaceC8939c61 f28261b;

    /* renamed from: g */
    public InterfaceC9200e61 f28266g;

    /* renamed from: h */
    public C6686qX f28267h;

    /* renamed from: d */
    public int f28263d = 0;

    /* renamed from: e */
    public int f28264e = 0;

    /* renamed from: f */
    public byte[] f28265f = AbstractC7485Dh1.f2171f;

    /* renamed from: c */
    public final C9591hA0 f28262c = new C9591hA0();

    public C9584h61(InterfaceC8357Ub1 interfaceC8357Ub1, InterfaceC8939c61 interfaceC8939c61) {
        this.f28260a = interfaceC8357Ub1;
        this.f28261b = interfaceC8939c61;
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: a */
    public final void mo960a(long j, int i, int i2, int i3, C8305Tb1 c8305Tb1) {
        if (this.f28266g == null) {
            this.f28260a.mo960a(j, i, i2, i3, c8305Tb1);
            return;
        }
        YN1.m9277b("DRM on subtitles is not supported", c8305Tb1 == null);
        int i4 = (this.f28264e - i3) - i2;
        this.f28266g.mo4562m(this.f28265f, i4, i2, C9072d61.f25815c, new C6476nE(this, j, i));
        int i5 = i4 + i2;
        this.f28263d = i5;
        if (i5 == this.f28264e) {
            this.f28263d = 0;
            this.f28264e = 0;
        }
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: b */
    public final void mo961b(C9591hA0 c9591hA0, int i, int i2) {
        if (this.f28266g == null) {
            this.f28260a.mo961b(c9591hA0, i, i2);
            return;
        }
        m18723g(i);
        c9591hA0.m18747e(this.f28265f, this.f28264e, i);
        this.f28264e += i;
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: c */
    public final int mo962c(InterfaceC1082RC interfaceC1082RC, int i, boolean z) throws EOFException {
        if (this.f28266g == null) {
            return this.f28260a.mo962c(interfaceC1082RC, i, z);
        }
        m18723g(i);
        int iMo2367r = interfaceC1082RC.mo2367r(this.f28265f, this.f28264e, i);
        if (iMo2367r != -1) {
            this.f28264e += iMo2367r;
            return iMo2367r;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
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
        c6686qX.f40974m.getClass();
        String str = c6686qX.f40974m;
        YN1.m9278c(AbstractC8544Xr0.m9165h(str) == 3);
        boolean zEquals = c6686qX.equals(this.f28267h);
        InterfaceC8939c61 interfaceC8939c61 = this.f28261b;
        if (!zEquals) {
            this.f28267h = c6686qX;
            this.f28266g = interfaceC8939c61.mo911b(c6686qX) ? interfaceC8939c61.mo916f(c6686qX) : null;
        }
        InterfaceC9200e61 interfaceC9200e61 = this.f28266g;
        InterfaceC8357Ub1 interfaceC8357Ub1 = this.f28260a;
        if (interfaceC9200e61 == null) {
            interfaceC8357Ub1.mo965f(c6686qX);
            return;
        }
        C6623pX c6623pXM24020a = c6686qX.m24020a();
        c6623pXM24020a.f40161l = AbstractC8544Xr0.m9171n("application/x-media3-cues");
        c6623pXM24020a.f40158i = str;
        c6623pXM24020a.f40166q = Long.MAX_VALUE;
        c6623pXM24020a.f40146F = interfaceC8939c61.mo917h(c6686qX);
        F91.m2512B(c6623pXM24020a, interfaceC8357Ub1);
    }

    /* renamed from: g */
    public final void m18723g(int i) {
        int length = this.f28265f.length;
        int i2 = this.f28264e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f28263d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f28265f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f28263d, bArr2, 0, i3);
        this.f28263d = 0;
        this.f28264e = i3;
        this.f28265f = bArr2;
    }
}
