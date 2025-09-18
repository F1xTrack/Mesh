package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: iy1 */
/* loaded from: classes.dex */
public final class C9820iy1 extends AbstractC10168lg1 implements ListIterator {

    /* renamed from: b */
    public final int f34824b;

    /* renamed from: c */
    public int f34825c;

    /* renamed from: d */
    public final AbstractC11356uy1 f34826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9820iy1(AbstractC11356uy1 abstractC11356uy1, int i) {
        super(3);
        int size = abstractC11356uy1.size();
        O22.m5947f(i, size);
        this.f34824b = size;
        this.f34825c = i;
        this.f34826d = abstractC11356uy1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object m21950b(int i) {
        return this.f34826d.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f34825c < this.f34824b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f34825c > 0;
    }

    @Override // p000.AbstractC10168lg1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f34825c;
        this.f34825c = i + 1;
        return m21950b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f34825c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f34825c - 1;
        this.f34825c = i;
        return m21950b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f34825c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
