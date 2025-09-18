package p000;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: gQ0 */
/* loaded from: classes.dex */
public final class C9495gQ0 extends P70 {

    /* renamed from: c */
    public final /* synthetic */ C9623hQ0 f27784c;

    public C9495gQ0(C9623hQ0 c9623hQ0) {
        this.f27784c = c9623hQ0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C9623hQ0 c9623hQ0 = this.f27784c;
        QL1.m6667c(i, c9623hQ0.f28418f);
        int i2 = i * 2;
        Object[] objArr = c9623hQ0.f28417e;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // p000.J70
    /* renamed from: q */
    public final boolean mo4164q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27784c.f28418f;
    }
}
