package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: Qy1 */
/* loaded from: classes.dex */
public final class C8195Qy1 extends AbstractC10168lg1 implements ListIterator {

    /* renamed from: b */
    public final int f9875b;

    /* renamed from: c */
    public int f9876c;

    /* renamed from: d */
    public final AbstractC9438fz1 f9877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8195Qy1(AbstractC9438fz1 abstractC9438fz1, int i) {
        super(2);
        int size = abstractC9438fz1.size();
        Q22.m6558c(i, size);
        this.f9875b = size;
        this.f9876c = i;
        this.f9877d = abstractC9438fz1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object m6836b(int i) {
        return this.f9877d.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f9876c < this.f9875b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9876c > 0;
    }

    @Override // p000.AbstractC10168lg1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f9876c;
        this.f9876c = i + 1;
        return m6836b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9876c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f9876c - 1;
        this.f9876c = i;
        return m6836b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9876c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
