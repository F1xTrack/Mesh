package defpackage;

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

/* renamed from: pV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6469pV {
    public final Context a;
    public final GU b;
    public final Executor c;
    public final C8075xw d;
    public final C8075xw e;
    public final C8075xw f;
    public final C0320Dw g;
    public final C0398Ew h;
    public final C1099Nw i;
    public final XU j;
    public final C6846rT1 k;
    public final C6860rY0 l;

    public C6469pV(Context context, XU xu, GU gu, Executor executor, C8075xw c8075xw, C8075xw c8075xw2, C8075xw c8075xw3, C0320Dw c0320Dw, C0398Ew c0398Ew, C1099Nw c1099Nw, C6846rT1 c6846rT1, C6860rY0 c6860rY0) {
        this.a = context;
        this.j = xu;
        this.b = gu;
        this.c = executor;
        this.d = c8075xw;
        this.e = c8075xw2;
        this.f = c8075xw3;
        this.g = c0320Dw;
        this.h = c0398Ew;
        this.i = c1099Nw;
        this.k = c6846rT1;
        this.l = c6860rY0;
    }

    public static C6469pV d(MU mu) {
        return ((C7218tQ0) mu.b(C7218tQ0.class)).b("firebase");
    }

    public static ArrayList g(JSONArray jSONArray) throws JSONException {
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

    public final C3892g32 a() {
        C0320Dw c0320Dw = this.g;
        C1099Nw c1099Nw = c0320Dw.h;
        return c0320Dw.a(c1099Nw.a.getLong("minimum_fetch_interval_in_seconds", C0320Dw.j)).n(SU.a, new OU(5));
    }

    public final HashMap b() {
        String string;
        C7994xV c7994xV;
        C0398Ew c0398Ew = this.h;
        HashSet hashSet = new HashSet();
        hashSet.addAll(C0398Ew.b(c0398Ew.c));
        hashSet.addAll(C0398Ew.b(c0398Ew.d));
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C8265yw c8265ywD = c0398Ew.c.d();
            String string2 = null;
            if (c8265ywD == null) {
                string = null;
            } else {
                try {
                    string = c8265ywD.b.getString(str);
                } catch (JSONException unused) {
                }
            }
            if (string != null) {
                C8265yw c8265ywD2 = c0398Ew.c.d();
                if (c8265ywD2 != null) {
                    synchronized (c0398Ew.a) {
                        try {
                            Iterator it2 = c0398Ew.a.iterator();
                            while (it2.hasNext()) {
                                c0398Ew.b.execute(new RunnableC1557Ts1((BiConsumer) it2.next(), str, c8265ywD2, 12));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                c7994xV = new C7994xV(string, 2);
            } else {
                C8265yw c8265ywD3 = c0398Ew.d.d();
                if (c8265ywD3 != null) {
                    try {
                        string2 = c8265ywD3.b.getString(str);
                    } catch (JSONException unused2) {
                    }
                }
                c7994xV = string2 != null ? new C7994xV(string2, 1) : new C7994xV("", 0);
            }
            map.put(str, c7994xV);
        }
        return map;
    }

    public final C7232tV c() {
        C7232tV c7232tV;
        C1099Nw c1099Nw = this.i;
        synchronized (c1099Nw.b) {
            try {
                long j = c1099Nw.a.getLong("last_fetch_time_in_millis", -1L);
                int i = c1099Nw.a.getInt("last_fetch_status", 0);
                C7581vK c7581vK = new C7581vK(2);
                long j2 = c1099Nw.a.getLong("fetch_timeout_in_seconds", 60L);
                if (j2 < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j2)));
                }
                c7581vK.b = j2;
                c7581vK.a(c1099Nw.a.getLong("minimum_fetch_interval_in_seconds", C0320Dw.j));
                c7232tV = new C7232tV(j, i, new C7581vK(c7581vK));
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7232tV;
    }

    public final void e(boolean z) {
        C6846rT1 c6846rT1 = this.k;
        synchronized (c6846rT1) {
            ((C0710Iw) c6846rT1.d).e = z;
            if (!z) {
                c6846rT1.o();
            }
        }
    }

    public final C3892g32 f(HashMap map) {
        try {
            C0213Cm0 c0213Cm0C = C8265yw.c();
            c0213Cm0C.b = new JSONObject(map);
            return this.f.f(c0213Cm0C.a()).n(SU.a, new OU(6));
        } catch (JSONException unused) {
            return AbstractC3782fU1.e(null);
        }
    }
}
