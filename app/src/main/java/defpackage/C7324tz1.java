package defpackage;

import java.util.Objects;

/* renamed from: tz1 */
/* loaded from: classes.dex */
public final class C7324tz1 extends AbstractC3875fz1 {
    public static final C7324tz1 e = new C7324tz1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public C7324tz1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.AbstractC3875fz1, defpackage.AbstractC0484Fy1
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC0484Fy1
    public final int d() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Q22.b(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.AbstractC0484Fy1
    public final int h() {
        return 0;
    }

    @Override // defpackage.AbstractC0484Fy1
    public final boolean i() {
        return false;
    }

    @Override // defpackage.AbstractC0484Fy1
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
