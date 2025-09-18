package defpackage;

import java.util.Objects;

/* renamed from: nF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6041nF1 extends KD1 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e = 1;

    public C6041nF1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Q12.c(i, this.e);
        Object obj = this.c[i + i + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
