package p000;

/* renamed from: Jy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7831Jy1 extends AbstractC8091Oy1 {

    /* renamed from: c */
    public final transient int f5820c;

    /* renamed from: d */
    public final transient int f5821d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC8091Oy1 f5822e;

    public C7831Jy1(AbstractC8091Oy1 abstractC8091Oy1, int i, int i2) {
        this.f5822e = abstractC8091Oy1;
        this.f5820c = i;
        this.f5821d = i2;
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: d */
    public final int mo3658d() {
        return this.f5822e.mo3659h() + this.f5820c + this.f5821d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        G12.m2911b(i, this.f5821d);
        return this.f5822e.get(i + this.f5820c);
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: h */
    public final int mo3659h() {
        return this.f5822e.mo3659h() + this.f5820c;
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: k */
    public final boolean mo3660k() {
        return true;
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: q */
    public final Object[] mo3661q() {
        return this.f5822e.mo3661q();
    }

    @Override // p000.AbstractC8091Oy1, java.util.List
    /* renamed from: r */
    public final AbstractC8091Oy1 subList(int i, int i2) {
        G12.m2913d(i, i2, this.f5821d);
        int i3 = this.f5820c;
        return this.f5822e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5821d;
    }
}
