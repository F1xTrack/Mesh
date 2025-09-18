package defpackage;

import java.util.AbstractMap;

/* renamed from: z22 */
/* loaded from: classes.dex */
public final class C8289z22 extends CY1 {
    public final /* synthetic */ C3320d32 c;

    public C8289z22(C3320d32 c3320d32) {
        this.c = c3320d32;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C3320d32 c3320d32 = this.c;
        AbstractC5619l22.b(i, c3320d32.e);
        int i2 = i + i;
        Object[] objArr = c3320d32.d;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
