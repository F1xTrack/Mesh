package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: io.sentry.h */
/* loaded from: classes2.dex */
public final class C6023h extends AbstractCollection implements Queue, Serializable {

    /* renamed from: a */
    public final transient Object[] f34167a;

    /* renamed from: b */
    public transient int f34168b = 0;

    /* renamed from: c */
    public transient int f34169c = 0;

    /* renamed from: d */
    public transient boolean f34170d = false;

    /* renamed from: e */
    public final int f34171e;

    public C6023h(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i];
        this.f34167a = objArr;
        this.f34171e = objArr.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i = this.f34171e;
        if (size == i) {
            remove();
        }
        int i2 = this.f34169c;
        int i3 = i2 + 1;
        this.f34169c = i3;
        this.f34167a[i2] = obj;
        if (i3 >= i) {
            this.f34169c = 0;
        }
        if (this.f34169c == this.f34168b) {
            this.f34170d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f34170d = false;
        this.f34168b = 0;
        this.f34169c = 0;
        Arrays.fill(this.f34167a, (Object) null);
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
        return new C6020g(this);
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
        return this.f34167a[this.f34168b];
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
        int i = this.f34168b;
        Object[] objArr = this.f34167a;
        Object obj = objArr[i];
        if (obj != null) {
            int i2 = i + 1;
            this.f34168b = i2;
            objArr[i] = null;
            if (i2 >= this.f34171e) {
                this.f34168b = 0;
            }
            this.f34170d = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.f34169c;
        int i2 = this.f34168b;
        int i3 = this.f34171e;
        if (i < i2) {
            return (i3 - i2) + i;
        }
        if (i != i2) {
            return i - i2;
        }
        if (this.f34170d) {
            return i3;
        }
        return 0;
    }
}
