package defpackage;

import java.util.Objects;

/* renamed from: jQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5309jQ0 extends P70 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public C5309jQ0(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        QL1.c(i, this.e);
        Object obj = this.c[(i * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.J70
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
