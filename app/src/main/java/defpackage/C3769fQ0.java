package defpackage;

import java.util.Objects;

/* renamed from: fQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3769fQ0 extends P70 {
    public static final C3769fQ0 e = new C3769fQ0(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public C3769fQ0(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.P70, defpackage.J70
    public final int d(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        QL1.c(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.J70
    public final Object[] h() {
        return this.c;
    }

    @Override // defpackage.J70
    public final int i() {
        return this.d;
    }

    @Override // defpackage.J70
    public final int k() {
        return 0;
    }

    @Override // defpackage.J70
    public final boolean q() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
