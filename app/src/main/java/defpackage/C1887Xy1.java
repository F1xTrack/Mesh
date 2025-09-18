package defpackage;

/* renamed from: Xy1 */
/* loaded from: classes.dex */
public final class C1887Xy1 extends AbstractC3875fz1 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ AbstractC3875fz1 e;

    public C1887Xy1(AbstractC3875fz1 abstractC3875fz1, int i, int i2) {
        this.e = abstractC3875fz1;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.AbstractC0484Fy1
    public final int d() {
        return this.e.h() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Q22.b(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.AbstractC0484Fy1
    public final int h() {
        return this.e.h() + this.c;
    }

    @Override // defpackage.AbstractC0484Fy1
    public final boolean i() {
        return true;
    }

    @Override // defpackage.AbstractC0484Fy1
    public final Object[] k() {
        return this.e.k();
    }

    @Override // defpackage.AbstractC3875fz1, java.util.List
    /* renamed from: q */
    public final AbstractC3875fz1 subList(int i, int i2) {
        Q22.d(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
