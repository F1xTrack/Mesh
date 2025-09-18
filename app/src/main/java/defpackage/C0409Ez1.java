package defpackage;

import java.util.Objects;

/* renamed from: Ez1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409Ez1 extends AbstractC7512uy1 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public C0409Ez1(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        O22.e(i, this.e);
        Object obj = this.c[i + i + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
