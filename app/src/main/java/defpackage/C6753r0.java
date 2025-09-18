package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6753r0 extends C6563q0 implements ListIterator {
    public final /* synthetic */ AbstractC7135t0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6753r0(AbstractC7135t0 abstractC7135t0, int i) {
        super(0, abstractC7135t0);
        this.d = abstractC7135t0;
        int iB = abstractC7135t0.b();
        if (i < 0 || i > iB) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", iB, ", size: "));
        }
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
