package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: vt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7687vt0 extends AbstractC7326u0 {
    public transient C7496ut0 f;

    @Override // defpackage.AbstractC7326u0
    public final Map f() {
        Map map = this.d;
        return map instanceof NavigableMap ? new A0(this, (NavigableMap) map) : map instanceof SortedMap ? new D0(this, (SortedMap) map) : new C8088y0(this, map, 0);
    }

    @Override // defpackage.AbstractC7326u0
    public final Collection g() {
        return (List) this.f.get();
    }

    @Override // defpackage.AbstractC7326u0
    public final Set h() {
        Map map = this.d;
        return map instanceof NavigableMap ? new B0(this, (NavigableMap) map) : map instanceof SortedMap ? new E0(this, (SortedMap) map) : new C8278z0(this, map);
    }
}
