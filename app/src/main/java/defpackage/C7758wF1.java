package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: wF1 */
/* loaded from: classes.dex */
public final class C7758wF1 extends AbstractC5740lg1 implements ListIterator {
    public final int b;
    public int c;
    public final GF1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7758wF1(GF1 gf1, int i) {
        super(7);
        int size = gf1.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(AbstractC4079h22.d(i, size, "index"));
        }
        this.b = size;
        this.c = i;
        this.d = gf1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object b(int i) {
        return this.d.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c > 0;
    }

    @Override // defpackage.AbstractC5740lg1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.c;
        this.c = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.c - 1;
        this.c = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
