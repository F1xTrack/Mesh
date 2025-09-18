package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: vg */
/* loaded from: classes.dex */
public class C7647vg implements RD0 {
    public static final W70 m;
    public static final Object n;
    public final C6589q70 a;
    public final String b;
    public final E90 c;
    public final Object d;
    public final EnumC6398p70 e;
    public final HashMap f;
    public boolean g;
    public EnumC7179tD0 h;
    public boolean i;
    public boolean j;
    public final ArrayList k;
    public final C2265b70 l;

    static {
        String[] strArr = {NotificationConstants.ID, "uri_source"};
        int i = W70.a;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, strArr);
        m = new W70(hashSet);
        n = new Object();
    }

    public C7647vg(C6589q70 c6589q70, String str, String str2, E90 e90, Object obj, EnumC6398p70 enumC6398p70, boolean z, boolean z2, EnumC7179tD0 enumC7179tD0, C2265b70 c2265b70) {
        this.a = c6589q70;
        this.b = str;
        HashMap map = new HashMap();
        this.f = map;
        map.put(NotificationConstants.ID, str);
        map.put("uri_source", c6589q70 == null ? "null-request" : c6589q70.b);
        this.c = e90;
        this.d = obj == null ? n : obj;
        this.e = enumC6398p70;
        this.g = z;
        this.h = enumC7179tD0;
        this.i = z2;
        this.j = false;
        this.k = new ArrayList();
        this.l = c2265b70;
    }

    public static void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC7837wg) it.next()).b();
        }
    }

    public static void c(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC7837wg) it.next()).c();
        }
    }

    public static void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC7837wg) it.next()).d();
        }
    }

    public final void a(AbstractC7837wg abstractC7837wg) {
        boolean z;
        synchronized (this) {
            this.k.add(abstractC7837wg);
            z = this.j;
        }
        if (z) {
            abstractC7837wg.a();
        }
    }

    public final void e() {
        ArrayList arrayList;
        synchronized (this) {
            if (this.j) {
                arrayList = null;
            } else {
                this.j = true;
                arrayList = new ArrayList(this.k);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC7837wg) it.next()).a();
        }
    }

    public final synchronized EnumC7179tD0 f() {
        return this.h;
    }

    public final synchronized boolean g() {
        return this.i;
    }

    public final synchronized boolean h() {
        return this.g;
    }

    public final void i(Object obj, String str) {
        if (m.contains(str)) {
            return;
        }
        this.f.put(str, obj);
    }

    public final void j(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            i(entry.getValue(), (String) entry.getKey());
        }
    }

    public final void k(String str, String str2) {
        HashMap map = this.f;
        map.put("origin", str);
        map.put("origin_sub", str2);
    }

    public final synchronized ArrayList l(boolean z) {
        if (z == this.i) {
            return null;
        }
        this.i = z;
        return new ArrayList(this.k);
    }

    public final synchronized ArrayList m(boolean z) {
        if (z == this.g) {
            return null;
        }
        this.g = z;
        return new ArrayList(this.k);
    }

    public final synchronized ArrayList n(EnumC7179tD0 enumC7179tD0) {
        if (enumC7179tD0 == this.h) {
            return null;
        }
        this.h = enumC7179tD0;
        return new ArrayList(this.k);
    }
}
