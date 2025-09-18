package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: DC */
/* loaded from: classes.dex */
public final class C0202DC {

    /* renamed from: a */
    public final SharedPreferences f1887a;

    /* renamed from: b */
    public final C0786MU f1888b;

    /* renamed from: c */
    public final Object f1889c;

    /* renamed from: d */
    public S81 f1890d;

    /* renamed from: e */
    public boolean f1891e;

    /* renamed from: f */
    public Boolean f1892f;

    /* renamed from: g */
    public final S81 f1893g;

    public C0202DC(C0786MU c0786mu) {
        Object obj = new Object();
        this.f1889c = obj;
        this.f1890d = new S81();
        this.f1891e = false;
        this.f1893g = new S81();
        c0786mu.m5379a();
        Context context = c0786mu.f7174a;
        this.f1888b = c0786mu;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f1887a = sharedPreferences;
        Boolean boolValueOf = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        this.f1892f = boolValueOf == null ? m1589a(context) : boolValueOf;
        synchronized (obj) {
            try {
                if (m1590b()) {
                    this.f1890d.m7186d(null);
                    this.f1891e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final Boolean m1589a(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Boolean boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        if (boolValueOf == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
    }

    /* renamed from: b */
    public final synchronized boolean m1590b() {
        boolean zM5383j;
        Boolean bool = this.f1892f;
        if (bool != null) {
            zM5383j = bool.booleanValue();
        } else {
            try {
                zM5383j = this.f1888b.m5383j();
            } catch (IllegalStateException unused) {
                zM5383j = false;
            }
        }
        return zM5383j;
    }
}
