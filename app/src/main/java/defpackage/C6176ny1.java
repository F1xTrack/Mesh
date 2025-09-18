package defpackage;

/* renamed from: ny1 */
/* loaded from: classes.dex */
public final class C6176ny1 extends AbstractC7512uy1 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ AbstractC7512uy1 e;

    public C6176ny1(AbstractC7512uy1 abstractC7512uy1, int i, int i2) {
        this.e = abstractC7512uy1;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.AbstractC2424by1
    public final int d() {
        return this.e.h() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        O22.e(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.AbstractC2424by1
    public final int h() {
        return this.e.h() + this.c;
    }

    @Override // defpackage.AbstractC2424by1
    public final Object[] i() {
        return this.e.i();
    }

    @Override // defpackage.AbstractC7512uy1, java.util.List
    /* renamed from: k */
    public final AbstractC7512uy1 subList(int i, int i2) {
        O22.g(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
