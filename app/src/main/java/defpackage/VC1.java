package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class VC1 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ C2223av b;

    public /* synthetic */ VC1(C2223av c2223av, int i) {
        this.a = i;
        this.b = c2223av;
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
                C2223av c2223av = this.b;
                Map mapQ = c2223av.q();
                if (mapQ != null) {
                    return mapQ.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iU = c2223av.u(entry.getKey());
                    if (iU != -1 && O12.b(c2223av.p()[iU], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                C2223av c2223av = this.b;
                Map mapQ = c2223av.q();
                return mapQ != null ? mapQ.entrySet().iterator() : new C7749wC1(c2223av, 1);
            default:
                C2223av c2223av2 = this.b;
                Map mapQ2 = c2223av2.q();
                return mapQ2 != null ? mapQ2.keySet().iterator() : new C7749wC1(c2223av2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                C2223av c2223av = this.b;
                Map mapQ = c2223av.q();
                if (mapQ != null) {
                    return mapQ.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c2223av.s()) {
                        int iT = c2223av.t();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c2223av.b;
                        Objects.requireNonNull(obj2);
                        int iD = AbstractC2440c22.d(key, value, iT, obj2, c2223av.n(), c2223av.o(), c2223av.p());
                        if (iD != -1) {
                            c2223av.r(iD, iT);
                            c2223av.g--;
                            c2223av.f += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C2223av c2223av2 = this.b;
                Map mapQ2 = c2223av2.q();
                return mapQ2 != null ? mapQ2.keySet().remove(obj) : c2223av2.w(obj) != C2223av.l;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
