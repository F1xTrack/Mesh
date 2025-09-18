package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: GN */
/* loaded from: classes2.dex */
public final class C0402GN implements Iterator, InterfaceC11315ue0 {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
