package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class N70 extends AbstractC10168lg1 implements ListIterator {

    /* renamed from: b */
    public final int f7508b;

    /* renamed from: c */
    public int f7509c;

    /* renamed from: d */
    public final P70 f7510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N70(P70 p70, int i) {
        super(0);
        int size = p70.size();
        QL1.m6669e(i, size);
        this.f7508b = size;
        this.f7509c = i;
        this.f7510d = p70;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object m5547b(int i) {
        return this.f7510d.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7509c < this.f7508b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7509c > 0;
    }

    @Override // p000.AbstractC10168lg1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f7509c;
        this.f7509c = i + 1;
        return m5547b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7509c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f7509c - 1;
        this.f7509c = i;
        return m5547b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7509c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
