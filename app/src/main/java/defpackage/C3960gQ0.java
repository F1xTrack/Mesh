package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: gQ0 */
/* loaded from: classes.dex */
public final class C3960gQ0 extends P70 {
    public final /* synthetic */ C4151hQ0 c;

    public C3960gQ0(C4151hQ0 c4151hQ0) {
        this.c = c4151hQ0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C4151hQ0 c4151hQ0 = this.c;
        QL1.c(i, c4151hQ0.f);
        int i2 = i * 2;
        Object[] objArr = c4151hQ0.e;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.J70
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
