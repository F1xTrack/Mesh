package p000;

/* renamed from: ny1 */
/* loaded from: classes.dex */
public final class C10460ny1 extends AbstractC11356uy1 {

    /* renamed from: c */
    public final transient int f38650c;

    /* renamed from: d */
    public final transient int f38651d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC11356uy1 f38652e;

    public C10460ny1(AbstractC11356uy1 abstractC11356uy1, int i, int i2) {
        this.f38652e = abstractC11356uy1;
        this.f38650c = i;
        this.f38651d = i2;
    }

    @Override // p000.AbstractC8919by1
    /* renamed from: d */
    public final int mo10550d() {
        return this.f38652e.mo10551h() + this.f38650c + this.f38651d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        O22.m5946e(i, this.f38651d);
        return this.f38652e.get(i + this.f38650c);
    }

    @Override // p000.AbstractC8919by1
    /* renamed from: h */
    public final int mo10551h() {
        return this.f38652e.mo10551h() + this.f38650c;
    }

    @Override // p000.AbstractC8919by1
    /* renamed from: i */
    public final Object[] mo10552i() {
        return this.f38652e.mo10552i();
    }

    @Override // p000.AbstractC11356uy1, java.util.List
    /* renamed from: k */
    public final AbstractC11356uy1 subList(int i, int i2) {
        O22.m5948g(i, i2, this.f38651d);
        int i3 = this.f38650c;
        return this.f38652e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38651d;
    }
}
