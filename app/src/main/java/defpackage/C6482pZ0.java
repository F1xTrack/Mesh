package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: pZ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6482pZ0 extends P0 implements Serializable {
    public static final C6482pZ0 b;
    public final C2391bn0 a;

    static {
        C2391bn0 c2391bn0 = C2391bn0.n;
        b = new C6482pZ0(C2391bn0.n);
    }

    public C6482pZ0(C2391bn0 c2391bn0) {
        O90.f(c2391bn0, "backing");
        this.a = c2391bn0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        O90.f(collection, "elements");
        this.a.c();
        return super.addAll(collection);
    }

    @Override // defpackage.P0
    public final int b() {
        return this.a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C2391bn0 c2391bn0 = this.a;
        c2391bn0.getClass();
        return new C1928Ym0(c2391bn0, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C2391bn0 c2391bn0 = this.a;
        c2391bn0.c();
        int iJ = c2391bn0.j(obj);
        if (iJ < 0) {
            return false;
        }
        c2391bn0.n(iJ);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        O90.f(collection, "elements");
        this.a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        O90.f(collection, "elements");
        this.a.c();
        return super.retainAll(collection);
    }

    public C6482pZ0() {
        this(new C2391bn0());
    }
}
