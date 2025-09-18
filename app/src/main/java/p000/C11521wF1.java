package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: wF1 */
/* loaded from: classes.dex */
public final class C11521wF1 extends AbstractC10168lg1 implements ListIterator {

    /* renamed from: b */
    public final int f44736b;

    /* renamed from: c */
    public int f44737c;

    /* renamed from: d */
    public final GF1 f44738d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11521wF1(GF1 gf1, int i) {
        super(7);
        int size = gf1.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(AbstractC9575h22.m18705d(i, size, "index"));
        }
        this.f44736b = size;
        this.f44737c = i;
        this.f44738d = gf1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object m25581b(int i) {
        return this.f44738d.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f44737c < this.f44736b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f44737c > 0;
    }

    @Override // p000.AbstractC10168lg1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f44737c;
        this.f44737c = i + 1;
        return m25581b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f44737c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f44737c - 1;
        this.f44737c = i;
        return m25581b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f44737c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
