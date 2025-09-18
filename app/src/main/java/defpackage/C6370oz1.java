package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: oz1 */
/* loaded from: classes.dex */
public final class C6370oz1 extends AbstractC7512uy1 {
    public final /* synthetic */ C7706vz1 c;

    public C6370oz1(C7706vz1 c7706vz1) {
        this.c = c7706vz1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C7706vz1 c7706vz1 = this.c;
        O22.e(i, c7706vz1.e);
        int i2 = i + i;
        Object[] objArr = c7706vz1.d;
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
