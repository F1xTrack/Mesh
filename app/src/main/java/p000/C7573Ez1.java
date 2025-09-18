package p000;

import java.util.Objects;

/* renamed from: Ez1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7573Ez1 extends AbstractC11356uy1 {

    /* renamed from: c */
    public final transient Object[] f3000c;

    /* renamed from: d */
    public final transient int f3001d;

    /* renamed from: e */
    public final transient int f3002e;

    public C7573Ez1(Object[] objArr, int i, int i2) {
        this.f3000c = objArr;
        this.f3001d = i;
        this.f3002e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        O22.m5946e(i, this.f3002e);
        Object obj = this.f3000c[i + i + this.f3001d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3002e;
    }
}
