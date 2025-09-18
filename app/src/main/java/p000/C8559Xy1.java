package p000;

/* renamed from: Xy1 */
/* loaded from: classes.dex */
public final class C8559Xy1 extends AbstractC9438fz1 {

    /* renamed from: c */
    public final transient int f14072c;

    /* renamed from: d */
    public final transient int f14073d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC9438fz1 f14074e;

    public C8559Xy1(AbstractC9438fz1 abstractC9438fz1, int i, int i2) {
        this.f14074e = abstractC9438fz1;
        this.f14072c = i;
        this.f14073d = i2;
    }

    @Override // p000.AbstractC7623Fy1
    /* renamed from: d */
    public final int mo2864d() {
        return this.f14074e.mo2865h() + this.f14072c + this.f14073d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Q22.m6557b(i, this.f14073d);
        return this.f14074e.get(i + this.f14072c);
    }

    @Override // p000.AbstractC7623Fy1
    /* renamed from: h */
    public final int mo2865h() {
        return this.f14074e.mo2865h() + this.f14072c;
    }

    @Override // p000.AbstractC7623Fy1
    /* renamed from: i */
    public final boolean mo2866i() {
        return true;
    }

    @Override // p000.AbstractC7623Fy1
    /* renamed from: k */
    public final Object[] mo2867k() {
        return this.f14074e.mo2867k();
    }

    @Override // p000.AbstractC9438fz1, java.util.List
    /* renamed from: q */
    public final AbstractC9438fz1 subList(int i, int i2) {
        Q22.m6559d(i, i2, this.f14073d);
        int i3 = this.f14072c;
        return this.f14074e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14073d;
    }
}
