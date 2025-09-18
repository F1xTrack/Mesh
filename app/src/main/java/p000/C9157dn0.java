package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: dn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9157dn0 extends AbstractCollection implements Collection, InterfaceC11570we0 {

    /* renamed from: a */
    public final C8896bn0 f26277a;

    public C9157dn0(C8896bn0 c8896bn0) {
        O90.m5968f(c8896bn0, "backing");
        this.f26277a = c8896bn0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        O90.m5968f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f26277a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f26277a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f26277a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C8896bn0 c8896bn0 = this.f26277a;
        c8896bn0.getClass();
        return new C8586Ym0(c8896bn0, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C8896bn0 c8896bn0 = this.f26277a;
        c8896bn0.m10511c();
        int iM10517k = c8896bn0.m10517k(obj);
        if (iM10517k < 0) {
            return false;
        }
        c8896bn0.m10520n(iM10517k);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        O90.m5968f(collection, "elements");
        this.f26277a.m10511c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        O90.m5968f(collection, "elements");
        this.f26277a.m10511c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f26277a.f17153i;
    }
}
