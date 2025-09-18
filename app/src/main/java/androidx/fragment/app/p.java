package androidx.fragment.app;

import android.util.Log;
import defpackage.AbstractC1611Uk1;
import defpackage.C1923Yk1;
import defpackage.C5714lY;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p extends AbstractC1611Uk1 {
    public static final C5714lY j = new C5714lY(0);
    public final boolean g;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public boolean h = false;
    public boolean i = false;

    public p(boolean z) {
        this.g = z;
    }

    @Override // defpackage.AbstractC1611Uk1
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        this.h = true;
    }

    public final void c(Fragment fragment) {
        if (this.i) {
            return;
        }
        HashMap map = this.d;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
    }

    public final void d(String str) {
        HashMap map = this.e;
        p pVar = (p) map.get(str);
        if (pVar != null) {
            pVar.b();
            map.remove(str);
        }
        HashMap map2 = this.f;
        C1923Yk1 c1923Yk1 = (C1923Yk1) map2.get(str);
        if (c1923Yk1 != null) {
            c1923Yk1.a();
            map2.remove(str);
        }
    }

    public final void e(Fragment fragment) {
        if (this.i || this.d.remove(fragment.mWho) == null || !Log.isLoggable("FragmentManager", 2)) {
            return;
        }
        fragment.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.d.equals(pVar.d) && this.e.equals(pVar.e) && this.f.equals(pVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
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
