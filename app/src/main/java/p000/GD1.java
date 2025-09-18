package p000;

/* loaded from: classes.dex */
public final class GD1 extends KD1 {

    /* renamed from: c */
    public final transient int f3643c;

    /* renamed from: d */
    public final transient int f3644d;

    /* renamed from: e */
    public final /* synthetic */ KD1 f3645e;

    public GD1(KD1 kd1, int i, int i2) {
        this.f3645e = kd1;
        this.f3643c = i;
        this.f3644d = i2;
    }

    @Override // p000.AbstractC11262uD1
    /* renamed from: d */
    public final int mo2996d() {
        return this.f3645e.mo2997h() + this.f3643c + this.f3644d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Q12.m6549c(i, this.f3644d);
        return this.f3645e.get(i + this.f3643c);
    }

    @Override // p000.AbstractC11262uD1
    /* renamed from: h */
    public final int mo2997h() {
        return this.f3645e.mo2997h() + this.f3643c;
    }

    @Override // p000.AbstractC11262uD1
    /* renamed from: i */
    public final Object[] mo2998i() {
        return this.f3645e.mo2998i();
    }

    @Override // p000.KD1, java.util.List
    /* renamed from: k */
    public final KD1 subList(int i, int i2) {
        Q12.m6550d(i, i2, this.f3644d);
        int i3 = this.f3643c;
        return this.f3645e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3644d;
    }
}
