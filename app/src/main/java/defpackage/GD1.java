package defpackage;

/* loaded from: classes.dex */
public final class GD1 extends KD1 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ KD1 e;

    public GD1(KD1 kd1, int i, int i2) {
        this.e = kd1;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.AbstractC7371uD1
    public final int d() {
        return this.e.h() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Q12.c(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.AbstractC7371uD1
    public final int h() {
        return this.e.h() + this.c;
    }

    @Override // defpackage.AbstractC7371uD1
    public final Object[] i() {
        return this.e.i();
    }

    @Override // defpackage.KD1, java.util.List
    /* renamed from: k */
    public final KD1 subList(int i, int i2) {
        Q12.d(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
