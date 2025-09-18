package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4743ne extends AbstractC4452bd implements xn {
    public static final long d = 0;
    public static final int e = -1;
    public static final String f = "";
    public static final String g = "";
    public static final C4791pe h = new C4791pe("PERMISSIONS_CHECK_TIME", null);
    public static final C4791pe i = new C4791pe("PROFILE_ID", null);
    public static final C4791pe j = new C4791pe("APP_ENVIRONMENT", null);
    public static final C4791pe k = new C4791pe("APP_ENVIRONMENT_REVISION", null);
    public static final C4791pe l = new C4791pe("LAST_APP_VERSION_WITH_FEATURES", null);
    public static final C4791pe m = new C4791pe("APPLICATION_FEATURES", null);
    public static final C4791pe n = new C4791pe("CERTIFICATES_SHA1_FINGERPRINTS", null);
    public static final C4791pe o = new C4791pe("VITAL_DATA", null);
    public static final C4791pe p = new C4791pe("SENT_EXTERNAL_ATTRIBUTIONS", null);
    public static final String q = "SESSION_";

    public C4743ne(Ea ea) {
        super(ea);
    }

    public final C4743ne a(C4414a0 c4414a0) {
        synchronized (this) {
            b(j.b, c4414a0.a);
            b(k.b, c4414a0.b);
        }
        return this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4767oe
    public final Set<String> c() {
        return this.a.a();
    }

    public final C4414a0 d() {
        C4414a0 c4414a0;
        synchronized (this) {
            c4414a0 = new C4414a0(this.a.getString(j.b, "{}"), this.a.getLong(k.b, 0L));
        }
        return c4414a0;
    }

    public final String e() {
        return this.a.getString(m.b, "");
    }

    public final List<String> f() {
        String str = n.b;
        List listEmptyList = Collections.emptyList();
        String[] strArr = listEmptyList == null ? null : (String[]) listEmptyList.toArray(new String[listEmptyList.size()]);
        String string = this.a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr[i2] = jSONArray.optString(i2);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final int g() {
        return this.a.getInt(l.b, -1);
    }

    public final long h() {
        return this.a.getLong(h.b, 0L);
    }

    public final C4743ne i(String str) {
        return (C4743ne) b(m.b, str);
    }

    public final C4743ne j(String str) {
        return (C4743ne) b(i.b, str);
    }

    public final String h(String str) {
        return this.a.getString(new C4791pe(q, str).b, "");
    }

    public final String i() {
        return this.a.getString(i.b, null);
    }

    public final Map<Integer, String> j() {
        HashMap map = new HashMap();
        try {
            String string = this.a.getString(p.b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    public final C4743ne e(String str, String str2) {
        return (C4743ne) b(new C4791pe(q, str).b, str2);
    }

    public final C4743ne a(long j2) {
        return (C4743ne) b(h.b, j2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4452bd
    public final String f(String str) {
        return new C4791pe(str, null).b;
    }

    public final C4743ne a(int i2) {
        return (C4743ne) b(l.b, i2);
    }

    public final C4743ne a(List<String> list) {
        return (C4743ne) a(n.b, list);
    }

    @Override // io.appmetrica.analytics.impl.xn
    public final String a() {
        return this.a.getString(o.b, null);
    }

    @Override // io.appmetrica.analytics.impl.xn
    public final void a(String str) {
        b(o.b, str);
    }

    public final void a(Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(p.b, jSONObject.toString());
    }
}
