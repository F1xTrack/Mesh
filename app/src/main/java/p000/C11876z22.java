package p000;

import java.util.AbstractMap;

/* renamed from: z22 */
/* loaded from: classes.dex */
public final class C11876z22 extends CY1 {

    /* renamed from: c */
    public final /* synthetic */ C9066d32 f46603c;

    public C11876z22(C9066d32 c9066d32) {
        this.f46603c = c9066d32;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C9066d32 c9066d32 = this.f46603c;
        AbstractC10087l22.m22340b(i, c9066d32.f25789e);
        int i2 = i + i;
        Object[] objArr = c9066d32.f25788d;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46603c.f25789e;
    }
}
