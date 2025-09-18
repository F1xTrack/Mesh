package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.util.Base64;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.util.Set;
import org.json.JSONObject;
import p000.AbstractC0576J8;
import p000.AbstractC7038vr;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.H8 */
/* loaded from: classes2.dex */
public final class C2650H8 extends AbstractC2700J8 {

    /* renamed from: e */
    private final Set<String> f21350e;

    public C2650H8(Context context, C2742L0 c2742l0) {
        super(context, "appmetrica_vital.dat", c2742l0);
        this.f21350e = AbstractC0576J8.m4175F(new String[]{AnalyticsBaseParamsConstantsKt.DEVICE_ID, "device_id_hash", "location_id", "lbs_id", "referrer", "referrer_checked", "location_request_id", "last_migration_api_level"});
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2700J8
    /* renamed from: a */
    public Set<String> mo14232a() {
        return this.f21350e;
    }

    /* renamed from: b */
    public final synchronized void m14239b(String str) {
        JSONObject jSONObjectPut = m14422b().put("device_id_hash", str);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_DEVICE_ID_HASH, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: c */
    public final synchronized String m14240c() {
        return C3762ym.m17300e(m14422b(), AnalyticsBaseParamsConstantsKt.DEVICE_ID);
    }

    /* renamed from: d */
    public final synchronized String m14241d() {
        return C3762ym.m17300e(m14422b(), "device_id_hash");
    }

    /* renamed from: e */
    public final synchronized int m14242e() {
        return m14422b().optInt("last_migration_api_level", -1);
    }

    /* renamed from: f */
    public final synchronized long m14243f() {
        return m14422b().optLong("location_request_id", -1L);
    }

    /* renamed from: g */
    public final synchronized C2608Fg m14244g() {
        C2608Fg c2608FgM14133a;
        String strM17300e = C3762ym.m17300e(m14422b(), "referrer");
        if (strM17300e != null) {
            try {
                byte[] bytes = strM17300e.getBytes(AbstractC7038vr.f44561a);
                O90.m5967e(bytes, "(this as java.lang.String).getBytes(charset)");
                c2608FgM14133a = C2608Fg.m14133a(Base64.decode(bytes, 0));
            } catch (Throwable unused) {
            }
        } else {
            c2608FgM14133a = null;
        }
        return c2608FgM14133a;
    }

    /* renamed from: h */
    public final synchronized boolean m14245h() {
        return m14422b().optBoolean("referrer_checked", false);
    }

    /* renamed from: a */
    public final synchronized void m14236a(String str) {
        JSONObject jSONObjectPut = m14422b().put(AnalyticsBaseParamsConstantsKt.DEVICE_ID, str);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_DEVICE_ID, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: a */
    public final synchronized void m14235a(C2608Fg c2608Fg) {
        String str;
        try {
            JSONObject jSONObjectM14422b = m14422b();
            if (c2608Fg != null) {
                byte[] bArrEncode = Base64.encode(c2608Fg.m14134a(), 0);
                O90.m5967e(bArrEncode, "Base64.encode(toProto(), 0)");
                str = new String(bArrEncode, AbstractC7038vr.f44561a);
            } else {
                str = null;
            }
            JSONObject jSONObjectPut = jSONObjectM14422b.put("referrer", str);
            O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_…value?.toEncodedString())");
            m14421a(jSONObjectPut);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m14238a(boolean z) {
        JSONObject jSONObjectPut = m14422b().put("referrer_checked", z);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_REFERRER_CHECKED, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: a */
    public final synchronized void m14234a(long j) {
        JSONObject jSONObjectPut = m14422b().put("location_request_id", j);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_…CATION_REQUEST_ID, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: a */
    public final synchronized void m14233a(int i) {
        JSONObject jSONObjectPut = m14422b().put("last_migration_api_level", i);
        O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_…GRATION_API_LEVEL, value)");
        m14421a(jSONObjectPut);
    }

    /* renamed from: a */
    public final synchronized void m14237a(String str, String str2, String str3, Boolean bool, Long l, Long l2, Long l3, Integer num) {
        JSONObject jSONObjectPut = new JSONObject().put(AnalyticsBaseParamsConstantsKt.DEVICE_ID, str).put("device_id_hash", str2).put("referrer", str3).put("referrer_checked", bool).put("location_id", l).put("lbs_id", l2).put("location_request_id", l3).put("last_migration_api_level", num);
        O90.m5967e(jSONObjectPut, "json");
        m14421a(jSONObjectPut);
    }
}
