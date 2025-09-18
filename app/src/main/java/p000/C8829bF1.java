package p000;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: bF1 */
/* loaded from: classes.dex */
public final class C8829bF1 extends KD1 {

    /* renamed from: c */
    public final /* synthetic */ C9346fF1 f16907c;

    public C8829bF1(C9346fF1 c9346fF1) {
        this.f16907c = c9346fF1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C9346fF1 c9346fF1 = this.f16907c;
        Q12.m6549c(i, c9346fF1.f27123e);
        int i2 = i + i;
        Object[] objArr = c9346fF1.f27122d;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16907c.f27123e;
    }
}
