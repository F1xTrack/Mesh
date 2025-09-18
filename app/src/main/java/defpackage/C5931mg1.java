package defpackage;

import java.util.ListIterator;

/* renamed from: mg1 */
/* loaded from: classes.dex */
public final class C5931mg1 implements ListIterator {
    public final /* synthetic */ int a = 3;
    public final ListIterator b;

    public C5931mg1(ZI1 zi1, int i) {
        this.b = zi1.a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
        }
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
        }
        return (String) this.b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
        }
        return this.b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
        }
        return (String) this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.a) {
        }
        return this.b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C5931mg1(C6313og1 c6313og1, int i) {
        this.b = c6313og1.a.listIterator(i);
    }

    public C5931mg1(C6504pg1 c6504pg1, int i) {
        this.b = c6504pg1.a.listIterator(i);
    }

    public C5931mg1(C6695qg1 c6695qg1, int i) {
        this.b = c6695qg1.a.listIterator(i);
    }
}
