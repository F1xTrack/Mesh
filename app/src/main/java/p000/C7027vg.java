package p000;

import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: vg */
/* loaded from: classes.dex */
public class C7027vg implements RD0 {

    /* renamed from: m */
    public static final W70 f44471m;

    /* renamed from: n */
    public static final Object f44472n;

    /* renamed from: a */
    public final C10737q70 f44473a;

    /* renamed from: b */
    public final String f44474b;

    /* renamed from: c */
    public final E90 f44475c;

    /* renamed from: d */
    public final Object f44476d;

    /* renamed from: e */
    public final EnumC10609p70 f44477e;

    /* renamed from: f */
    public final HashMap f44478f;

    /* renamed from: g */
    public boolean f44479g;

    /* renamed from: h */
    public EnumC11133tD0 f44480h;

    /* renamed from: i */
    public boolean f44481i;

    /* renamed from: j */
    public boolean f44482j;

    /* renamed from: k */
    public final ArrayList f44483k;

    /* renamed from: l */
    public final C8812b70 f44484l;

    static {
        String[] strArr = {NotificationConstants.f19487ID, "uri_source"};
        int i = W70.f12998a;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, strArr);
        f44471m = new W70(hashSet);
        f44472n = new Object();
    }

    public C7027vg(C10737q70 c10737q70, String str, String str2, E90 e90, Object obj, EnumC10609p70 enumC10609p70, boolean z, boolean z2, EnumC11133tD0 enumC11133tD0, C8812b70 c8812b70) {
        this.f44473a = c10737q70;
        this.f44474b = str;
        HashMap map = new HashMap();
        this.f44478f = map;
        map.put(NotificationConstants.f19487ID, str);
        map.put("uri_source", c10737q70 == null ? "null-request" : c10737q70.f40609b);
        this.f44475c = e90;
        this.f44476d = obj == null ? f44472n : obj;
        this.f44477e = enumC10609p70;
        this.f44479g = z;
        this.f44480h = enumC11133tD0;
        this.f44481i = z2;
        this.f44482j = false;
        this.f44483k = new ArrayList();
        this.f44484l = c8812b70;
    }

    /* renamed from: b */
    public static void m25459b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC7090wg) it.next()).mo2011b();
        }
    }

    /* renamed from: c */
    public static void m25460c(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC7090wg) it.next()).mo2012c();
        }
    }

    /* renamed from: d */
    public static void m25461d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC7090wg) it.next()).mo2013d();
        }
    }

    /* renamed from: a */
    public final void m25462a(AbstractC7090wg abstractC7090wg) {
        boolean z;
        synchronized (this) {
            this.f44483k.add(abstractC7090wg);
            z = this.f44482j;
        }
        if (z) {
            abstractC7090wg.mo2010a();
        }
    }

    /* renamed from: e */
    public final void m25463e() {
        ArrayList arrayList;
        synchronized (this) {
            if (this.f44482j) {
                arrayList = null;
            } else {
                this.f44482j = true;
                arrayList = new ArrayList(this.f44483k);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC7090wg) it.next()).mo2010a();
        }
    }

    /* renamed from: f */
    public final synchronized EnumC11133tD0 m25464f() {
        return this.f44480h;
    }

    /* renamed from: g */
    public final synchronized boolean m25465g() {
        return this.f44481i;
    }

    /* renamed from: h */
    public final synchronized boolean m25466h() {
        return this.f44479g;
    }

    /* renamed from: i */
    public final void m25467i(Object obj, String str) {
        if (f44471m.contains(str)) {
            return;
        }
        this.f44478f.put(str, obj);
    }

    /* renamed from: j */
    public final void m25468j(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            m25467i(entry.getValue(), (String) entry.getKey());
        }
    }

    /* renamed from: k */
    public final void m25469k(String str, String str2) {
        HashMap map = this.f44478f;
        map.put("origin", str);
        map.put("origin_sub", str2);
    }

    /* renamed from: l */
    public final synchronized ArrayList m25470l(boolean z) {
        if (z == this.f44481i) {
            return null;
        }
        this.f44481i = z;
        return new ArrayList(this.f44483k);
    }

    /* renamed from: m */
    public final synchronized ArrayList m25471m(boolean z) {
        if (z == this.f44479g) {
            return null;
        }
        this.f44479g = z;
        return new ArrayList(this.f44483k);
    }

    /* renamed from: n */
    public final synchronized ArrayList m25472n(EnumC11133tD0 enumC11133tD0) {
        if (enumC11133tD0 == this.f44480h) {
            return null;
        }
        this.f44480h = enumC11133tD0;
        return new ArrayList(this.f44483k);
    }
}
