package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: dn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3457dn0 extends AbstractCollection implements Collection, InterfaceC7832we0 {
    public final C2391bn0 a;

    public C3457dn0(C2391bn0 c2391bn0) {
        O90.f(c2391bn0, "backing");
        this.a = c2391bn0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        O90.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C2391bn0 c2391bn0 = this.a;
        c2391bn0.getClass();
        return new C1928Ym0(c2391bn0, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C2391bn0 c2391bn0 = this.a;
        c2391bn0.c();
        int iK = c2391bn0.k(obj);
        if (iK < 0) {
            return false;
        }
        c2391bn0.n(iK);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        O90.f(collection, "elements");
        this.a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        O90.f(collection, "elements");
        this.a.c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.i;
    }
}
