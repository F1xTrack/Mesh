package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: io.sentry.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5128h extends AbstractCollection implements Queue, Serializable {
    public final transient Object[] a;
    public transient int b = 0;
    public transient int c = 0;
    public transient boolean d = false;
    public final int e;

    public C5128h(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i];
        this.a = objArr;
        this.e = objArr.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i = this.e;
        if (size == i) {
            remove();
        }
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        this.a[i2] = obj;
        if (i3 >= i) {
            this.c = 0;
        }
        if (this.c == this.b) {
            this.d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.d = false;
        this.b = 0;
        this.c = 0;
        Arrays.fill(this.a, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5125g(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.a[this.b];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        int i = this.b;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (obj != null) {
            int i2 = i + 1;
            this.b = i2;
            objArr[i] = null;
            if (i2 >= this.e) {
                this.b = 0;
            }
            this.d = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.c;
        int i2 = this.b;
        int i3 = this.e;
        if (i < i2) {
            return (i3 - i2) + i;
        }
        if (i != i2) {
            return i - i2;
        }
        if (this.d) {
            return i3;
        }
        return 0;
    }
}
