package defpackage;

/* renamed from: gX1 */
/* loaded from: classes.dex */
public final class C3982gX1 extends CY1 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ CY1 e;

    public C3982gX1(CY1 cy1, int i, int i2) {
        this.e = cy1;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.AbstractC7228tT1
    public final int d() {
        return this.e.h() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC5619l22.b(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.AbstractC7228tT1
    public final int h() {
        return this.e.h() + this.c;
    }

    @Override // defpackage.AbstractC7228tT1
    public final Object[] i() {
        return this.e.i();
    }

    @Override // defpackage.CY1, java.util.List
    /* renamed from: k */
    public final CY1 subList(int i, int i2) {
        AbstractC5619l22.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
