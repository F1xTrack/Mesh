package defpackage;

import java.util.Objects;

/* renamed from: eA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3531eA1 extends AbstractC1185Oy1 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public C3531eA1(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        G12.b(i, this.e);
        Object obj = this.c[i + i + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.AbstractC7703vy1
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
