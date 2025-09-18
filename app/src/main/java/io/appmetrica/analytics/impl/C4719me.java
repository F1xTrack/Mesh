package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.me, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4719me extends AbstractC4452bd {
    public static final C4791pe d = new C4791pe("UUID_RESULT", null);
    public static final C4791pe e = new C4791pe("DEVICE_ID_RESULT", null);
    public static final C4791pe f = new C4791pe("DEVICE_ID_HASH_RESULT", null);
    public static final C4791pe g = new C4791pe("AD_URL_GET_RESULT", null);
    public static final C4791pe h = new C4791pe("AD_URL_REPORT_RESULT", null);
    public static final C4791pe i = new C4791pe("CUSTOM_HOSTS", null);
    public static final C4791pe j = new C4791pe("SERVER_TIME_OFFSET", null);
    public static final C4791pe k = new C4791pe("RESPONSE_CLIDS_RESULT", null);
    public static final C4791pe l = new C4791pe("CUSTOM_SDK_HOSTS", null);
    public static final C4791pe m = new C4791pe("CLIENT_CLIDS", null);
    public static final C4791pe n = new C4791pe("DEFERRED_DEEP_LINK_WAS_CHECKED", null);
    public static final C4791pe o = new C4791pe("API_LEVEL", null);
    public static final C4791pe p = new C4791pe("NEXT_STARTUP_TIME", null);
    public static final C4791pe q = new C4791pe("GAID", null);
    public static final C4791pe r = new C4791pe("HOAID", null);
    public static final C4791pe s = new C4791pe("YANDEX_ADV_ID", null);
    public static final C4791pe t = new C4791pe("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);
    public static final C4791pe u = new C4791pe("SCREEN_INFO", null);
    public static final C4791pe v = new C4791pe("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);
    public static final C4791pe w = new C4791pe("FEATURES", null);
    public static final C4791pe x = new C4791pe("APPMETRICA_CLIENT_CONFIG", null);

    public C4719me(Ea ea) {
        super(ea);
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(t.b, z);
    }

    public final long b(long j2) {
        return this.a.getLong(j.a, j2);
    }

    public final C4719me c(IdentifiersResult identifiersResult) {
        return a(l.b, identifiersResult);
    }

    public final IdentifiersResult d() {
        return h(g.b);
    }

    public final IdentifiersResult e() {
        return h(h.b);
    }

    public final C4719me f(IdentifiersResult identifiersResult) {
        return a(q.b, identifiersResult);
    }

    public final IdentifiersResult h() {
        return h(l.b);
    }

    public final IdentifiersResult i() {
        return h(f.b);
    }

    public final IdentifiersResult j() {
        return h(e.b);
    }

    public final S9 k() {
        String string = this.a.getString(w.b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new S9(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new S9(null, IdentifierStatus.UNKNOWN, null);
    }

    public final IdentifiersResult l() {
        return h(q.b);
    }

    public final IdentifiersResult m() {
        return h(r.b);
    }

    public final long n() {
        return this.a.getLong(p.b, 0L);
    }

    public final IdentifiersResult o() {
        return h(k.b);
    }

    public final ScreenInfo p() {
        return AbstractC4450bb.e(this.a.getString(u.b, null));
    }

    public final IdentifiersResult q() {
        return h(d.b);
    }

    public final IdentifiersResult r() {
        return h(s.b);
    }

    public final boolean s() {
        return this.a.getBoolean(n.b, false);
    }

    public final boolean t() {
        return this.a.getBoolean(v.b, false);
    }

    public final C4719me u() {
        return (C4719me) b(n.b, true);
    }

    public final void v() {
        b(v.b, true);
    }

    public final List<String> g() {
        String string = this.a.getString(i.b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC4450bb.b(string);
    }

    public final long a(long j2) {
        return this.a.getLong(o.b, j2);
    }

    public final C4719me b(IdentifiersResult identifiersResult) {
        return a(h.b, identifiersResult);
    }

    public final C4719me c(long j2) {
        return (C4719me) b(o.b, j2);
    }

    public final C4719me d(IdentifiersResult identifiersResult) {
        return a(f.b, identifiersResult);
    }

    public final C4719me e(IdentifiersResult identifiersResult) {
        return a(e.b, identifiersResult);
    }

    public final AppMetricaConfig f() {
        String string = this.a.getString(x.b, null);
        if (string == null) {
            return null;
        }
        return AppMetricaConfig.fromJson(string);
    }

    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.a.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
        } else {
            identifiersResult = null;
        }
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
    }

    public final C4719me i(IdentifiersResult identifiersResult) {
        return a(d.b, identifiersResult);
    }

    public final C4719me j(IdentifiersResult identifiersResult) {
        return a(s.b, identifiersResult);
    }

    public final C4719me g(IdentifiersResult identifiersResult) {
        return a(r.b, identifiersResult);
    }

    public final C4719me a(IdentifiersResult identifiersResult) {
        return a(g.b, identifiersResult);
    }

    public final C4719me b(boolean z) {
        return (C4719me) b(t.b, z);
    }

    public final C4719me d(long j2) {
        return (C4719me) b(p.b, j2);
    }

    public final C4719me e(long j2) {
        return (C4719me) b(j.b, j2);
    }

    public final String i(String str) {
        return this.a.getString(m.b, str);
    }

    public final C4719me j(String str) {
        return (C4719me) b(m.b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4452bd
    public final String f(String str) {
        return new C4791pe(str, null).b;
    }

    public final C4719me a(List<String> list) {
        return (C4719me) b(i.b, hn.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    public final C4719me h(IdentifiersResult identifiersResult) {
        return a(k.b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4452bd
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C4719me g(String str) {
        return (C4719me) d(new C4791pe(str, null).b);
    }

    public final C4719me a(S9 s9) {
        String str = w.b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", s9.a).put("STATUS", s9.b.getValue()).putOpt("ERROR_EXPLANATION", s9.c);
        } catch (Throwable unused) {
        }
        return (C4719me) b(str, jSONObject.toString());
    }

    public final void a(ScreenInfo screenInfo) {
        b(u.b, AbstractC4450bb.a(screenInfo));
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        b(x.b, appMetricaConfig.toJson());
    }

    public final C4719me a(String str, IdentifiersResult identifiersResult) {
        String string;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", identifiersResult.id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(str, string);
        }
        return this;
    }
}
