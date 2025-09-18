package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class q1 {
    private static volatile q1 b;
    private final SharedPreferences a;

    private q1(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public String a() {
        return c(AttributionReporter.APP_VERSION);
    }

    public long b() {
        return b("appGalleryTrackedTime");
    }

    public String c() {
        return c("appId");
    }

    public String d() {
        return c("appSetId");
    }

    public long e() {
        return b("appSetIdScope");
    }

    public String f() {
        return c("appVersionName");
    }

    public String g() {
        return c("appsHash");
    }

    public String h() {
        return c("attribution");
    }

    public String i() {
        return c("firebaseAppInstanceId");
    }

    public long j() {
        return b("installTimestamp");
    }

    public String k() {
        return c("instanceId");
    }

    public long l() {
        return b("lastUpdateTimestamp");
    }

    public String m() {
        return c("referrer");
    }

    public long n() {
        long jB = b("lastStopTimeStampSec");
        a("lastStopTimeStampSec", 0L);
        return jB;
    }

    public boolean o() {
        return a("apiReferrerSent");
    }

    public boolean p() {
        return a("huaweiApiReferrerSent");
    }

    public boolean q() {
        return a("preinstallRead");
    }

    public boolean r() {
        return a("referrerSent");
    }

    public void s() {
        a("apiReferrerSent", true);
    }

    public void t() {
        a("huaweiApiReferrerSent", true);
    }

    public void u() {
        a("preinstallRead", true);
    }

    public void v() {
        a("referrerSent", true);
    }

    public boolean a(String str) {
        try {
            return this.a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public long b(String str) {
        try {
            return this.a.getLong(str, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public String c(String str) {
        try {
            return this.a.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public void d(String str) {
        a(AttributionReporter.APP_VERSION, str);
    }

    public void e(String str) {
        a("appId", str);
    }

    public void f(String str) {
        a("appSetId", str);
    }

    public void g(String str) {
        a("appVersionName", str);
    }

    public void h(String str) {
        a("appsHash", str);
    }

    public void i(String str) {
        a("attribution", str);
    }

    public void j(String str) {
        a("firebaseAppInstanceId", str);
    }

    public void k(String str) {
        a("instanceId", str);
    }

    public void l(String str) {
        a("referrer", str);
    }

    public static q1 a(Context context) {
        q1 q1Var = b;
        if (q1Var == null) {
            synchronized (q1.class) {
                try {
                    q1Var = b;
                    if (q1Var == null) {
                        q1Var = new q1(context.getSharedPreferences("mytracker_prefs", 0));
                        b = q1Var;
                    }
                } finally {
                }
            }
        }
        return q1Var;
    }

    public void b(long j) {
        a("installTimestamp", j);
    }

    public void c(long j) {
        a("lastUpdateTimestamp", j);
    }

    public void d(long j) {
        a("lastStopTimeStampSec", j);
    }

    public void a(String str, boolean z) {
        try {
            this.a.edit().putBoolean(str, z).commit();
        } catch (Throwable th) {
            y2.a("PrefsCache error: ", th);
        }
    }

    public void a(String str, long j) {
        try {
            this.a.edit().putLong(str, j).commit();
        } catch (Throwable th) {
            y2.a("PrefsCache error: ", th);
        }
    }

    public void a(String str, String str2) {
        try {
            this.a.edit().putString(str, str2).commit();
        } catch (Throwable th) {
            y2.a("PrefsCache error: ", th);
        }
    }

    public void a(long j) {
        a("appGalleryTrackedTime", j);
    }

    public void a(int i) {
        a("appSetIdScope", i);
    }
}
