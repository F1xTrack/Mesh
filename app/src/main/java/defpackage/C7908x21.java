package defpackage;

import java.util.Iterator;

/* renamed from: x21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7908x21 implements Iterator, InterfaceC7451ue0 {
    public final C6563q0 a;

    public C7908x21(Object[] objArr) {
        O90.f(objArr, "array");
        this.a = HN1.a(objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
