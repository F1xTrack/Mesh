package defpackage;

/* renamed from: Jy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796Jy1 extends AbstractC1185Oy1 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ AbstractC1185Oy1 e;

    public C0796Jy1(AbstractC1185Oy1 abstractC1185Oy1, int i, int i2) {
        this.e = abstractC1185Oy1;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.AbstractC7703vy1
    public final int d() {
        return this.e.h() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        G12.b(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.AbstractC7703vy1
    public final int h() {
        return this.e.h() + this.c;
    }

    @Override // defpackage.AbstractC7703vy1
    public final boolean k() {
        return true;
    }

    @Override // defpackage.AbstractC7703vy1
    public final Object[] q() {
        return this.e.q();
    }

    @Override // defpackage.AbstractC1185Oy1, java.util.List
    /* renamed from: r */
    public final AbstractC1185Oy1 subList(int i, int i2) {
        G12.d(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
