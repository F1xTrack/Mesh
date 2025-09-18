package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ZE1 extends KD1 {
    public static final ZE1 e = new ZE1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public ZE1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.KD1, defpackage.AbstractC7371uD1
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.AbstractC7371uD1
    public final int d() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Q12.c(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.AbstractC7371uD1
    public final int h() {
        return 0;
    }

    @Override // defpackage.AbstractC7371uD1
    public final Object[] i() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
