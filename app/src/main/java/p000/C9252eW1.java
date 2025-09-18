package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: eW1 */
/* loaded from: classes.dex */
public final class C9252eW1 extends AbstractC10168lg1 implements ListIterator {

    /* renamed from: b */
    public final int f26736b;

    /* renamed from: c */
    public int f26737c;

    /* renamed from: d */
    public final CY1 f26738d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9252eW1(CY1 cy1, int i) {
        super(1);
        int size = cy1.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(AbstractC10087l22.m22342d(i, size, "index"));
        }
        this.f26736b = size;
        this.f26737c = i;
        this.f26738d = cy1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object m18005b(int i) {
        return this.f26738d.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f26737c < this.f26736b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26737c > 0;
    }

    @Override // p000.AbstractC10168lg1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f26737c;
        this.f26737c = i + 1;
        return m18005b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26737c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f26737c - 1;
        this.f26737c = i;
        return m18005b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26737c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
