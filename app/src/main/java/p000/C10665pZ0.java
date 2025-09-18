package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: pZ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10665pZ0 extends AbstractC0945P0 implements Serializable {

    /* renamed from: b */
    public static final C10665pZ0 f40208b;

    /* renamed from: a */
    public final C8896bn0 f40209a;

    static {
        C8896bn0 c8896bn0 = C8896bn0.f17144n;
        f40208b = new C10665pZ0(C8896bn0.f17144n);
    }

    public C10665pZ0(C8896bn0 c8896bn0) {
        O90.m5968f(c8896bn0, "backing");
        this.f40209a = c8896bn0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f40209a.m10509a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        O90.m5968f(collection, "elements");
        this.f40209a.m10511c();
        return super.addAll(collection);
    }

    @Override // p000.AbstractC0945P0
    /* renamed from: b */
    public final int mo6193b() {
        return this.f40209a.f17153i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f40209a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f40209a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f40209a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C8896bn0 c8896bn0 = this.f40209a;
        c8896bn0.getClass();
        return new C8586Ym0(c8896bn0, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C8896bn0 c8896bn0 = this.f40209a;
        c8896bn0.m10511c();
        int iM10516j = c8896bn0.m10516j(obj);
        if (iM10516j < 0) {
            return false;
        }
        c8896bn0.m10520n(iM10516j);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        O90.m5968f(collection, "elements");
        this.f40209a.m10511c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        O90.m5968f(collection, "elements");
        this.f40209a.m10511c();
        return super.retainAll(collection);
    }

    public C10665pZ0() {
        this(new C8896bn0());
    }
}
