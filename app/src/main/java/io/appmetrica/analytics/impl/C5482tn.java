package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C8749ad1;

/* renamed from: io.appmetrica.analytics.impl.tn */
/* loaded from: classes2.dex */
public final class C5482tn {

    /* renamed from: a */
    public final C5507un f32656a;

    public C5482tn(C5323ne c5323ne, InterfaceC5582xn interfaceC5582xn, String str) {
        this.f32656a = new C5507un(c5323ne, interfaceC5582xn, new C8749ad1(10));
    }

    /* renamed from: a */
    public static final JSONObject m21094a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", AbstractC5020bb.m20168a(jSONObject2, "report_request_id", AbstractC5020bb.m20168a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", AbstractC5020bb.m20168a(jSONObject2, "open_id", AbstractC5020bb.m20168a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", AbstractC5020bb.m20168a(jSONObject2, "attribution_id", AbstractC5020bb.m20168a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", AbstractC5020bb.m20168a(jSONObject2, "last_migration_api_level", AbstractC5020bb.m20168a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    /* renamed from: b */
    public final synchronized void m21101b(long j) {
        C5507un c5507un = this.f32656a;
        c5507un.m21152a(c5507un.m21151a().put("global_number", j));
    }

    /* renamed from: c */
    public final synchronized boolean m21104c() {
        return this.f32656a.m21151a().optBoolean("first_event_done", false);
    }

    /* renamed from: d */
    public final synchronized boolean m21105d() {
        return this.f32656a.m21151a().optBoolean("init_event_done", false);
    }

    /* renamed from: b */
    public final synchronized int m21099b() {
        return this.f32656a.m21151a().optInt("open_id", 1);
    }

    /* renamed from: c */
    public final synchronized void m21103c(long j) {
        C5507un c5507un = this.f32656a;
        c5507un.m21152a(c5507un.m21151a().put("session_id", j));
    }

    /* renamed from: b */
    public final synchronized void m21100b(int i) {
        C5507un c5507un = this.f32656a;
        c5507un.m21152a(c5507un.m21151a().put("last_migration_api_level", i));
    }

    /* renamed from: c */
    public final synchronized void m21102c(int i) {
        C5507un c5507un = this.f32656a;
        c5507un.m21152a(c5507un.m21151a().put("open_id", i));
    }

    /* renamed from: a */
    public final synchronized void m21098a(JSONObject jSONObject) {
        C5507un c5507un = this.f32656a;
        c5507un.m21152a(c5507un.m21151a().put("numbers_of_type", jSONObject));
    }

    /* renamed from: a */
    public final synchronized int m21095a() {
        return this.f32656a.m21151a().optInt("attribution_id", 1);
    }

    /* renamed from: a */
    public final synchronized void m21096a(int i) {
        C5507un c5507un = this.f32656a;
        c5507un.m21152a(c5507un.m21151a().put("attribution_id", i));
    }

    /* renamed from: a */
    public final synchronized void m21097a(long j) {
        C5507un c5507un = this.f32656a;
        c5507un.m21152a(c5507un.m21151a().put("external_attribution_window_start", j));
    }
}
