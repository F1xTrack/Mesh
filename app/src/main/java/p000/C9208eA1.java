package p000;

import java.util.Objects;

/* renamed from: eA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9208eA1 extends AbstractC8091Oy1 {

    /* renamed from: c */
    public final transient Object[] f26580c;

    /* renamed from: d */
    public final transient int f26581d;

    /* renamed from: e */
    public final transient int f26582e;

    public C9208eA1(Object[] objArr, int i, int i2) {
        this.f26580c = objArr;
        this.f26581d = i;
        this.f26582e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        G12.m2911b(i, this.f26582e);
        Object obj = this.f26580c[i + i + this.f26581d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: k */
    public final boolean mo3660k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26582e;
    }
}
