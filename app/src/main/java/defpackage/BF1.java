package defpackage;

/* loaded from: classes.dex */
public final class BF1 extends GF1 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ GF1 e;

    public BF1(GF1 gf1, int i, int i2) {
        this.e = gf1;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.AbstractC7186tF1
    public final int d() {
        return this.e.h() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4079h22.b(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.AbstractC7186tF1
    public final int h() {
        return this.e.h() + this.c;
    }

    @Override // defpackage.AbstractC7186tF1
    public final boolean i() {
        return true;
    }

    @Override // defpackage.AbstractC7186tF1
    public final Object[] k() {
        return this.e.k();
    }

    @Override // defpackage.GF1, java.util.List
    /* renamed from: q */
    public final GF1 subList(int i, int i2) {
        AbstractC4079h22.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
