package p000;

import java.util.Objects;

/* renamed from: iz1 */
/* loaded from: classes.dex */
public final class C9822iz1 extends AbstractC11356uy1 {

    /* renamed from: e */
    public static final C9822iz1 f34827e = new C9822iz1(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f34828c;

    /* renamed from: d */
    public final transient int f34829d;

    public C9822iz1(int i, Object[] objArr) {
        this.f34828c = objArr;
        this.f34829d = i;
    }

    @Override // p000.AbstractC11356uy1, p000.AbstractC8919by1
    /* renamed from: b */
    public final int mo10549b(Object[] objArr) {
        Object[] objArr2 = this.f34828c;
        int i = this.f34829d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.AbstractC8919by1
    /* renamed from: d */
    public final int mo10550d() {
        return this.f34829d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        O22.m5946e(i, this.f34829d);
        Object obj = this.f34828c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p000.AbstractC8919by1
    /* renamed from: h */
    public final int mo10551h() {
        return 0;
    }

    @Override // p000.AbstractC8919by1
    /* renamed from: i */
    public final Object[] mo10552i() {
        return this.f34828c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34829d;
    }
}
