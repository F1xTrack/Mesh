package p000;

import java.util.Objects;

/* renamed from: tz1 */
/* loaded from: classes.dex */
public final class C11230tz1 extends AbstractC9438fz1 {

    /* renamed from: e */
    public static final C11230tz1 f43437e = new C11230tz1(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f43438c;

    /* renamed from: d */
    public final transient int f43439d;

    public C11230tz1(int i, Object[] objArr) {
        this.f43438c = objArr;
        this.f43439d = i;
    }

    @Override // p000.AbstractC9438fz1, p000.AbstractC7623Fy1
    /* renamed from: b */
    public final int mo2863b(Object[] objArr) {
        Object[] objArr2 = this.f43438c;
        int i = this.f43439d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.AbstractC7623Fy1
    /* renamed from: d */
    public final int mo2864d() {
        return this.f43439d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Q22.m6557b(i, this.f43439d);
        Object obj = this.f43438c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p000.AbstractC7623Fy1
    /* renamed from: h */
    public final int mo2865h() {
        return 0;
    }

    @Override // p000.AbstractC7623Fy1
    /* renamed from: i */
    public final boolean mo2866i() {
        return false;
    }

    @Override // p000.AbstractC7623Fy1
    /* renamed from: k */
    public final Object[] mo2867k() {
        return this.f43438c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43439d;
    }
}
