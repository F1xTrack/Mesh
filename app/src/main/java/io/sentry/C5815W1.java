package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* renamed from: io.sentry.W1 */
/* loaded from: classes2.dex */
public final class C5815W1 implements Queue, Collection, Serializable {

    /* renamed from: a */
    public final Queue f33437a;

    /* renamed from: b */
    public final C5815W1 f33438b = this;

    public C5815W1(Queue queue) {
        this.f33437a = queue;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.f33438b) {
            zAdd = this.f33437a.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f33438b) {
            zAddAll = this.f33437a.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f33438b) {
            this.f33437a.clear();
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f33438b) {
            zContains = this.f33437a.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f33438b) {
            zContainsAll = this.f33437a.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Queue
    public final Object element() {
        Object objElement;
        synchronized (this.f33438b) {
            objElement = this.f33437a.element();
        }
        return objElement;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f33438b) {
            zEquals = this.f33437a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f33438b) {
            iHashCode = this.f33437a.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f33438b) {
            zIsEmpty = this.f33437a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f33437a.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        boolean zOffer;
        synchronized (this.f33438b) {
            zOffer = this.f33437a.offer(obj);
        }
        return zOffer;
    }

    @Override // java.util.Queue
    public final Object peek() {
        Object objPeek;
        synchronized (this.f33438b) {
            objPeek = this.f33437a.peek();
        }
        return objPeek;
    }

    @Override // java.util.Queue
    public final Object poll() {
        Object objPoll;
        synchronized (this.f33438b) {
            objPoll = this.f33437a.poll();
        }
        return objPoll;
    }

    @Override // java.util.Queue
    public final Object remove() {
        Object objRemove;
        synchronized (this.f33438b) {
            objRemove = this.f33437a.remove();
        }
        return objRemove;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f33438b) {
            zRemoveAll = this.f33437a.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f33438b) {
            zRetainAll = this.f33437a.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f33438b) {
            size = this.f33437a.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f33438b) {
            array = this.f33437a.toArray();
        }
        return array;
    }

    public final String toString() {
        String string;
        synchronized (this.f33438b) {
            string = this.f33437a.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f33438b) {
            zRemove = this.f33437a.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f33438b) {
            array = this.f33437a.toArray(objArr);
        }
        return array;
    }
}
