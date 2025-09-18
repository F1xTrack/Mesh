package p000;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: oz1 */
/* loaded from: classes.dex */
public final class C10590oz1 extends AbstractC11356uy1 {

    /* renamed from: c */
    public final /* synthetic */ C11486vz1 f39422c;

    public C10590oz1(C11486vz1 c11486vz1) {
        this.f39422c = c11486vz1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C11486vz1 c11486vz1 = this.f39422c;
        O22.m5946e(i, c11486vz1.f44630e);
        int i2 = i + i;
        Object[] objArr = c11486vz1.f44629d;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39422c.f44630e;
    }
}
