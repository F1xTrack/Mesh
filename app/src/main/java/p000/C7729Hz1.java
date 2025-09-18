package p000;

import java.util.Objects;

/* renamed from: Hz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7729Hz1 extends AbstractC8091Oy1 {

    /* renamed from: e */
    public static final C7729Hz1 f4623e = new C7729Hz1(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f4624c;

    /* renamed from: d */
    public final transient int f4625d;

    public C7729Hz1(int i, Object[] objArr) {
        this.f4624c = objArr;
        this.f4625d = i;
    }

    @Override // p000.AbstractC8091Oy1, p000.AbstractC11484vy1
    /* renamed from: b */
    public final int mo3657b(Object[] objArr) {
        Object[] objArr2 = this.f4624c;
        int i = this.f4625d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: d */
    public final int mo3658d() {
        return this.f4625d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        G12.m2911b(i, this.f4625d);
        Object obj = this.f4624c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: h */
    public final int mo3659h() {
        return 0;
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: k */
    public final boolean mo3660k() {
        return false;
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: q */
    public final Object[] mo3661q() {
        return this.f4624c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4625d;
    }
}
