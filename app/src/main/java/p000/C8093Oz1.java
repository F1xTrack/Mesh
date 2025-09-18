package p000;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: Oz1 */
/* loaded from: classes.dex */
public final class C8093Oz1 extends AbstractC8091Oy1 {

    /* renamed from: c */
    public final /* synthetic */ C8353Tz1 f8769c;

    public C8093Oz1(C8353Tz1 c8353Tz1) {
        this.f8769c = c8353Tz1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C8353Tz1 c8353Tz1 = this.f8769c;
        G12.m2911b(i, c8353Tz1.f11612e);
        int i2 = i + i;
        Object[] objArr = c8353Tz1.f11611d;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // p000.AbstractC11484vy1
    /* renamed from: k */
    public final boolean mo3660k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8769c.f11612e;
    }
}
