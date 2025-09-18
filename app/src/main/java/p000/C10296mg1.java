package p000;

import java.util.ListIterator;

/* renamed from: mg1 */
/* loaded from: classes.dex */
public final class C10296mg1 implements ListIterator {

    /* renamed from: a */
    public final /* synthetic */ int f37826a = 3;

    /* renamed from: b */
    public final ListIterator f37827b;

    public C10296mg1(ZI1 zi1, int i) {
        this.f37827b = zi1.f14850a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f37826a) {
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
        switch (this.f37826a) {
        }
        return this.f37827b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f37826a) {
        }
        return this.f37827b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f37826a) {
        }
        return (String) this.f37827b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f37826a) {
        }
        return this.f37827b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f37826a) {
        }
        return (String) this.f37827b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f37826a) {
        }
        return this.f37827b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f37826a) {
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
        switch (this.f37826a) {
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

    public C10296mg1(C10552og1 c10552og1, int i) {
        this.f37827b = c10552og1.f39174a.listIterator(i);
    }

    public C10296mg1(C10680pg1 c10680pg1, int i) {
        this.f37827b = c10680pg1.f40276a.listIterator(i);
    }

    public C10296mg1(C10808qg1 c10808qg1, int i) {
        this.f37827b = c10808qg1.f41103a.listIterator(i);
    }
}
