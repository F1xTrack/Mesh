package p000;

/* renamed from: gX1 */
/* loaded from: classes.dex */
public final class C9510gX1 extends CY1 {

    /* renamed from: c */
    public final transient int f27828c;

    /* renamed from: d */
    public final transient int f27829d;

    /* renamed from: e */
    public final /* synthetic */ CY1 f27830e;

    public C9510gX1(CY1 cy1, int i, int i2) {
        this.f27830e = cy1;
        this.f27828c = i;
        this.f27829d = i2;
    }

    @Override // p000.AbstractC11166tT1
    /* renamed from: d */
    public final int mo9665d() {
        return this.f27830e.mo9666h() + this.f27828c + this.f27829d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC10087l22.m22340b(i, this.f27829d);
        return this.f27830e.get(i + this.f27828c);
    }

    @Override // p000.AbstractC11166tT1
    /* renamed from: h */
    public final int mo9666h() {
        return this.f27830e.mo9666h() + this.f27828c;
    }

    @Override // p000.AbstractC11166tT1
    /* renamed from: i */
    public final Object[] mo9667i() {
        return this.f27830e.mo9667i();
    }

    @Override // p000.CY1, java.util.List
    /* renamed from: k */
    public final CY1 subList(int i, int i2) {
        AbstractC10087l22.m22341c(i, i2, this.f27829d);
        int i3 = this.f27828c;
        return this.f27830e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27829d;
    }
}
