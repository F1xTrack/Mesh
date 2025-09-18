package p000;

import android.content.Context;
import com.google.android.gms.common.util.BiConsumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pV */
/* loaded from: classes.dex */
public final class C6621pV {

    /* renamed from: a */
    public final Context f40114a;

    /* renamed from: b */
    public final C0409GU f40115b;

    /* renamed from: c */
    public final Executor f40116c;

    /* renamed from: d */
    public final C7169xw f40117d;

    /* renamed from: e */
    public final C7169xw f40118e;

    /* renamed from: f */
    public final C7169xw f40119f;

    /* renamed from: g */
    public final C0248Dw f40120g;

    /* renamed from: h */
    public final C0311Ew f40121h;

    /* renamed from: i */
    public final C0877Nw f40122i;

    /* renamed from: j */
    public final InterfaceC1478XU f40123j;

    /* renamed from: k */
    public final C10910rT1 f40124k;

    /* renamed from: l */
    public final C10919rY0 f40125l;

    public C6621pV(Context context, InterfaceC1478XU interfaceC1478XU, C0409GU c0409gu, Executor executor, C7169xw c7169xw, C7169xw c7169xw2, C7169xw c7169xw3, C0248Dw c0248Dw, C0311Ew c0311Ew, C0877Nw c0877Nw, C10910rT1 c10910rT1, C10919rY0 c10919rY0) {
        this.f40114a = context;
        this.f40123j = interfaceC1478XU;
        this.f40115b = c0409gu;
        this.f40116c = executor;
        this.f40117d = c7169xw;
        this.f40118e = c7169xw2;
        this.f40119f = c7169xw3;
        this.f40120g = c0248Dw;
        this.f40121h = c0311Ew;
        this.f40122i = c0877Nw;
        this.f40124k = c10910rT1;
        this.f40125l = c10919rY0;
    }

    /* renamed from: d */
    public static C6621pV m23803d(C0786MU c0786mu) {
        return ((C11159tQ0) c0786mu.m5380b(C11159tQ0.class)).m24930b("firebase");
    }

    /* renamed from: g */
    public static ArrayList m23804g(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C9450g32 m23805a() {
        C0248Dw c0248Dw = this.f40120g;
        C0877Nw c0877Nw = c0248Dw.f2320h;
        return c0248Dw.m1947a(c0877Nw.f8136a.getLong("minimum_fetch_interval_in_seconds", C0248Dw.f2311j)).m18387n(EnumC1163SU.f10807a, new C0912OU(5));
    }

    /* renamed from: b */
    public final HashMap m23806b() {
        String string;
        C7142xV c7142xV;
        C0311Ew c0311Ew = this.f40121h;
        HashSet hashSet = new HashSet();
        hashSet.addAll(C0311Ew.m2456b(c0311Ew.f2975c));
        hashSet.addAll(C0311Ew.m2456b(c0311Ew.f2976d));
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C7232yw c7232ywM26006d = c0311Ew.f2975c.m26006d();
            String string2 = null;
            if (c7232ywM26006d == null) {
                string = null;
            } else {
                try {
                    string = c7232ywM26006d.f46543b.getString(str);
                } catch (JSONException unused) {
                }
            }
            if (string != null) {
                C7232yw c7232ywM26006d2 = c0311Ew.f2975c.m26006d();
                if (c7232ywM26006d2 != null) {
                    synchronized (c0311Ew.f2973a) {
                        try {
                            Iterator it2 = c0311Ew.f2973a.iterator();
                            while (it2.hasNext()) {
                                c0311Ew.f2974b.execute(new RunnableC8339Ts1((BiConsumer) it2.next(), str, c7232ywM26006d2, 12));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                c7142xV = new C7142xV(string, 2);
            } else {
                C7232yw c7232ywM26006d3 = c0311Ew.f2976d.m26006d();
                if (c7232ywM26006d3 != null) {
                    try {
                        string2 = c7232ywM26006d3.f46543b.getString(str);
                    } catch (JSONException unused2) {
                    }
                }
                c7142xV = string2 != null ? new C7142xV(string2, 1) : new C7142xV("", 0);
            }
            map.put(str, c7142xV);
        }
        return map;
    }

    /* renamed from: c */
    public final C6890tV m23807c() {
        C6890tV c6890tV;
        C0877Nw c0877Nw = this.f40122i;
        synchronized (c0877Nw.f8137b) {
            try {
                long j = c0877Nw.f8136a.getLong("last_fetch_time_in_millis", -1L);
                int i = c0877Nw.f8136a.getInt("last_fetch_status", 0);
                C7005vK c7005vK = new C7005vK(2);
                long j2 = c0877Nw.f8136a.getLong("fetch_timeout_in_seconds", 60L);
                if (j2 < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j2)));
                }
                c7005vK.f44329b = j2;
                c7005vK.m25399a(c0877Nw.f8136a.getLong("minimum_fetch_interval_in_seconds", C0248Dw.f2311j));
                c6890tV = new C6890tV(j, i, new C7005vK(c7005vK));
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6890tV;
    }

    /* renamed from: e */
    public final void m23808e(boolean z) {
        C10910rT1 c10910rT1 = this.f40124k;
        synchronized (c10910rT1) {
            ((C0563Iw) c10910rT1.f41680d).f5214e = z;
            if (!z) {
                c10910rT1.m24382o();
            }
        }
    }

    /* renamed from: f */
    public final C9450g32 m23809f(HashMap map) {
        try {
            C7442Cm0 c7442Cm0M26286c = C7232yw.m26286c();
            c7442Cm0M26286c.f1649b = new JSONObject(map);
            return this.f40119f.m26007f(c7442Cm0M26286c.m1350a()).m18387n(EnumC1163SU.f10807a, new C0912OU(6));
        } catch (JSONException unused) {
            return AbstractC9376fU1.m18244e(null);
        }
    }
}
