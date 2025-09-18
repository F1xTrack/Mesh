package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC7038vr;
import p000.C8749ad1;

/* renamed from: io.appmetrica.analytics.impl.sn */
/* loaded from: classes2.dex */
public final class C5457sn {

    /* renamed from: a */
    public final C5507un f32586a;

    public C5457sn(C5398qe c5398qe, C4945Y9 c4945y9) {
        this.f32586a = new C5507un(c5398qe, c4945y9, new C8749ad1(9));
    }

    /* renamed from: a */
    public static final JSONObject m21056a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(AnalyticsBaseParamsConstantsKt.DEVICE_ID, JsonUtils.optStringOrNullable(jSONObject2, AnalyticsBaseParamsConstantsKt.DEVICE_ID, JsonUtils.optStringOrNull(jSONObject, AnalyticsBaseParamsConstantsKt.DEVICE_ID)));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC5020bb.m20168a(jSONObject2, "last_migration_api_level", AbstractC5020bb.m20168a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    /* renamed from: b */
    public final synchronized void m21061b(String str) {
        C5507un c5507un = this.f32586a;
        c5507un.m21152a(c5507un.m21151a().put("device_id_hash", str));
    }

    /* renamed from: c */
    public final synchronized boolean m21062c() {
        return this.f32586a.m21151a().optBoolean("referrer_checked", false);
    }

    /* renamed from: d */
    public final synchronized void m21063d() {
        C5507un c5507un = this.f32586a;
        c5507un.m21152a(c5507un.m21151a().put("referrer_checked", true));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0026  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized io.appmetrica.analytics.impl.C4472Ef m21060b() {
        /*
            r2 = this;
            monitor-enter(r2)
            io.appmetrica.analytics.impl.un r0 = r2.f32586a     // Catch: java.lang.Throwable -> L29
            org.json.JSONObject r0 = r0.m21151a()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "referrer"
            java.lang.String r0 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r0, r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L26
            java.nio.charset.Charset r1 = p000.AbstractC7038vr.f44561a     // Catch: java.lang.Throwable -> L26
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L26
            r1 = 0
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L26
            int r1 = r0.length     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L20
            goto L26
        L20:
            io.appmetrica.analytics.impl.Ef r1 = new io.appmetrica.analytics.impl.Ef     // Catch: java.lang.Throwable -> L26
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r1 = 0
        L27:
            monitor-exit(r2)
            return r1
        L29:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5457sn.m21060b():io.appmetrica.analytics.impl.Ef");
    }

    /* renamed from: a */
    public final synchronized void m21059a(String str) {
        C5507un c5507un = this.f32586a;
        c5507un.m21152a(c5507un.m21151a().put(AnalyticsBaseParamsConstantsKt.DEVICE_ID, str));
    }

    /* renamed from: a */
    public final synchronized String m21057a() {
        return JsonUtils.optStringOrNull(this.f32586a.m21151a(), "device_id_hash");
    }

    /* renamed from: a */
    public final synchronized void m21058a(C4472Ef c4472Ef) {
        try {
            C5507un c5507un = this.f32586a;
            c5507un.m21152a(c5507un.m21151a().put("referrer", c4472Ef != null ? new String(Base64.encode(c4472Ef.m19359a(), 0), AbstractC7038vr.f44561a) : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
