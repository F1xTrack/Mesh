package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: Xu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1873Xu extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ C2223av b;

    public /* synthetic */ C1873Xu(C2223av c2223av, int i) {
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
                Map mapC = c2223av.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = c2223av.e(entry.getKey());
                    if (iE != -1 && AbstractC5465kE1.a(c2223av.l()[iE], entry.getValue())) {
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
                Map mapC = c2223av.c();
                return mapC != null ? mapC.entrySet().iterator() : new C1795Wu(c2223av, 1);
            default:
                C2223av c2223av2 = this.b;
                Map mapC2 = c2223av2.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new C1795Wu(c2223av2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                C2223av c2223av = this.b;
                Map mapC = c2223av.c();
                if (mapC != null) {
                    return mapC.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c2223av.g()) {
                        int iD = c2223av.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c2223av.b;
                        Objects.requireNonNull(obj2);
                        int iE = AT1.e(key, value, iD, obj2, c2223av.j(), c2223av.k(), c2223av.l());
                        if (iE != -1) {
                            c2223av.f(iE, iD);
                            c2223av.g--;
                            c2223av.f += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C2223av c2223av2 = this.b;
                Map mapC2 = c2223av2.c();
                return mapC2 != null ? mapC2.keySet().remove(obj) : c2223av2.i(obj) != C2223av.k;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
