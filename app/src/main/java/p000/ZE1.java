package p000;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ZE1 extends KD1 {

    /* renamed from: e */
    public static final ZE1 f14816e = new ZE1(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f14817c;

    /* renamed from: d */
    public final transient int f14818d;

    public ZE1(int i, Object[] objArr) {
        this.f14817c = objArr;
        this.f14818d = i;
    }

    @Override // p000.KD1, p000.AbstractC11262uD1
    /* renamed from: b */
    public final int mo4582b(int i, Object[] objArr) {
        Object[] objArr2 = this.f14817c;
        int i2 = this.f14818d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p000.AbstractC11262uD1
    /* renamed from: d */
    public final int mo2996d() {
        return this.f14818d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Q12.m6549c(i, this.f14818d);
        Object obj = this.f14817c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p000.AbstractC11262uD1
    /* renamed from: h */
    public final int mo2997h() {
        return 0;
    }

    @Override // p000.AbstractC11262uD1
    /* renamed from: i */
    public final Object[] mo2998i() {
        return this.f14817c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14818d;
    }
}
