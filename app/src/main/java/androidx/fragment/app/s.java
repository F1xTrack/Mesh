package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class s {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public p d;

    public final void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        r rVar = (r) this.b.get(str);
        if (rVar != null) {
            return rVar.c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (r rVar : this.b.values()) {
            if (rVar != null && (fragmentFindFragmentByWho = rVar.c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (r rVar : this.b.values()) {
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (r rVar : this.b.values()) {
            if (rVar != null) {
                arrayList.add(rVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(r rVar) {
        Fragment fragment = rVar.c;
        String str = fragment.mWho;
        HashMap map = this.b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, rVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.d.c(fragment);
            } else {
                this.d.e(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
    }

    public final void h(r rVar) {
        Fragment fragment = rVar.c;
        if (fragment.mRetainInstance) {
            this.d.e(fragment);
        }
        HashMap map = this.b;
        if (map.get(fragment.mWho) == rVar && ((r) map.put(fragment.mWho, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap map = this.c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
