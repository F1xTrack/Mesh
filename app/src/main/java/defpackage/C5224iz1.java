package defpackage;

import java.util.Objects;

/* renamed from: iz1 */
/* loaded from: classes.dex */
public final class C5224iz1 extends AbstractC7512uy1 {
    public static final C5224iz1 e = new C5224iz1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public C5224iz1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.AbstractC7512uy1, defpackage.AbstractC2424by1
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC2424by1
    public final int d() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        O22.e(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.AbstractC2424by1
    public final int h() {
        return 0;
    }

    @Override // defpackage.AbstractC2424by1
    public final Object[] i() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
