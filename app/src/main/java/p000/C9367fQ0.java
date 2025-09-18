package p000;

import java.util.Objects;

/* renamed from: fQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9367fQ0 extends P70 {

    /* renamed from: e */
    public static final C9367fQ0 f27184e = new C9367fQ0(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f27185c;

    /* renamed from: d */
    public final transient int f27186d;

    public C9367fQ0(int i, Object[] objArr) {
        this.f27185c = objArr;
        this.f27186d = i;
    }

    @Override // p000.P70, p000.J70
    /* renamed from: d */
    public final int mo4160d(int i, Object[] objArr) {
        Object[] objArr2 = this.f27185c;
        int i2 = this.f27186d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        QL1.m6667c(i, this.f27186d);
        Object obj = this.f27185c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p000.J70
    /* renamed from: h */
    public final Object[] mo4161h() {
        return this.f27185c;
    }

    @Override // p000.J70
    /* renamed from: i */
    public final int mo4162i() {
        return this.f27186d;
    }

    @Override // p000.J70
    /* renamed from: k */
    public final int mo4163k() {
        return 0;
    }

    @Override // p000.J70
    /* renamed from: q */
    public final boolean mo4164q() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27186d;
    }
}
