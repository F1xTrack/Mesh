package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9024cn0 extends AbstractC0945P0 {

    /* renamed from: a */
    public final /* synthetic */ int f17746a;

    /* renamed from: b */
    public final C8896bn0 f17747b;

    public C9024cn0(C8896bn0 c8896bn0, int i) {
        this.f17746a = i;
        switch (i) {
            case 1:
                O90.m5968f(c8896bn0, "backing");
                this.f17747b = c8896bn0;
                break;
            default:
                O90.m5968f(c8896bn0, "backing");
                this.f17747b = c8896bn0;
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f17746a) {
            case 0:
                O90.m5968f((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f17746a) {
            case 0:
                O90.m5968f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                O90.m5968f(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // p000.AbstractC0945P0
    /* renamed from: b */
    public final int mo6193b() {
        switch (this.f17746a) {
        }
        return this.f17747b.f17153i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f17746a) {
            case 0:
                this.f17747b.clear();
                break;
            default:
                this.f17747b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f17746a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                O90.m5968f(entry, "element");
                return this.f17747b.m10514f(entry);
            default:
                return this.f17747b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f17746a) {
            case 0:
                O90.m5968f(collection, "elements");
                return this.f17747b.m10513e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f17746a) {
        }
        return this.f17747b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f17746a) {
            case 0:
                C8896bn0 c8896bn0 = this.f17747b;
                c8896bn0.getClass();
                return new C8586Ym0(c8896bn0, 0);
            default:
                C8896bn0 c8896bn02 = this.f17747b;
                c8896bn02.getClass();
                return new C8586Ym0(c8896bn02, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f17746a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    O90.m5968f(entry, "element");
                    C8896bn0 c8896bn0 = this.f17747b;
                    c8896bn0.getClass();
                    c8896bn0.m10511c();
                    int iM10516j = c8896bn0.m10516j(entry.getKey());
                    if (iM10516j >= 0) {
                        Object[] objArr = c8896bn0.f17146b;
                        O90.m5965c(objArr);
                        if (O90.m5963a(objArr[iM10516j], entry.getValue())) {
                            c8896bn0.m10520n(iM10516j);
                            break;
                        }
                    }
                }
                break;
            default:
                C8896bn0 c8896bn02 = this.f17747b;
                c8896bn02.m10511c();
                int iM10516j2 = c8896bn02.m10516j(obj);
                if (iM10516j2 >= 0) {
                    c8896bn02.m10520n(iM10516j2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f17746a) {
            case 0:
                O90.m5968f(collection, "elements");
                this.f17747b.m10511c();
                break;
            default:
                O90.m5968f(collection, "elements");
                this.f17747b.m10511c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f17746a) {
            case 0:
                O90.m5968f(collection, "elements");
                this.f17747b.m10511c();
                break;
            default:
                O90.m5968f(collection, "elements");
                this.f17747b.m10511c();
                break;
        }
        return super.retainAll(collection);
    }
}
