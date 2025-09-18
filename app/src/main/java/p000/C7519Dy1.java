package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: Dy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7519Dy1 extends AbstractC10168lg1 implements ListIterator {

    /* renamed from: b */
    public final int f2330b;

    /* renamed from: c */
    public int f2331c;

    /* renamed from: d */
    public final AbstractC8091Oy1 f2332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7519Dy1(AbstractC8091Oy1 abstractC8091Oy1, int i) {
        super(4);
        int size = abstractC8091Oy1.size();
        G12.m2912c(i, size);
        this.f2330b = size;
        this.f2331c = i;
        this.f2332d = abstractC8091Oy1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object m1955b(int i) {
        return this.f2332d.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f2331c < this.f2330b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2331c > 0;
    }

    @Override // p000.AbstractC10168lg1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f2331c;
        this.f2331c = i + 1;
        return m1955b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2331c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f2331c - 1;
        this.f2331c = i;
        return m1955b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2331c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
