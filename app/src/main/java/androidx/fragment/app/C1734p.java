package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import p000.AbstractC8375Uk1;
import p000.C6370lY;
import p000.C8583Yk1;

/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public final class C1734p extends AbstractC8375Uk1 {

    /* renamed from: j */
    public static final C6370lY f16239j = new C6370lY(0);

    /* renamed from: g */
    public final boolean f16243g;

    /* renamed from: d */
    public final HashMap f16240d = new HashMap();

    /* renamed from: e */
    public final HashMap f16241e = new HashMap();

    /* renamed from: f */
    public final HashMap f16242f = new HashMap();

    /* renamed from: h */
    public boolean f16244h = false;

    /* renamed from: i */
    public boolean f16245i = false;

    public C1734p(boolean z) {
        this.f16243g = z;
    }

    @Override // p000.AbstractC8375Uk1
    /* renamed from: b */
    public final void mo8138b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        this.f16244h = true;
    }

    /* renamed from: c */
    public final void m10091c(Fragment fragment) {
        if (this.f16245i) {
            return;
        }
        HashMap map = this.f16240d;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
    }

    /* renamed from: d */
    public final void m10092d(String str) {
        HashMap map = this.f16241e;
        C1734p c1734p = (C1734p) map.get(str);
        if (c1734p != null) {
            c1734p.mo8138b();
            map.remove(str);
        }
        HashMap map2 = this.f16242f;
        C8583Yk1 c8583Yk1 = (C8583Yk1) map2.get(str);
        if (c8583Yk1 != null) {
            c8583Yk1.m9352a();
            map2.remove(str);
        }
    }

    /* renamed from: e */
    public final void m10093e(Fragment fragment) {
        if (this.f16245i || this.f16240d.remove(fragment.mWho) == null || !Log.isLoggable("FragmentManager", 2)) {
            return;
        }
        fragment.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1734p.class != obj.getClass()) {
            return false;
        }
        C1734p c1734p = (C1734p) obj;
        return this.f16240d.equals(c1734p.f16240d) && this.f16241e.equals(c1734p.f16241e) && this.f16242f.equals(c1734p.f16242f);
    }

    public final int hashCode() {
        return this.f16242f.hashCode() + ((this.f16241e.hashCode() + (this.f16240d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f16240d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f16241e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f16242f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
