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

/* renamed from: io.appmetrica.analytics.impl.ne */
/* loaded from: classes2.dex */
public final class C5323ne extends AbstractC5022bd implements InterfaceC5582xn {

    /* renamed from: d */
    public static final long f32278d = 0;

    /* renamed from: e */
    public static final int f32279e = -1;

    /* renamed from: f */
    public static final String f32280f = "";

    /* renamed from: g */
    public static final String f32281g = "";

    /* renamed from: h */
    public static final C5373pe f32282h = new C5373pe("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: i */
    public static final C5373pe f32283i = new C5373pe("PROFILE_ID", null);

    /* renamed from: j */
    public static final C5373pe f32284j = new C5373pe("APP_ENVIRONMENT", null);

    /* renamed from: k */
    public static final C5373pe f32285k = new C5373pe("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l */
    public static final C5373pe f32286l = new C5373pe("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m */
    public static final C5373pe f32287m = new C5373pe("APPLICATION_FEATURES", null);

    /* renamed from: n */
    public static final C5373pe f32288n = new C5373pe("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: o */
    public static final C5373pe f32289o = new C5373pe("VITAL_DATA", null);

    /* renamed from: p */
    public static final C5373pe f32290p = new C5373pe("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* renamed from: q */
    public static final String f32291q = "SESSION_";

    public C5323ne(InterfaceC4467Ea interfaceC4467Ea) {
        super(interfaceC4467Ea);
    }

    /* renamed from: a */
    public final C5323ne m20820a(C4984a0 c4984a0) {
        synchronized (this) {
            m20873b(f32284j.f32397b, c4984a0.f31232a);
            m20872b(f32285k.f32397b, c4984a0.f31233b);
        }
        return this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5348oe
    /* renamed from: c */
    public final Set<String> mo20823c() {
        return this.f32347a.mo19347a();
    }

    /* renamed from: d */
    public final C4984a0 m20824d() {
        C4984a0 c4984a0;
        synchronized (this) {
            c4984a0 = new C4984a0(this.f32347a.getString(f32284j.f32397b, "{}"), this.f32347a.getLong(f32285k.f32397b, 0L));
        }
        return c4984a0;
    }

    /* renamed from: e */
    public final String m20826e() {
        return this.f32347a.getString(f32287m.f32397b, "");
    }

    /* renamed from: f */
    public final List<String> m20827f() {
        String str = f32288n.f32397b;
        List listEmptyList = Collections.emptyList();
        String[] strArr = listEmptyList == null ? null : (String[]) listEmptyList.toArray(new String[listEmptyList.size()]);
        String string = this.f32347a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.optString(i);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: g */
    public final int m20828g() {
        return this.f32347a.getInt(f32286l.f32397b, -1);
    }

    /* renamed from: h */
    public final long m20829h() {
        return this.f32347a.getLong(f32282h.f32397b, 0L);
    }

    /* renamed from: i */
    public final C5323ne m20831i(String str) {
        return (C5323ne) m20873b(f32287m.f32397b, str);
    }

    /* renamed from: j */
    public final C5323ne m20833j(String str) {
        return (C5323ne) m20873b(f32283i.f32397b, str);
    }

    /* renamed from: h */
    public final String m20830h(String str) {
        return this.f32347a.getString(new C5373pe(f32291q, str).f32397b, "");
    }

    /* renamed from: i */
    public final String m20832i() {
        return this.f32347a.getString(f32283i.f32397b, null);
    }

    /* renamed from: j */
    public final Map<Integer, String> m20834j() {
        HashMap map = new HashMap();
        try {
            String string = this.f32347a.getString(f32290p.f32397b, null);
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

    /* renamed from: e */
    public final C5323ne m20825e(String str, String str2) {
        return (C5323ne) m20873b(new C5373pe(f32291q, str).f32397b, str2);
    }

    /* renamed from: a */
    public final C5323ne m20819a(long j) {
        return (C5323ne) m20872b(f32282h.f32397b, j);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5022bd
    /* renamed from: f */
    public final String mo20188f(String str) {
        return new C5373pe(str, null).f32397b;
    }

    /* renamed from: a */
    public final C5323ne m20818a(int i) {
        return (C5323ne) m20871b(f32286l.f32397b, i);
    }

    /* renamed from: a */
    public final C5323ne m20821a(List<String> list) {
        return (C5323ne) m20867a(f32288n.f32397b, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5582xn
    /* renamed from: a */
    public final String mo20031a() {
        return this.f32347a.getString(f32289o.f32397b, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5582xn
    /* renamed from: a */
    public final void mo20032a(String str) {
        m20873b(f32289o.f32397b, str);
    }

    /* renamed from: a */
    public final void m20822a(Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        m20873b(f32290p.f32397b, jSONObject.toString());
    }
}
