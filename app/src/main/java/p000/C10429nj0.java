package p000;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: nj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10429nj0 implements ListIterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public final /* synthetic */ int f38489a = 0;

    /* renamed from: b */
    public int f38490b;

    /* renamed from: c */
    public int f38491c;

    /* renamed from: d */
    public int f38492d;

    /* renamed from: e */
    public final AbstractC0882O0 f38493e;

    public C10429nj0(C10685pj0 c10685pj0, int i) {
        O90.m5968f(c10685pj0, "list");
        this.f38493e = c10685pj0;
        this.f38490b = i;
        this.f38491c = -1;
        this.f38492d = ((AbstractList) c10685pj0).modCount;
    }

    /* renamed from: a */
    public void m23205a() {
        if (((AbstractList) ((C10557oj0) this.f38493e).f39203e).modCount != this.f38492d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f38489a) {
            case 0:
                m23205a();
                int i = this.f38490b;
                this.f38490b = i + 1;
                C10557oj0 c10557oj0 = (C10557oj0) this.f38493e;
                c10557oj0.add(i, obj);
                this.f38491c = -1;
                this.f38492d = ((AbstractList) c10557oj0).modCount;
                break;
            default:
                m23206b();
                int i2 = this.f38490b;
                this.f38490b = i2 + 1;
                C10685pj0 c10685pj0 = (C10685pj0) this.f38493e;
                c10685pj0.add(i2, obj);
                this.f38491c = -1;
                this.f38492d = ((AbstractList) c10685pj0).modCount;
                break;
        }
    }

    /* renamed from: b */
    public void m23206b() {
        if (((AbstractList) ((C10685pj0) this.f38493e)).modCount != this.f38492d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f38489a) {
            case 0:
                if (this.f38490b < ((C10557oj0) this.f38493e).f39201c) {
                }
                break;
            default:
                if (this.f38490b < ((C10685pj0) this.f38493e).f40352b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f38489a) {
            case 0:
                if (this.f38490b > 0) {
                }
                break;
            default:
                if (this.f38490b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f38489a) {
            case 0:
                m23205a();
                int i = this.f38490b;
                C10557oj0 c10557oj0 = (C10557oj0) this.f38493e;
                if (i >= c10557oj0.f39201c) {
                    throw new NoSuchElementException();
                }
                this.f38490b = i + 1;
                this.f38491c = i;
                return c10557oj0.f39199a[c10557oj0.f39200b + i];
            default:
                m23206b();
                int i2 = this.f38490b;
                C10685pj0 c10685pj0 = (C10685pj0) this.f38493e;
                if (i2 >= c10685pj0.f40352b) {
                    throw new NoSuchElementException();
                }
                this.f38490b = i2 + 1;
                this.f38491c = i2;
                return c10685pj0.f40351a[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f38489a) {
        }
        return this.f38490b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f38489a) {
            case 0:
                m23205a();
                int i = this.f38490b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f38490b = i2;
                this.f38491c = i2;
                C10557oj0 c10557oj0 = (C10557oj0) this.f38493e;
                return c10557oj0.f39199a[c10557oj0.f39200b + i2];
            default:
                m23206b();
                int i3 = this.f38490b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f38490b = i4;
                this.f38491c = i4;
                return ((C10685pj0) this.f38493e).f40351a[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f38489a) {
        }
        return this.f38490b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f38489a) {
            case 0:
                m23205a();
                int i = this.f38491c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C10557oj0 c10557oj0 = (C10557oj0) this.f38493e;
                c10557oj0.mo5923d(i);
                this.f38490b = this.f38491c;
                this.f38491c = -1;
                this.f38492d = ((AbstractList) c10557oj0).modCount;
                return;
            default:
                m23206b();
                int i2 = this.f38491c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C10685pj0 c10685pj0 = (C10685pj0) this.f38493e;
                c10685pj0.mo5923d(i2);
                this.f38490b = this.f38491c;
                this.f38491c = -1;
                this.f38492d = ((AbstractList) c10685pj0).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f38489a) {
            case 0:
                m23205a();
                int i = this.f38491c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C10557oj0) this.f38493e).set(i, obj);
                return;
            default:
                m23206b();
                int i2 = this.f38491c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C10685pj0) this.f38493e).set(i2, obj);
                return;
        }
    }

    public C10429nj0(C10557oj0 c10557oj0, int i) {
        O90.m5968f(c10557oj0, "list");
        this.f38493e = c10557oj0;
        this.f38490b = i;
        this.f38491c = -1;
        this.f38492d = ((AbstractList) c10557oj0).modCount;
    }
}
