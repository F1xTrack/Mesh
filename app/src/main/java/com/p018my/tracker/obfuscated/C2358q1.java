package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.my.tracker.obfuscated.q1 */
/* loaded from: classes2.dex */
public final class C2358q1 {

    /* renamed from: b */
    private static volatile C2358q1 f20102b;

    /* renamed from: a */
    private final SharedPreferences f20103a;

    private C2358q1(SharedPreferences sharedPreferences) {
        this.f20103a = sharedPreferences;
    }

    /* renamed from: a */
    public String m13408a() {
        return m13419c(AttributionReporter.APP_VERSION);
    }

    /* renamed from: b */
    public long m13415b() {
        return m13416b("appGalleryTrackedTime");
    }

    /* renamed from: c */
    public String m13418c() {
        return m13419c("appId");
    }

    /* renamed from: d */
    public String m13421d() {
        return m13419c("appSetId");
    }

    /* renamed from: e */
    public long m13424e() {
        return m13416b("appSetIdScope");
    }

    /* renamed from: f */
    public String m13426f() {
        return m13419c("appVersionName");
    }

    /* renamed from: g */
    public String m13428g() {
        return m13419c("appsHash");
    }

    /* renamed from: h */
    public String m13430h() {
        return m13419c("attribution");
    }

    /* renamed from: i */
    public String m13432i() {
        return m13419c("firebaseAppInstanceId");
    }

    /* renamed from: j */
    public long m13434j() {
        return m13416b("installTimestamp");
    }

    /* renamed from: k */
    public String m13436k() {
        return m13419c("instanceId");
    }

    /* renamed from: l */
    public long m13438l() {
        return m13416b("lastUpdateTimestamp");
    }

    /* renamed from: m */
    public String m13440m() {
        return m13419c("referrer");
    }

    /* renamed from: n */
    public long m13441n() {
        long jM13416b = m13416b("lastStopTimeStampSec");
        m13411a("lastStopTimeStampSec", 0L);
        return jM13416b;
    }

    /* renamed from: o */
    public boolean m13442o() {
        return m13414a("apiReferrerSent");
    }

    /* renamed from: p */
    public boolean m13443p() {
        return m13414a("huaweiApiReferrerSent");
    }

    /* renamed from: q */
    public boolean m13444q() {
        return m13414a("preinstallRead");
    }

    /* renamed from: r */
    public boolean m13445r() {
        return m13414a("referrerSent");
    }

    /* renamed from: s */
    public void m13446s() {
        m13413a("apiReferrerSent", true);
    }

    /* renamed from: t */
    public void m13447t() {
        m13413a("huaweiApiReferrerSent", true);
    }

    /* renamed from: u */
    public void m13448u() {
        m13413a("preinstallRead", true);
    }

    /* renamed from: v */
    public void m13449v() {
        m13413a("referrerSent", true);
    }

    /* renamed from: a */
    public boolean m13414a(String str) {
        try {
            return this.f20103a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public long m13416b(String str) {
        try {
            return this.f20103a.getLong(str, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: c */
    public String m13419c(String str) {
        try {
            return this.f20103a.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: d */
    public void m13423d(String str) {
        m13412a(AttributionReporter.APP_VERSION, str);
    }

    /* renamed from: e */
    public void m13425e(String str) {
        m13412a("appId", str);
    }

    /* renamed from: f */
    public void m13427f(String str) {
        m13412a("appSetId", str);
    }

    /* renamed from: g */
    public void m13429g(String str) {
        m13412a("appVersionName", str);
    }

    /* renamed from: h */
    public void m13431h(String str) {
        m13412a("appsHash", str);
    }

    /* renamed from: i */
    public void m13433i(String str) {
        m13412a("attribution", str);
    }

    /* renamed from: j */
    public void m13435j(String str) {
        m13412a("firebaseAppInstanceId", str);
    }

    /* renamed from: k */
    public void m13437k(String str) {
        m13412a("instanceId", str);
    }

    /* renamed from: l */
    public void m13439l(String str) {
        m13412a("referrer", str);
    }

    /* renamed from: a */
    public static C2358q1 m13407a(Context context) {
        C2358q1 c2358q1 = f20102b;
        if (c2358q1 == null) {
            synchronized (C2358q1.class) {
                try {
                    c2358q1 = f20102b;
                    if (c2358q1 == null) {
                        c2358q1 = new C2358q1(context.getSharedPreferences("mytracker_prefs", 0));
                        f20102b = c2358q1;
                    }
                } finally {
                }
            }
        }
        return c2358q1;
    }

    /* renamed from: b */
    public void m13417b(long j) {
        m13411a("installTimestamp", j);
    }

    /* renamed from: c */
    public void m13420c(long j) {
        m13411a("lastUpdateTimestamp", j);
    }

    /* renamed from: d */
    public void m13422d(long j) {
        m13411a("lastStopTimeStampSec", j);
    }

    /* renamed from: a */
    public void m13413a(String str, boolean z) {
        try {
            this.f20103a.edit().putBoolean(str, z).commit();
        } catch (Throwable th) {
            AbstractC2391y2.m13569a("PrefsCache error: ", th);
        }
    }

    /* renamed from: a */
    public void m13411a(String str, long j) {
        try {
            this.f20103a.edit().putLong(str, j).commit();
        } catch (Throwable th) {
            AbstractC2391y2.m13569a("PrefsCache error: ", th);
        }
    }

    /* renamed from: a */
    public void m13412a(String str, String str2) {
        try {
            this.f20103a.edit().putString(str, str2).commit();
        } catch (Throwable th) {
            AbstractC2391y2.m13569a("PrefsCache error: ", th);
        }
    }

    /* renamed from: a */
    public void m13410a(long j) {
        m13411a("appGalleryTrackedTime", j);
    }

    /* renamed from: a */
    public void m13409a(int i) {
        m13411a("appSetIdScope", i);
    }
}
