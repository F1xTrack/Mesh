package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class VC1 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f12414a;

    /* renamed from: b */
    public final /* synthetic */ C1752av f12415b;

    public /* synthetic */ VC1(C1752av c1752av, int i) {
        this.f12414a = i;
        this.f12415b = c1752av;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f12414a) {
            case 0:
                this.f12415b.clear();
                break;
            default:
                this.f12415b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f12414a) {
            case 0:
                C1752av c1752av = this.f12415b;
                Map mapM10372q = c1752av.m10372q();
                if (mapM10372q != null) {
                    return mapM10372q.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM10376u = c1752av.m10376u(entry.getKey());
                    if (iM10376u != -1 && O12.m5941b(c1752av.m10371p()[iM10376u], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f12415b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f12414a) {
            case 0:
                C1752av c1752av = this.f12415b;
                Map mapM10372q = c1752av.m10372q();
                return mapM10372q != null ? mapM10372q.entrySet().iterator() : new C11515wC1(c1752av, 1);
            default:
                C1752av c1752av2 = this.f12415b;
                Map mapM10372q2 = c1752av2.m10372q();
                return mapM10372q2 != null ? mapM10372q2.keySet().iterator() : new C11515wC1(c1752av2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f12414a) {
            case 0:
                C1752av c1752av = this.f12415b;
                Map mapM10372q = c1752av.m10372q();
                if (mapM10372q != null) {
                    return mapM10372q.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c1752av.m10374s()) {
                        int iM10375t = c1752av.m10375t();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c1752av.f16665b;
                        Objects.requireNonNull(obj2);
                        int iM10576d = AbstractC8930c22.m10576d(key, value, iM10375t, obj2, c1752av.m10369n(), c1752av.m10370o(), c1752av.m10371p());
                        if (iM10576d != -1) {
                            c1752av.m10373r(iM10576d, iM10375t);
                            c1752av.f16670g--;
                            c1752av.f16669f += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C1752av c1752av2 = this.f12415b;
                Map mapM10372q2 = c1752av2.m10372q();
                return mapM10372q2 != null ? mapM10372q2.keySet().remove(obj) : c1752av2.m10378w(obj) != C1752av.f16663l;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f12414a) {
        }
        return this.f12415b.size();
    }
}
