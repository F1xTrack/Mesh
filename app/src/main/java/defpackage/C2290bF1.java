package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: bF1 */
/* loaded from: classes.dex */
public final class C2290bF1 extends KD1 {
    public final /* synthetic */ C3737fF1 c;

    public C2290bF1(C3737fF1 c3737fF1) {
        this.c = c3737fF1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C3737fF1 c3737fF1 = this.c;
        Q12.c(i, c3737fF1.e);
        int i2 = i + i;
        Object[] objArr = c3737fF1.d;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
