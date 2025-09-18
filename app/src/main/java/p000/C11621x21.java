package p000;

import java.util.Iterator;

/* renamed from: x21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11621x21 implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public final C6653q0 f45283a;

    public C11621x21(Object[] objArr) {
        O90.m5968f(objArr, "array");
        this.f45283a = HN1.m3386a(objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45283a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f45283a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
