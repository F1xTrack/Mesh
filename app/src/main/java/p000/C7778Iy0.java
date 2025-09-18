package p000;

import java.util.RandomAccess;

/* renamed from: Iy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7778Iy0 extends AbstractC6859t0 implements RandomAccess {

    /* renamed from: a */
    public final C0551Ik[] f5235a;

    /* renamed from: b */
    public final int[] f5236b;

    public C7778Iy0(C0551Ik[] c0551IkArr, int[] iArr) {
        this.f5235a = c0551IkArr;
        this.f5236b = iArr;
    }

    @Override // p000.AbstractC6859t0
    /* renamed from: b */
    public final int mo4090b() {
        return this.f5235a.length;
    }

    @Override // p000.AbstractC6859t0, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0551Ik) {
            return super.contains((C0551Ik) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f5235a[i];
    }

    @Override // p000.AbstractC6859t0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0551Ik) {
            return super.indexOf((C0551Ik) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC6859t0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0551Ik) {
            return super.lastIndexOf((C0551Ik) obj);
        }
        return -1;
    }
}
