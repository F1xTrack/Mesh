package p000;

import java.util.Objects;

/* renamed from: jQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9879jQ0 extends P70 {

    /* renamed from: c */
    public final transient Object[] f35147c;

    /* renamed from: d */
    public final transient int f35148d;

    /* renamed from: e */
    public final transient int f35149e;

    public C9879jQ0(Object[] objArr, int i, int i2) {
        this.f35147c = objArr;
        this.f35148d = i;
        this.f35149e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        QL1.m6667c(i, this.f35149e);
        Object obj = this.f35147c[(i * 2) + this.f35148d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p000.J70
    /* renamed from: q */
    public final boolean mo4164q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35149e;
    }
}
