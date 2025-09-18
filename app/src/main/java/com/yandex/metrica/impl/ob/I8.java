package com.yandex.metrica.impl.ob;

import android.content.Context;
import defpackage.AbstractC8235ym;
import defpackage.O90;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class I8 extends J8 {
    private final Set<String> e;

    public I8(Context context, String str, L0 l0) {
        super(context, AbstractC8235ym.k("appmetrica_vital_", str, ".dat"), l0);
        this.e = defpackage.J8.F(new String[]{"first_event_done", "init_event_done", "report_request_id", "global_number", "numbers_of_type", "session_id", "referrer_handled", "open_id", "attribution_id", "last_migration_api_level"});
    }

    @Override // com.yandex.metrica.impl.ob.J8
    public Set<String> a() {
        return this.e;
    }

    public final synchronized void b(boolean z) {
        JSONObject jSONObjectPut = b().put("init_event_done", z);
        O90.e(jSONObjectPut, "getOrLoadData().put(INIT_EVENT_DONE, value)");
        a(jSONObjectPut);
    }

    public final synchronized void c(int i) {
        JSONObject jSONObjectPut = b().put("report_request_id", i);
        O90.e(jSONObjectPut, "getOrLoadData().put(KEY_REPORT_REQUEST_ID, value)");
        a(jSONObjectPut);
    }

    public final synchronized int d() {
        return b().optInt("global_number", 0);
    }

    public final synchronized int e() {
        return b().optInt("last_migration_api_level", 0);
    }

    public final synchronized JSONObject f() {
        return b().optJSONObject("numbers_of_type");
    }

    public final synchronized int g() {
        return b().optInt("open_id", 1);
    }

    public final synchronized boolean h() {
        return b().optBoolean("referrer_handled", false);
    }

    public final synchronized int i() {
        return b().optInt("report_request_id", -1);
    }

    public final synchronized long j() {
        return b().optLong("session_id", -1L);
    }

    public final synchronized void k() {
        synchronized (this) {
        }
        int iOptInt = b().optInt("attribution_id", 1) + 1;
        synchronized (this) {
            JSONObject jSONObjectPut = b().put("attribution_id", iOptInt);
            O90.e(jSONObjectPut, "getOrLoadData().put(KEY_ATTRIBUTION_ID, value)");
            a(jSONObjectPut);
        }
    }

    public final synchronized void l() {
        synchronized (this) {
        }
        int iOptInt = b().optInt("open_id", 1) + 1;
        synchronized (this) {
            JSONObject jSONObjectPut = b().put("open_id", iOptInt);
            O90.e(jSONObjectPut, "getOrLoadData().put(KEY_OPEN_ID, value)");
            a(jSONObjectPut);
        }
    }

    public final synchronized boolean m() {
        return b().optBoolean("first_event_done", false);
    }

    public final synchronized boolean n() {
        return b().optBoolean("init_event_done", false);
    }

    public final synchronized void a(boolean z) {
        JSONObject jSONObjectPut = b().put("first_event_done", z);
        O90.e(jSONObjectPut, "getOrLoadData().put(FIRST_EVENT_DONE, value)");
        a(jSONObjectPut);
    }

    public final synchronized void b(JSONObject jSONObject) {
        JSONObject jSONObjectPut = b().put("numbers_of_type", jSONObject);
        O90.e(jSONObjectPut, "getOrLoadData().put(KEY_NUMBERS_OF_TYPE, value)");
        a(jSONObjectPut);
    }

    public final synchronized void c(boolean z) {
        JSONObject jSONObjectPut = b().put("referrer_handled", z);
        O90.e(jSONObjectPut, "getOrLoadData().put(KEY_REFERRER_HANDLED, value)");
        a(jSONObjectPut);
    }

    public final synchronized void a(int i) {
        JSONObject jSONObjectPut = b().put("global_number", i);
        O90.e(jSONObjectPut, "getOrLoadData().put(KEY_GLOBAL_NUMBER, value)");
        a(jSONObjectPut);
    }

    public final synchronized void b(int i) {
        JSONObject jSONObjectPut = b().put("last_migration_api_level", i);
        O90.e(jSONObjectPut, "getOrLoadData().put(KEY_…GRATION_API_LEVEL, value)");
        a(jSONObjectPut);
    }

    public final synchronized int c() {
        return b().optInt("attribution_id", 1);
    }

    public final synchronized void a(long j) {
        JSONObject jSONObjectPut = b().put("session_id", j);
        O90.e(jSONObjectPut, "getOrLoadData().put(KEY_SESSION_ID, value)");
        a(jSONObjectPut);
    }

    public final synchronized void a(boolean z, boolean z2, Integer num, Integer num2, Long l, Boolean bool, JSONObject jSONObject, Integer num3, Integer num4, Integer num5) {
        JSONObject jSONObjectPut = new JSONObject().put("first_event_done", z).put("init_event_done", z2).put("report_request_id", num).put("global_number", num2).put("session_id", l).put("referrer_handled", bool).put("open_id", num3).put("attribution_id", num4).put("numbers_of_type", jSONObject).put("last_migration_api_level", num5);
        O90.e(jSONObjectPut, "json");
        a(jSONObjectPut);
    }
}
