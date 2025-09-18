package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: u0 */
/* loaded from: classes.dex */
public abstract class AbstractC6922u0 extends AbstractC0819N0 implements Serializable {

    /* renamed from: d */
    public final transient Map f43441d;

    /* renamed from: e */
    public transient int f43442e;

    public AbstractC6922u0(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f43441d = map;
    }

    @Override // p000.AbstractC0819N0
    /* renamed from: a */
    public final Map mo4619a() {
        Map map = this.f7449c;
        if (map != null) {
            return map;
        }
        Map mapMo25066f = mo25066f();
        this.f7449c = mapMo25066f;
        return mapMo25066f;
    }

    /* renamed from: e */
    public final void m25065e() {
        Map map = this.f43441d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f43442e = 0;
    }

    /* renamed from: f */
    public Map mo25066f() {
        return new C7174y0(this, this.f43441d, 0);
    }

    /* renamed from: g */
    public abstract Collection mo23934g();

    /* renamed from: h */
    public Set mo25067h() {
        return new C7237z0(this, this.f43441d);
    }

    @Override // p000.AbstractC0819N0
    /* renamed from: i */
    public final List mo5490c(Object obj) {
        Collection collectionMo23934g = (Collection) this.f43441d.get(obj);
        if (collectionMo23934g == null) {
            collectionMo23934g = mo23934g();
        }
        List list = (List) collectionMo23934g;
        return list instanceof RandomAccess ? new C0127C0(this, obj, list, null) : new C0379G0(this, obj, list, (C0379G0) null);
    }
}
