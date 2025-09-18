package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2581cn0 extends P0 {
    public final /* synthetic */ int a;
    public final C2391bn0 b;

    public C2581cn0(C2391bn0 c2391bn0, int i) {
        this.a = i;
        switch (i) {
            case 1:
                O90.f(c2391bn0, "backing");
                this.b = c2391bn0;
                break;
            default:
                O90.f(c2391bn0, "backing");
                this.b = c2391bn0;
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                O90.f((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                O90.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                O90.f(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.P0
    public final int b() {
        switch (this.a) {
        }
        return this.b.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                O90.f(entry, "element");
                return this.b.f(entry);
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                O90.f(collection, "elements");
                return this.b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.a) {
        }
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                C2391bn0 c2391bn0 = this.b;
                c2391bn0.getClass();
                return new C1928Ym0(c2391bn0, 0);
            default:
                C2391bn0 c2391bn02 = this.b;
                c2391bn02.getClass();
                return new C1928Ym0(c2391bn02, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    O90.f(entry, "element");
                    C2391bn0 c2391bn0 = this.b;
                    c2391bn0.getClass();
                    c2391bn0.c();
                    int iJ = c2391bn0.j(entry.getKey());
                    if (iJ >= 0) {
                        Object[] objArr = c2391bn0.b;
                        O90.c(objArr);
                        if (O90.a(objArr[iJ], entry.getValue())) {
                            c2391bn0.n(iJ);
                            break;
                        }
                    }
                }
                break;
            default:
                C2391bn0 c2391bn02 = this.b;
                c2391bn02.c();
                int iJ2 = c2391bn02.j(obj);
                if (iJ2 >= 0) {
                    c2391bn02.n(iJ2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                O90.f(collection, "elements");
                this.b.c();
                break;
            default:
                O90.f(collection, "elements");
                this.b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                O90.f(collection, "elements");
                this.b.c();
                break;
            default:
                O90.f(collection, "elements");
                this.b.c();
                break;
        }
        return super.retainAll(collection);
    }
}
