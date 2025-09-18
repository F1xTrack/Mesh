package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: nj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6130nj0 implements ListIterator, InterfaceC7451ue0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public final O0 e;

    public C6130nj0(C6512pj0 c6512pj0, int i) {
        O90.f(c6512pj0, "list");
        this.e = c6512pj0;
        this.b = i;
        this.c = -1;
        this.d = ((AbstractList) c6512pj0).modCount;
    }

    public void a() {
        if (((AbstractList) ((C6321oj0) this.e).e).modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                this.b = i + 1;
                C6321oj0 c6321oj0 = (C6321oj0) this.e;
                c6321oj0.add(i, obj);
                this.c = -1;
                this.d = ((AbstractList) c6321oj0).modCount;
                break;
            default:
                b();
                int i2 = this.b;
                this.b = i2 + 1;
                C6512pj0 c6512pj0 = (C6512pj0) this.e;
                c6512pj0.add(i2, obj);
                this.c = -1;
                this.d = ((AbstractList) c6512pj0).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((C6512pj0) this.e)).modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((C6321oj0) this.e).c) {
                }
                break;
            default:
                if (this.b < ((C6512pj0) this.e).b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                if (this.b > 0) {
                }
                break;
            default:
                if (this.b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                C6321oj0 c6321oj0 = (C6321oj0) this.e;
                if (i >= c6321oj0.c) {
                    throw new NoSuchElementException();
                }
                this.b = i + 1;
                this.c = i;
                return c6321oj0.a[c6321oj0.b + i];
            default:
                b();
                int i2 = this.b;
                C6512pj0 c6512pj0 = (C6512pj0) this.e;
                if (i2 >= c6512pj0.b) {
                    throw new NoSuchElementException();
                }
                this.b = i2 + 1;
                this.c = i2;
                return c6512pj0.a[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.b = i2;
                this.c = i2;
                C6321oj0 c6321oj0 = (C6321oj0) this.e;
                return c6321oj0.a[c6321oj0.b + i2];
            default:
                b();
                int i3 = this.b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.b = i4;
                this.c = i4;
                return ((C6512pj0) this.e).a[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.a) {
        }
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                a();
                int i = this.c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C6321oj0 c6321oj0 = (C6321oj0) this.e;
                c6321oj0.d(i);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) c6321oj0).modCount;
                return;
            default:
                b();
                int i2 = this.c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C6512pj0 c6512pj0 = (C6512pj0) this.e;
                c6512pj0.d(i2);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) c6512pj0).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                a();
                int i = this.c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C6321oj0) this.e).set(i, obj);
                return;
            default:
                b();
                int i2 = this.c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C6512pj0) this.e).set(i2, obj);
                return;
        }
    }

    public C6130nj0(C6321oj0 c6321oj0, int i) {
        O90.f(c6321oj0, "list");
        this.e = c6321oj0;
        this.b = i;
        this.c = -1;
        this.d = ((AbstractList) c6321oj0).modCount;
    }
}
