package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.Set;
import org.json.JSONObject;
import p000.AbstractC0576J8;
import p000.AbstractC7222ym;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.I8 */
/* loaded from: classes2.dex */
public final class C2675I8 extends AbstractC2700J8 {

    /* renamed from: e */
    private final Set<String> f21404e;

    public C2675I8(Context context, String str, C2742L0 c2742l0) {
        super(context, AbstractC7222ym.m26234k("appmetrica_vital_", str, ".dat"), c2742l0);
        this.f21404e = AbstractC0576J8.m4175F(new String[]{"first_event_done", "init_event_done", "report_request_id", "global_number", "numbers_of_type", "session_id", "referrer_handled", "open_id", "attribution_id", "last_migration_api_level"});
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2700J8
    /* renamed from: a */
    public Set<String> mo14232a() {
        return this.f21404e;
    }

    /* renamed from: b */
    public final synchronized void m14288b(boolean z) {
        JSONObject jSONObjectPut = m14422b().put("init_event_done", z);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(INIT_EVENT_DONE, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: c */
    public final synchronized void m14290c(int i) {
        JSONObject jSONObjectPut = m14422b().put("report_request_id", i);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_REPORT_REQUEST_ID, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: d */
    public final synchronized int m14292d() {
        return m14422b().optInt("global_number", 0);
    }

    /* renamed from: e */
    public final synchronized int m14293e() {
        return m14422b().optInt("last_migration_api_level", 0);
    }

    /* renamed from: f */
    public final synchronized JSONObject m14294f() {
        return m14422b().optJSONObject("numbers_of_type");
    }

    /* renamed from: g */
    public final synchronized int m14295g() {
        return m14422b().optInt("open_id", 1);
    }

    /* renamed from: h */
    public final synchronized boolean m14296h() {
        return m14422b().optBoolean("referrer_handled", false);
    }

    /* renamed from: i */
    public final synchronized int m14297i() {
        return m14422b().optInt("report_request_id", -1);
    }

    /* renamed from: j */
    public final synchronized long m14298j() {
        return m14422b().optLong("session_id", -1L);
    }

    /* renamed from: k */
    public final synchronized void m14299k() {
        synchronized (this) {
        }
        int iOptInt = m14422b().optInt("attribution_id", 1) + 1;
        synchronized (this) {
            JSONObject jSONObjectPut = m14422b().put("attribution_id", iOptInt);
            O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_ATTRIBUTION_ID, value)");
            m14421a(jSONObjectPut);
        }
    }

    /* renamed from: l */
    public final synchronized void m14300l() {
        synchronized (this) {
        }
        int iOptInt = m14422b().optInt("open_id", 1) + 1;
        synchronized (this) {
            JSONObject jSONObjectPut = m14422b().put("open_id", iOptInt);
            O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_OPEN_ID, value)");
            m14421a(jSONObjectPut);
        }
    }

    /* renamed from: m */
    public final synchronized boolean m14301m() {
        return m14422b().optBoolean("first_event_done", false);
    }

    /* renamed from: n */
    public final synchronized boolean m14302n() {
        return m14422b().optBoolean("init_event_done", false);
    }

    /* renamed from: a */
    public final synchronized void m14284a(boolean z) {
        JSONObject jSONObjectPut = m14422b().put("first_event_done", z);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(FIRST_EVENT_DONE, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: b */
    public final synchronized void m14287b(JSONObject jSONObject) {
        JSONObject jSONObjectPut = m14422b().put("numbers_of_type", jSONObject);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_NUMBERS_OF_TYPE, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: c */
    public final synchronized void m14291c(boolean z) {
        JSONObject jSONObjectPut = m14422b().put("referrer_handled", z);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_REFERRER_HANDLED, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: a */
    public final synchronized void m14282a(int i) {
        JSONObject jSONObjectPut = m14422b().put("global_number", i);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_GLOBAL_NUMBER, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: b */
    public final synchronized void m14286b(int i) {
        JSONObject jSONObjectPut = m14422b().put("last_migration_api_level", i);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_…GRATION_API_LEVEL, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: c */
    public final synchronized int m14289c() {
        return m14422b().optInt("attribution_id", 1);
    }

    /* renamed from: a */
    public final synchronized void m14283a(long j) {
        JSONObject jSONObjectPut = m14422b().put("session_id", j);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_SESSION_ID, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: a */
    public final synchronized void m14285a(boolean z, boolean z2, Integer num, Integer num2, Long l, Boolean bool, JSONObject jSONObject, Integer num3, Integer num4, Integer num5) {
        JSONObject jSONObjectPut = new JSONObject().put("first_event_done", z).put("init_event_done", z2).put("report_request_id", num).put("global_number", num2).put("session_id", l).put("referrer_handled", bool).put("open_id", num3).put("attribution_id", num4).put("numbers_of_type", jSONObject).put("last_migration_api_level", num5);
        O90.m5967e(jSONObjectPut, "json");
        m14421a(jSONObjectPut);
    }
}
