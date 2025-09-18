package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: Oz1 */
/* loaded from: classes.dex */
public final class C1188Oz1 extends AbstractC1185Oy1 {
    public final /* synthetic */ C1578Tz1 c;

    public C1188Oz1(C1578Tz1 c1578Tz1) {
        this.c = c1578Tz1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C1578Tz1 c1578Tz1 = this.c;
        G12.b(i, c1578Tz1.e);
        int i2 = i + i;
        Object[] objArr = c1578Tz1.d;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.AbstractC7703vy1
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
