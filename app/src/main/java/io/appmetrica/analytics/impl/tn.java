package io.appmetrica.analytics.impl;

import defpackage.C2171ad1;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class tn {
    public final un a;

    public tn(C4743ne c4743ne, xn xnVar, String str) {
        this.a = new un(c4743ne, xnVar, new C2171ad1(10));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", AbstractC4450bb.a(jSONObject2, "report_request_id", AbstractC4450bb.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", AbstractC4450bb.a(jSONObject2, "open_id", AbstractC4450bb.a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", AbstractC4450bb.a(jSONObject2, "attribution_id", AbstractC4450bb.a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", AbstractC4450bb.a(jSONObject2, "last_migration_api_level", AbstractC4450bb.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    public final synchronized void b(long j) {
        un unVar = this.a;
        unVar.a(unVar.a().put("global_number", j));
    }

    public final synchronized boolean c() {
        return this.a.a().optBoolean("first_event_done", false);
    }

    public final synchronized boolean d() {
        return this.a.a().optBoolean("init_event_done", false);
    }

    public final synchronized int b() {
        return this.a.a().optInt("open_id", 1);
    }

    public final synchronized void c(long j) {
        un unVar = this.a;
        unVar.a(unVar.a().put("session_id", j));
    }

    public final synchronized void b(int i) {
        un unVar = this.a;
        unVar.a(unVar.a().put("last_migration_api_level", i));
    }

    public final synchronized void c(int i) {
        un unVar = this.a;
        unVar.a(unVar.a().put("open_id", i));
    }

    public final synchronized void a(JSONObject jSONObject) {
        un unVar = this.a;
        unVar.a(unVar.a().put("numbers_of_type", jSONObject));
    }

    public final synchronized int a() {
        return this.a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(int i) {
        un unVar = this.a;
        unVar.a(unVar.a().put("attribution_id", i));
    }

    public final synchronized void a(long j) {
        un unVar = this.a;
        unVar.a(unVar.a().put("external_attribution_window_start", j));
    }
}
