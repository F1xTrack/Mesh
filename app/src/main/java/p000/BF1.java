package p000;

/* loaded from: classes.dex */
public final class BF1 extends GF1 {

    /* renamed from: c */
    public final transient int f689c;

    /* renamed from: d */
    public final transient int f690d;

    /* renamed from: e */
    public final /* synthetic */ GF1 f691e;

    public BF1(GF1 gf1, int i, int i2) {
        this.f691e = gf1;
        this.f689c = i;
        this.f690d = i2;
    }

    @Override // p000.AbstractC11138tF1
    /* renamed from: d */
    public final int mo571d() {
        return this.f691e.mo572h() + this.f689c + this.f690d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC9575h22.m18703b(i, this.f690d);
        return this.f691e.get(i + this.f689c);
    }

    @Override // p000.AbstractC11138tF1
    /* renamed from: h */
    public final int mo572h() {
        return this.f691e.mo572h() + this.f689c;
    }

    @Override // p000.AbstractC11138tF1
    /* renamed from: i */
    public final boolean mo573i() {
        return true;
    }

    @Override // p000.AbstractC11138tF1
    /* renamed from: k */
    public final Object[] mo574k() {
        return this.f691e.mo574k();
    }

    @Override // p000.GF1, java.util.List
    /* renamed from: q */
    public final GF1 subList(int i, int i2) {
        AbstractC9575h22.m18704c(i, i2, this.f690d);
        int i3 = this.f689c;
        return this.f691e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f690d;
    }
}
