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

/* renamed from: io.appmetrica.analytics.impl.me */
/* loaded from: classes2.dex */
public final class C5298me extends AbstractC5022bd {

    /* renamed from: d */
    public static final C5373pe f32202d = new C5373pe("UUID_RESULT", null);

    /* renamed from: e */
    public static final C5373pe f32203e = new C5373pe("DEVICE_ID_RESULT", null);

    /* renamed from: f */
    public static final C5373pe f32204f = new C5373pe("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g */
    public static final C5373pe f32205g = new C5373pe("AD_URL_GET_RESULT", null);

    /* renamed from: h */
    public static final C5373pe f32206h = new C5373pe("AD_URL_REPORT_RESULT", null);

    /* renamed from: i */
    public static final C5373pe f32207i = new C5373pe("CUSTOM_HOSTS", null);

    /* renamed from: j */
    public static final C5373pe f32208j = new C5373pe("SERVER_TIME_OFFSET", null);

    /* renamed from: k */
    public static final C5373pe f32209k = new C5373pe("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l */
    public static final C5373pe f32210l = new C5373pe("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m */
    public static final C5373pe f32211m = new C5373pe("CLIENT_CLIDS", null);

    /* renamed from: n */
    public static final C5373pe f32212n = new C5373pe("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: o */
    public static final C5373pe f32213o = new C5373pe("API_LEVEL", null);

    /* renamed from: p */
    public static final C5373pe f32214p = new C5373pe("NEXT_STARTUP_TIME", null);

    /* renamed from: q */
    public static final C5373pe f32215q = new C5373pe("GAID", null);

    /* renamed from: r */
    public static final C5373pe f32216r = new C5373pe("HOAID", null);

    /* renamed from: s */
    public static final C5373pe f32217s = new C5373pe("YANDEX_ADV_ID", null);

    /* renamed from: t */
    public static final C5373pe f32218t = new C5373pe("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u */
    public static final C5373pe f32219u = new C5373pe("SCREEN_INFO", null);

    /* renamed from: v */
    public static final C5373pe f32220v = new C5373pe("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w */
    public static final C5373pe f32221w = new C5373pe("FEATURES", null);

    /* renamed from: x */
    public static final C5373pe f32222x = new C5373pe("APPMETRICA_CLIENT_CONFIG", null);

    public C5298me(InterfaceC4467Ea interfaceC4467Ea) {
        super(interfaceC4467Ea);
    }

    /* renamed from: a */
    public final boolean m20718a(boolean z) {
        return this.f32347a.getBoolean(f32218t.f32397b, z);
    }

    /* renamed from: b */
    public final long m20719b(long j) {
        return this.f32347a.getLong(f32208j.f32396a, j);
    }

    /* renamed from: c */
    public final C5298me m20723c(IdentifiersResult identifiersResult) {
        return m20714a(f32210l.f32397b, identifiersResult);
    }

    /* renamed from: d */
    public final IdentifiersResult m20726d() {
        return m20736h(f32205g.f32397b);
    }

    /* renamed from: e */
    public final IdentifiersResult m20729e() {
        return m20736h(f32206h.f32397b);
    }

    /* renamed from: f */
    public final C5298me m20731f(IdentifiersResult identifiersResult) {
        return m20714a(f32215q.f32397b, identifiersResult);
    }

    /* renamed from: h */
    public final IdentifiersResult m20735h() {
        return m20736h(f32210l.f32397b);
    }

    /* renamed from: i */
    public final IdentifiersResult m20738i() {
        return m20736h(f32204f.f32397b);
    }

    /* renamed from: j */
    public final IdentifiersResult m20742j() {
        return m20736h(f32203e.f32397b);
    }

    /* renamed from: k */
    public final C4801S9 m20743k() {
        String string = this.f32347a.getString(f32221w.f32397b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C4801S9(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C4801S9(null, IdentifierStatus.UNKNOWN, null);
    }

    /* renamed from: l */
    public final IdentifiersResult m20745l() {
        return m20736h(f32215q.f32397b);
    }

    /* renamed from: m */
    public final IdentifiersResult m20746m() {
        return m20736h(f32216r.f32397b);
    }

    /* renamed from: n */
    public final long m20747n() {
        return this.f32347a.getLong(f32214p.f32397b, 0L);
    }

    /* renamed from: o */
    public final IdentifiersResult m20748o() {
        return m20736h(f32209k.f32397b);
    }

    /* renamed from: p */
    public final ScreenInfo m20749p() {
        return AbstractC5020bb.m20178e(this.f32347a.getString(f32219u.f32397b, null));
    }

    /* renamed from: q */
    public final IdentifiersResult m20750q() {
        return m20736h(f32202d.f32397b);
    }

    /* renamed from: r */
    public final IdentifiersResult m20751r() {
        return m20736h(f32217s.f32397b);
    }

    /* renamed from: s */
    public final boolean m20752s() {
        return this.f32347a.getBoolean(f32212n.f32397b, false);
    }

    /* renamed from: t */
    public final boolean m20753t() {
        return this.f32347a.getBoolean(f32220v.f32397b, false);
    }

    /* renamed from: u */
    public final C5298me m20754u() {
        return (C5298me) m20874b(f32212n.f32397b, true);
    }

    /* renamed from: v */
    public final void m20755v() {
        m20874b(f32220v.f32397b, true);
    }

    /* renamed from: g */
    public final List<String> m20733g() {
        String string = this.f32347a.getString(f32207i.f32397b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC5020bb.m20175b(string);
    }

    /* renamed from: a */
    public final long m20711a(long j) {
        return this.f32347a.getLong(f32213o.f32397b, j);
    }

    /* renamed from: b */
    public final C5298me m20720b(IdentifiersResult identifiersResult) {
        return m20714a(f32206h.f32397b, identifiersResult);
    }

    /* renamed from: c */
    public final C5298me m20722c(long j) {
        return (C5298me) m20872b(f32213o.f32397b, j);
    }

    /* renamed from: d */
    public final C5298me m20725d(IdentifiersResult identifiersResult) {
        return m20714a(f32204f.f32397b, identifiersResult);
    }

    /* renamed from: e */
    public final C5298me m20728e(IdentifiersResult identifiersResult) {
        return m20714a(f32203e.f32397b, identifiersResult);
    }

    /* renamed from: f */
    public final AppMetricaConfig m20730f() {
        String string = this.f32347a.getString(f32222x.f32397b, null);
        if (string == null) {
            return null;
        }
        return AppMetricaConfig.fromJson(string);
    }

    /* renamed from: h */
    public final IdentifiersResult m20736h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.f32347a.getString(str, null);
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

    /* renamed from: i */
    public final C5298me m20737i(IdentifiersResult identifiersResult) {
        return m20714a(f32202d.f32397b, identifiersResult);
    }

    /* renamed from: j */
    public final C5298me m20740j(IdentifiersResult identifiersResult) {
        return m20714a(f32217s.f32397b, identifiersResult);
    }

    /* renamed from: g */
    public final C5298me m20732g(IdentifiersResult identifiersResult) {
        return m20714a(f32216r.f32397b, identifiersResult);
    }

    /* renamed from: a */
    public final C5298me m20713a(IdentifiersResult identifiersResult) {
        return m20714a(f32205g.f32397b, identifiersResult);
    }

    /* renamed from: b */
    public final C5298me m20721b(boolean z) {
        return (C5298me) m20874b(f32218t.f32397b, z);
    }

    /* renamed from: d */
    public final C5298me m20724d(long j) {
        return (C5298me) m20872b(f32214p.f32397b, j);
    }

    /* renamed from: e */
    public final C5298me m20727e(long j) {
        return (C5298me) m20872b(f32208j.f32397b, j);
    }

    /* renamed from: i */
    public final String m20739i(String str) {
        return this.f32347a.getString(f32211m.f32397b, str);
    }

    /* renamed from: j */
    public final C5298me m20741j(String str) {
        return (C5298me) m20873b(f32211m.f32397b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5022bd
    /* renamed from: f */
    public final String mo20188f(String str) {
        return new C5373pe(str, null).f32397b;
    }

    /* renamed from: a */
    public final C5298me m20715a(List<String> list) {
        return (C5298me) m20873b(f32207i.f32397b, AbstractC5182hn.m20513a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    /* renamed from: h */
    public final C5298me m20734h(IdentifiersResult identifiersResult) {
        return m20714a(f32209k.f32397b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5022bd
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C5298me mo20189g(String str) {
        return (C5298me) m20878d(new C5373pe(str, null).f32397b);
    }

    /* renamed from: a */
    public final C5298me m20712a(C4801S9 c4801s9) {
        String str = f32221w.f32397b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c4801s9.f30731a).put("STATUS", c4801s9.f30732b.getValue()).putOpt("ERROR_EXPLANATION", c4801s9.f30733c);
        } catch (Throwable unused) {
        }
        return (C5298me) m20873b(str, jSONObject.toString());
    }

    /* renamed from: a */
    public final void m20717a(ScreenInfo screenInfo) {
        m20873b(f32219u.f32397b, AbstractC5020bb.m20169a(screenInfo));
    }

    /* renamed from: a */
    public final void m20716a(AppMetricaConfig appMetricaConfig) {
        m20873b(f32222x.f32397b, appMetricaConfig.toJson());
    }

    /* renamed from: a */
    public final C5298me m20714a(String str, IdentifiersResult identifiersResult) {
        String string;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", identifiersResult.f32948id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
            }
        } else {
            string = null;
        }
        if (string != null) {
            m20873b(str, string);
        }
        return this;
    }
}
