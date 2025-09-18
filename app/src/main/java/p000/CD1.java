package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CD1 extends AbstractC10168lg1 implements ListIterator {

    /* renamed from: b */
    public final int f1255b;

    /* renamed from: c */
    public int f1256c;

    /* renamed from: d */
    public final KD1 f1257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CD1(KD1 kd1, int i) {
        super(6);
        int size = kd1.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(Q12.m6552f(i, size, "index"));
        }
        this.f1255b = size;
        this.f1256c = i;
        this.f1257d = kd1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object m1119b(int i) {
        return this.f1257d.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f1256c < this.f1255b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1256c > 0;
    }

    @Override // p000.AbstractC10168lg1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f1256c;
        this.f1256c = i + 1;
        return m1119b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1256c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f1256c - 1;
        this.f1256c = i;
        return m1119b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1256c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
