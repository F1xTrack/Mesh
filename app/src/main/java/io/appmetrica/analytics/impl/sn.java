package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import defpackage.AbstractC7680vr;
import defpackage.C2171ad1;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class sn {
    public final un a;

    public sn(C4815qe c4815qe, Y9 y9) {
        this.a = new un(c4815qe, y9, new C2171ad1(9));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(AnalyticsBaseParamsConstantsKt.DEVICE_ID, JsonUtils.optStringOrNullable(jSONObject2, AnalyticsBaseParamsConstantsKt.DEVICE_ID, JsonUtils.optStringOrNull(jSONObject, AnalyticsBaseParamsConstantsKt.DEVICE_ID)));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC4450bb.a(jSONObject2, "last_migration_api_level", AbstractC4450bb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        un unVar = this.a;
        unVar.a(unVar.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        un unVar = this.a;
        unVar.a(unVar.a().put("referrer_checked", true));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized io.appmetrica.analytics.impl.Ef b() {
        /*
            r2 = this;
            monitor-enter(r2)
            io.appmetrica.analytics.impl.un r0 = r2.a     // Catch: java.lang.Throwable -> L29
            org.json.JSONObject r0 = r0.a()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "referrer"
            java.lang.String r0 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r0, r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L26
            java.nio.charset.Charset r1 = defpackage.AbstractC7680vr.a     // Catch: java.lang.Throwable -> L26
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
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.sn.b():io.appmetrica.analytics.impl.Ef");
    }

    public final synchronized void a(String str) {
        un unVar = this.a;
        unVar.a(unVar.a().put(AnalyticsBaseParamsConstantsKt.DEVICE_ID, str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.a.a(), "device_id_hash");
    }

    public final synchronized void a(Ef ef) {
        try {
            un unVar = this.a;
            unVar.a(unVar.a().put("referrer", ef != null ? new String(Base64.encode(ef.a(), 0), AbstractC7680vr.a) : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
