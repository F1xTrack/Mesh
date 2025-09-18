package defpackage;

import java.util.RandomAccess;

/* renamed from: Iy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0717Iy0 extends AbstractC7135t0 implements RandomAccess {
    public final C0674Ik[] a;
    public final int[] b;

    public C0717Iy0(C0674Ik[] c0674IkArr, int[] iArr) {
        this.a = c0674IkArr;
        this.b = iArr;
    }

    @Override // defpackage.AbstractC7135t0
    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.AbstractC7135t0, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0674Ik) {
            return super.contains((C0674Ik) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.AbstractC7135t0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0674Ik) {
            return super.indexOf((C0674Ik) obj);
        }
        return -1;
    }

    @Override // defpackage.AbstractC7135t0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0674Ik) {
            return super.lastIndexOf((C0674Ik) obj);
        }
        return -1;
    }
}
