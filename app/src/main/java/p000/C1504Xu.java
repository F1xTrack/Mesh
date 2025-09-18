package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: Xu */
/* loaded from: classes.dex */
public final class C1504Xu extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f14041a;

    /* renamed from: b */
    public final /* synthetic */ C1752av f14042b;

    public /* synthetic */ C1504Xu(C1752av c1752av, int i) {
        this.f14041a = i;
        this.f14042b = c1752av;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f14041a) {
            case 0:
                this.f14042b.clear();
                break;
            default:
                this.f14042b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f14041a) {
            case 0:
                C1752av c1752av = this.f14042b;
                Map mapM10359c = c1752av.m10359c();
                if (mapM10359c != null) {
                    return mapM10359c.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM10361e = c1752av.m10361e(entry.getKey());
                    if (iM10361e != -1 && AbstractC9984kE1.m22173a(c1752av.m10367l()[iM10361e], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f14042b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f14041a) {
            case 0:
                C1752av c1752av = this.f14042b;
                Map mapM10359c = c1752av.m10359c();
                return mapM10359c != null ? mapM10359c.entrySet().iterator() : new C1441Wu(c1752av, 1);
            default:
                C1752av c1752av2 = this.f14042b;
                Map mapM10359c2 = c1752av2.m10359c();
                return mapM10359c2 != null ? mapM10359c2.keySet().iterator() : new C1441Wu(c1752av2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f14041a) {
            case 0:
                C1752av c1752av = this.f14042b;
                Map mapM10359c = c1752av.m10359c();
                if (mapM10359c != null) {
                    return mapM10359c.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c1752av.m10363g()) {
                        int iM10360d = c1752av.m10360d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c1752av.f16665b;
                        Objects.requireNonNull(obj2);
                        int iM191e = AT1.m191e(key, value, iM10360d, obj2, c1752av.m10365j(), c1752av.m10366k(), c1752av.m10367l());
                        if (iM191e != -1) {
                            c1752av.m10362f(iM191e, iM10360d);
                            c1752av.f16670g--;
                            c1752av.f16669f += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C1752av c1752av2 = this.f14042b;
                Map mapM10359c2 = c1752av2.m10359c();
                return mapM10359c2 != null ? mapM10359c2.keySet().remove(obj) : c1752av2.m10364i(obj) != C1752av.f16662k;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f14041a) {
        }
        return this.f14042b.size();
    }
}
