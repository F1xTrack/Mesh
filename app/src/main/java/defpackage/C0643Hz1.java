package defpackage;

import java.util.Objects;

/* renamed from: Hz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643Hz1 extends AbstractC1185Oy1 {
    public static final C0643Hz1 e = new C0643Hz1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public C0643Hz1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.AbstractC1185Oy1, defpackage.AbstractC7703vy1
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC7703vy1
    public final int d() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        G12.b(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.AbstractC7703vy1
    public final int h() {
        return 0;
    }

    @Override // defpackage.AbstractC7703vy1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.AbstractC7703vy1
    public final Object[] q() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
