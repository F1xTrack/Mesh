package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.util.Base64;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import defpackage.AbstractC7680vr;
import defpackage.O90;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class H8 extends J8 {
    private final Set<String> e;

    public H8(Context context, L0 l0) {
        super(context, "appmetrica_vital.dat", l0);
        this.e = defpackage.J8.F(new String[]{AnalyticsBaseParamsConstantsKt.DEVICE_ID, "device_id_hash", "location_id", "lbs_id", "referrer", "referrer_checked", "location_request_id", "last_migration_api_level"});
    }

    @Override // com.yandex.metrica.impl.ob.J8
    public Set<String> a() {
        return this.e;
    }

    public final synchronized void b(String str) {
        JSONObject jSONObjectPut = b().put("device_id_hash", str);
        O90.e(jSONObjectPut, "getOrLoadData().put(KEY_DEVICE_ID_HASH, value)");
        a(jSONObjectPut);
    }

    public final synchronized String c() {
        return C3240ym.e(b(), AnalyticsBaseParamsConstantsKt.DEVICE_ID);
    }

    public final synchronized String d() {
        return C3240ym.e(b(), "device_id_hash");
    }

    public final synchronized int e() {
        return b().optInt("last_migration_api_level", -1);
    }

    public final synchronized long f() {
        return b().optLong("location_request_id", -1L);
    }

    public final synchronized Fg g() {
        Fg fgA;
        String strE = C3240ym.e(b(), "referrer");
        if (strE != null) {
            try {
                byte[] bytes = strE.getBytes(AbstractC7680vr.a);
                O90.e(bytes, "(this as java.lang.String).getBytes(charset)");
                fgA = Fg.a(Base64.decode(bytes, 0));
            } catch (Throwable unused) {
            }
        } else {
            fgA = null;
        }
        return fgA;
    }

    public final synchronized boolean h() {
        return b().optBoolean("referrer_checked", false);
    }

    public final synchronized void a(String str) {
        JSONObject jSONObjectPut = b().put(AnalyticsBaseParamsConstantsKt.DEVICE_ID, str);
        O90.e(jSONObjectPut, "getOrLoadData().put(KEY_DEVICE_ID, value)");
        a(jSONObjectPut);
    }

    public final synchronized void a(Fg fg) {
        String str;
        try {
            JSONObject jSONObjectB = b();
            if (fg != null) {
                byte[] bArrEncode = Base64.encode(fg.a(), 0);
                O90.e(bArrEncode, "Base64.encode(toProto(), 0)");
                str = new String(bArrEncode, AbstractC7680vr.a);
            } else {
                str = null;
            }
            JSONObject jSONObjectPut = jSONObjectB.put("referrer", str);
            O90.e(jSONObjectPut, "getOrLoadData().put(KEY_…value?.toEncodedString())");
            a(jSONObjectPut);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(boolean z) {
        JSONObject jSONObjectPut = b().put("referrer_checked", z);
        O90.e(jSONObjectPut, "getOrLoadData().put(KEY_REFERRER_CHECKED, value)");
        a(jSONObjectPut);
    }

    public final synchronized void a(long j) {
        JSONObject jSONObjectPut = b().put("location_request_id", j);
        O90.e(jSONObjectPut, "getOrLoadData().put(KEY_…CATION_REQUEST_ID, value)");
        a(jSONObjectPut);
    }

    public final synchronized void a(int i) {
        JSONObject jSONObjectPut = b().put("last_migration_api_level", i);
        O90.e(jSONObjectPut, "getOrLoadData().put(KEY_…GRATION_API_LEVEL, value)");
        a(jSONObjectPut);
    }

    public final synchronized void a(String str, String str2, String str3, Boolean bool, Long l, Long l2, Long l3, Integer num) {
        JSONObject jSONObjectPut = new JSONObject().put(AnalyticsBaseParamsConstantsKt.DEVICE_ID, str).put("device_id_hash", str2).put("referrer", str3).put("referrer_checked", bool).put("location_id", l).put("lbs_id", l2).put("location_request_id", l3).put("last_migration_api_level", num);
        O90.e(jSONObjectPut, "json");
        a(jSONObjectPut);
    }
}
