package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: u0 */
/* loaded from: classes.dex */
public abstract class AbstractC7326u0 extends N0 implements Serializable {
    public final transient Map d;
    public transient int e;

    public AbstractC7326u0(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.d = map;
    }

    @Override // defpackage.N0
    public final Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map mapF = f();
        this.c = mapF;
        return mapF;
    }

    public final void e() {
        Map map = this.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.e = 0;
    }

    public Map f() {
        return new C8088y0(this, this.d, 0);
    }

    public abstract Collection g();

    public Set h() {
        return new C8278z0(this, this.d);
    }

    @Override // defpackage.N0
    /* renamed from: i */
    public final List c(Object obj) {
        Collection collectionG = (Collection) this.d.get(obj);
        if (collectionG == null) {
            collectionG = g();
        }
        List list = (List) collectionG;
        return list instanceof RandomAccess ? new C0(this, obj, list, null) : new G0(this, obj, list, (G0) null);
    }
}
