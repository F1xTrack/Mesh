package p000;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: vt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11473vt0 extends AbstractC6922u0 {

    /* renamed from: f */
    public transient C11345ut0 f44580f;

    @Override // p000.AbstractC6922u0
    /* renamed from: f */
    public final Map mo25066f() {
        Map map = this.f43441d;
        return map instanceof NavigableMap ? new C0001A0(this, (NavigableMap) map) : map instanceof SortedMap ? new C0190D0(this, (SortedMap) map) : new C7174y0(this, map, 0);
    }

    @Override // p000.AbstractC6922u0
    /* renamed from: g */
    public final Collection mo23934g() {
        return (List) this.f44580f.get();
    }

    @Override // p000.AbstractC6922u0
    /* renamed from: h */
    public final Set mo25067h() {
        Map map = this.f43441d;
        return map instanceof NavigableMap ? new C0064B0(this, (NavigableMap) map) : map instanceof SortedMap ? new C0253E0(this, (SortedMap) map) : new C7237z0(this, map);
    }
}
