package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public final class C1737s {

    /* renamed from: a */
    public final ArrayList f16265a = new ArrayList();

    /* renamed from: b */
    public final HashMap f16266b = new HashMap();

    /* renamed from: c */
    public final HashMap f16267c = new HashMap();

    /* renamed from: d */
    public C1734p f16268d;

    /* renamed from: a */
    public final void m10107a(Fragment fragment) {
        if (this.f16265a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f16265a) {
            this.f16265a.add(fragment);
        }
        fragment.mAdded = true;
    }

    /* renamed from: b */
    public final Fragment m10108b(String str) {
        C1736r c1736r = (C1736r) this.f16266b.get(str);
        if (c1736r != null) {
            return c1736r.f16262c;
        }
        return null;
    }

    /* renamed from: c */
    public final Fragment m10109c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (C1736r c1736r : this.f16266b.values()) {
            if (c1736r != null && (fragmentFindFragmentByWho = c1736r.f16262c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final ArrayList m10110d() {
        ArrayList arrayList = new ArrayList();
        for (C1736r c1736r : this.f16266b.values()) {
            if (c1736r != null) {
                arrayList.add(c1736r);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final ArrayList m10111e() {
        ArrayList arrayList = new ArrayList();
        for (C1736r c1736r : this.f16266b.values()) {
            if (c1736r != null) {
                arrayList.add(c1736r.f16262c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List m10112f() {
        ArrayList arrayList;
        if (this.f16265a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f16265a) {
            arrayList = new ArrayList(this.f16265a);
        }
        return arrayList;
    }

    /* renamed from: g */
    public final void m10113g(C1736r c1736r) {
        Fragment fragment = c1736r.f16262c;
        String str = fragment.mWho;
        HashMap map = this.f16266b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, c1736r);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f16268d.m10091c(fragment);
            } else {
                this.f16268d.m10093e(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
    }

    /* renamed from: h */
    public final void m10114h(C1736r c1736r) {
        Fragment fragment = c1736r.f16262c;
        if (fragment.mRetainInstance) {
            this.f16268d.m10093e(fragment);
        }
        HashMap map = this.f16266b;
        if (map.get(fragment.mWho) == c1736r && ((C1736r) map.put(fragment.mWho, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
    }

    /* renamed from: i */
    public final Bundle m10115i(Bundle bundle, String str) {
        HashMap map = this.f16267c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
